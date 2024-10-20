package com.guneet.goat_sneakersapparels

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile) // Assuming 'user_profile.xml' is your layout

        // Handle back button click
        val backButton = findViewById<ImageButton>(R.id.back_button)
        backButton.setOnClickListener {
            finish() // This will close the UserProfileActivity and return to the previous screen
        }

        // You can also add click listeners for other profile fields here
        // For example:
        // val changePasswordLayout = findViewById<LinearLayout>(R.id.passwordLayout)
        // changePasswordLayout.setOnClickListener {
        //     // Handle password change
        // }
    }
}
