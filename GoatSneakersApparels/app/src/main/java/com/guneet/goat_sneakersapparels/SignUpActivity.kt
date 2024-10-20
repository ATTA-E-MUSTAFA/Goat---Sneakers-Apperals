package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_user)  // Set the content view to signup_user.xml

        // Handle sign up button click (you can add actual signup functionality here)
        val signUpButton = findViewById<Button>(R.id.btnSignUpAction)
        signUpButton.setOnClickListener {
            // Perform sign up logic (not implemented here)
        }

        // Handle "Close" button click to navigate back to the LoginActivity
        val closeButton = findViewById<TextView>(R.id.tvCloseButton)
        closeButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
