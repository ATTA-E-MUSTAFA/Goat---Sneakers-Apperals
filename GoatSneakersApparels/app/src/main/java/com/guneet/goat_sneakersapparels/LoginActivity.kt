package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_user)  // Set the content view to login_user.xml

        // Handle login button click (you can add actual login functionality here)
        val loginButton = findViewById<Button>(R.id.btnLogin)
        loginButton.setOnClickListener {
            // Perform login logic (not implemented here)
        }

        // Handle "Sign Up" text click to navigate to the SignUpActivity
        val signUpText = findViewById<TextView>(R.id.tvSignUp)
        signUpText.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
