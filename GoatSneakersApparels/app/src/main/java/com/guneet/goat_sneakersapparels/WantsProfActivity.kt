package com.guneet.goat_sneakersapparels

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class WantsProfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wants_prof)  // Layout file for WantsProfActivity

        // Initialize buttons
        val allButton = findViewById<Button>(R.id.all_button1)
        val sneakersButton = findViewById<Button>(R.id.sneakers_button1)
        val apparelButton = findViewById<Button>(R.id.apparel_button1)
        val accessoriesButton = findViewById<Button>(R.id.accessories_button1)

        // Load default fragment (e.g., AllFragment)
        loadFragment(AllFragment())

        // Set up navigation to AllFragment
        allButton.setOnClickListener {
            loadFragment(AllFragment())
        }

        // Set up navigation to SneakersFragment
        sneakersButton.setOnClickListener {
            loadFragment(SneakersFragment())
        }

        // Set up navigation to ApparelFragment
        apparelButton.setOnClickListener {
            loadFragment(ApparelFragment())
        }

        // Set up navigation to AccessoriesFragment
        accessoriesButton.setOnClickListener {
            loadFragment(AccessoriesFragment())
        }
    }

    // Function to load the selected fragment
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container1, fragment)
            .commit()
    }
}
