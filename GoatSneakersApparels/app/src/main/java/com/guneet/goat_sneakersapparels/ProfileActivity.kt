package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)  // Assuming 'profile.xml' is your profile layout

        // Handle Settings button click
        val settingsButton = findViewById<TextView>(R.id.settings_button1)
        settingsButton.setOnClickListener {
            // Navigate to SettingsActivity when the Settings button is clicked
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        // Home Button
        val homeTab = findViewById<LinearLayout>(R.id.home_id)
        homeTab.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Styles Button
        val stylesTab = findViewById<LinearLayout>(R.id.styles_id)
        stylesTab.setOnClickListener {
            val intent = Intent(this, StyleActivity::class.java)
            startActivity(intent)
        }

        // Search Button
        val searchTab = findViewById<LinearLayout>(R.id.search_id)
        searchTab.setOnClickListener {
            val intent = Intent(this, SearchEngineActivity::class.java)
            startActivity(intent)
        }

        // Sell Button
        val sellTab = findViewById<LinearLayout>(R.id.sell_id)
        sellTab.setOnClickListener {
            val intent = Intent(this, SellActivity::class.java)
            startActivity(intent)
        }

        // Profile Button - Already in ProfileActivity, no need to navigate
        val profileTab = findViewById<LinearLayout>(R.id.profile)
        profileTab.setOnClickListener {
            // Do nothing or refresh activity, as you are already in ProfileActivity
        }

        // Wants Button
        val wantsButton = findViewById<TextView>(R.id.wants_button)
        wantsButton.setOnClickListener {
            val intent = Intent(this, WantsProfActivity::class.java)
            startActivity(intent)
        }

        // Offers Button
        val offersButton = findViewById<TextView>(R.id.offers_button)
        offersButton.setOnClickListener {
            val intent = Intent(this, OffersProfActivity::class.java)
            startActivity(intent)
        }

        // Owns Button
        val ownsButton = findViewById<TextView>(R.id.owns_button)
        ownsButton.setOnClickListener {
            val intent = Intent(this, OwnsProfActivity::class.java)
            startActivity(intent)
        }

        // Orders Button
        val ordersButton = findViewById<TextView>(R.id.orders_button)
        ordersButton.setOnClickListener {
            val intent = Intent(this, OrdersProfActivity::class.java)
            startActivity(intent)
        }
    }
}
