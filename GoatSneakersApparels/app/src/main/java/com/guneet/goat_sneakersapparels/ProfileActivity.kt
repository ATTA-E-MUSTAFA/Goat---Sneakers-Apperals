package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile) // Assuming 'profile.xml' is your profile layout

        // Handle Settings button click
        val settingsButton = findViewById<TextView>(R.id.settings_button1)
        settingsButton.setOnClickListener {
            // Navigate to SettingsActivity when the Settings button is clicked
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
