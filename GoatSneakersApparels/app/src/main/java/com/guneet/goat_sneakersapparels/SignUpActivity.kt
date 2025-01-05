package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SignupActivity:  AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup) // Make sure the layout file is correctly set here

        firebaseAuth = FirebaseAuth.getInstance()

        // Find views by their IDs
        val signupButton = findViewById<Button>(R.id.btnSignUpAction)
        val emailInput = findViewById<EditText>(R.id.etEmailAddress1)
        val passwordInput = findViewById<EditText>(R.id.etPasswordField1)
//        val confirmPasswordInput = findViewById<EditText>(R.id.signupConfirm)
        val loginRedirectText = findViewById<TextView>(R.id.loginRedirectText1)

        signupButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
//            val confirmPassword = confirmPasswordInput.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, MyLoginActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }

        else {
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }

        loginRedirectText.setOnClickListener {
            val loginIntent = Intent(this, MyLoginActivity::class.java)
            startActivity(loginIntent)
        }
    }
}