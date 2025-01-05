//package com.guneet.goat_sneakersapparels
//import com.guneet.goat_sneakersapparels.ProfileActivity
//
//import android.annotation.SuppressLint
//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import android.widget.LinearLayout
//
//class MainActivity : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.home)  // Set the content view to home.xml
//
////         Profile button (bottom navigation)
//        val profileButton = findViewById<LinearLayout>(R.id.profile)
//        profileButton.setOnClickListener {
//            // Navigate to ProfileActivity
//            val intent = Intent(this, ProfileActivity::class.java)
//            startActivity(intent)
//        }
//        val searchButton = findViewById<LinearLayout>(R.id.bottomNav).findViewById<LinearLayout>(R.id.search_id)
//        searchButton.setOnClickListener {
//            // Navigate to SearchEngineActivity
//            val intent = Intent(this, SearchEngineActivity::class.java)
//            startActivity(intent)
//        }
//
//    }
//}

package com.guneet.goat_sneakersapparels
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homee)  // Your main layout file
        val styleOption = findViewById<LinearLayout>(R.id.styleOption2)
        val tvBrowse = findViewById<TextView>(R.id.tvBrowse2) // Find tvBrowse TextView by ID
        val imgModels: ImageView = findViewById(R.id.imgModels2)
        val imgSkateItems: ImageView = findViewById(R.id.imgSkateItems2)
        val additionalImage1: ImageView = findViewById(R.id.additional_image_22)
        val additionalImage2: ImageView = findViewById(R.id.additional_image_2)
// Initialize Firebase Auth
        tvBrowse.setOnClickListener {
            val intent = Intent(this, SearchEngineActivity::class.java)
            startActivity(intent)
        }
        // Set click listener for "Discover Your Style" to go to StyleActivity
        styleOption.setOnClickListener {
            val intent = Intent(this, StyleActivity::class.java) // Replace with your actual StyleActivity class
            startActivity(intent)
        }
        imgModels.setOnClickListener {
            navigateToAddToCart()
        }

        imgSkateItems.setOnClickListener {
            navigateToAddToCart()
        }

        additionalImage1.setOnClickListener {
            navigateToAddToCart()
        }

        additionalImage2.setOnClickListener {
            navigateToAddToCart()
        }
        // Set click listener for "Login" button to go to LoginActivity

        // Home Button - Already in MainActivity, no need to navigate
        val homeTab = findViewById<LinearLayout>(R.id.home_id)
        homeTab.setOnClickListener {
            // Do nothing or refresh activity, as you are already in MainActivity
        }

//
//        // Styles Button
        val stylesTab = findViewById<LinearLayout>(R.id.styles_id)
        stylesTab.setOnClickListener {
            val intent = Intent(this, StyleActivity::class.java)
            startActivity(intent)
        }
//
        // Search Button
        val searchTab = findViewById<LinearLayout>(R.id.search_id)
        searchTab.setOnClickListener {
            val intent = Intent(this, SearchEngineActivity::class.java)
            startActivity(intent)
        }
//        val loginButton = findViewById<Button>(R.id.loginButton)
//        loginButton.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)  // Start the LoginActivity
//        }
        // Sell Button
        val sellTab = findViewById<LinearLayout>(R.id.sell_id)
        sellTab.setOnClickListener {
            val intent = Intent(this, SellActivity::class.java)
            startActivity(intent)
        }

        // Profile Button
        val profileTab = findViewById<LinearLayout>(R.id.profile)
        profileTab.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
    fun navigateToStyleNav(view: View) {
        val intent = Intent(this, StyleActivity::class.java) // Replace StyleNavActivity with your actual activity class
        startActivity(intent)
    }
    private fun navigateToAddToCart() {
        val intent = Intent(this@HomeActivity, AddtocartActivity::class.java)
        startActivity(intent)
    }
}

