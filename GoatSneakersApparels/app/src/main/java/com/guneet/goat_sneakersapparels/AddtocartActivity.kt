package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddtocartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_to_cart)

        // Find the button by ID
        val addToCartButton: Button = findViewById(R.id.addToCartButton)

        // Set up the click listener for the button
        addToCartButton.setOnClickListener {
            // Create an intent to navigate to the HomeActivity
            val intent = Intent(this@AddtocartActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}