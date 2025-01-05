package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout

class SellActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sell)  // Attach the sell.xml layout

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

        // Sell Button - Already in SellActivity, no need to navigate
        val sellTab = findViewById<LinearLayout>(R.id.sell_id)
        sellTab.setOnClickListener {
            // Do nothing or refresh activity, as you are already in SellActivity
        }

        // Profile Button
        val profileTab = findViewById<LinearLayout>(R.id.profile)
        profileTab.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
