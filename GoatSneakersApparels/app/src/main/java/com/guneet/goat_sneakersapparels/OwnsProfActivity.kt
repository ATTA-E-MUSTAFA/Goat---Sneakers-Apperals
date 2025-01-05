package com.guneet.goat_sneakersapparels

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class OwnsProfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.owns_prof)  // Layout file for OwnsProfActivity

        // Initialize back arrow to navigate back
        val backArrow = findViewById<ImageView>(R.id.back_arrow12)
        backArrow.setOnClickListener {
            // Finish the current activity and go back to ProfileActivity
            finish()
        }

        // Initialize buttons for navigation
        val allButton = findViewById<Button>(R.id.all_button1)
        val sneakersButton = findViewById<Button>(R.id.sneakers_button1)
        val apparelButton = findViewById<Button>(R.id.apparel_button1)
        val accessoriesButton = findViewById<Button>(R.id.accessories_button1)

        // Load the default fragment (e.g., AllFragment) when the activity starts
        loadFragment(AllFragment())

        // Set click listeners to load each fragment when its corresponding button is clicked
        allButton.setOnClickListener {
            loadFragment(AllFragment())
        }

        sneakersButton.setOnClickListener {
            loadFragment(SneakersFragment())
        }

        apparelButton.setOnClickListener {
            loadFragment(ApparelFragment())
        }

        accessoriesButton.setOnClickListener {
            loadFragment(AccessoriesFragment())
        }
    }

    // Function to load the selected fragment into fragment_container1
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container1, fragment)
            .commit()
    }
}
