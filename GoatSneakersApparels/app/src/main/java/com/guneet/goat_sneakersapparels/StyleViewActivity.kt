package com.guneet.goat_sneakersapparels

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.guneet.goat_sneakersapparels.R

class StyleViewActivity<ImageView> : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_styles)  // Make sure this matches your XML layout name
        // Image Views
        val image1: ImageView = findViewById(R.id.image_1)
        val image2: ImageView = findViewById(R.id.image_2)
        val image3: ImageView = findViewById(R.id.image_3)
        val image4: ImageView = findViewById(R.id.image_4)
        val image5: ImageView = findViewById(R.id.image_5)
        val image6: ImageView = findViewById(R.id.image_6)
//
//// Set OnClickListener for each image
//        image1.setOnClickListener {
//            // Intent to navigate to AddToCartActivity
//            val intent = Intent(this@StyleViewActivity, AddtocartActivity::class.java)
//            startActivity(intent)
//        }
//
//        image2.setOnClickListener {
//            // Intent to navigate to AddToCartActivity
//            val intent = Intent(this@StyleViewActivity, AddtocartActivity::class.java)
//            startActivity(intent)
//        }
//
//        image3.setOnClickListener {
//            // Intent to navigate to AddToCartActivity
//            val intent = Intent(this@StyleViewActivity, AddtocartActivity::class.java)
//            startActivity(intent)
//        }
//
//        image4.setOnClickListener {
//            // Intent to navigate to AddToCartActivity
//            val intent = Intent(this@StyleViewActivity, AddtocartActivity::class.java)
//            startActivity(intent)
//        }
//
//        image5.setOnClickListener {
//            // Intent to navigate to AddToCartActivity
//            val intent = Intent(this@StyleViewActivity, AddtocartActivity::class.java)
//            startActivity(intent)
//        }
//
//        image6.setOnClickListener {
//            // Intent to navigate to AddToCartActivity
//            val intent = Intent(this@MainActivity, AddtocartActivity::class.java)
//            startActivity(intent)
//        }

    }
}
