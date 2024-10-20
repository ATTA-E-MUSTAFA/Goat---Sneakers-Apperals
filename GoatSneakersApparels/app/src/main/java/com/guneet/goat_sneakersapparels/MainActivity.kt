package com.guneet.goat_sneakersapparels
import com.guneet.goat_sneakersapparels.ProfileActivity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)  // Set the content view to home.xml

        // Profile button (bottom navigation)
        val profileButton = findViewById<LinearLayout>(R.id.profile)
        profileButton.setOnClickListener {
            // Navigate to ProfileActivity
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        val searchButton = findViewById<LinearLayout>(R.id.bottomNav).findViewById<LinearLayout>(R.id.search)
        searchButton.setOnClickListener {
            // Navigate to SearchEngineActivity
            val intent = Intent(this, SearchEngineActivity::class.java)
            startActivity(intent)
        }
    }
}
