package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
class OrdersProfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_prof)  // Layout file for WantsProfActivity
        val backArrow = findViewById<ImageView>(R.id.back_arrow1)
        backArrow.setOnClickListener {
            // Finish the current activity and go back to ProfileActivity
            finish()
        }
    }


}