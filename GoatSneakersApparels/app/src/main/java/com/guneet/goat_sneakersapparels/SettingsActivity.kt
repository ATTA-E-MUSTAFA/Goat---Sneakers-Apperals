package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings) // Assuming 'settings.xml' is your settings layout

        // Handle Close button click (to finish the settings screen)
        val closeButton = findViewById<ImageButton>(R.id.close_button)
        closeButton.setOnClickListener {
            finish() // This will close the SettingsActivity and return to the previous screen
        }

        // Navigate to UserProfileActivity when the "Profile" option is clicked
        val profileLayout = findViewById<LinearLayout>(R.id.profileLayout) // Assuming this is the ID of the profile layout in settings.xml
        profileLayout.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
