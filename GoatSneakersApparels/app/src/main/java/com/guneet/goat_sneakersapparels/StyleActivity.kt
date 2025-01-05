package com.guneet.goat_sneakersapparels
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import android.graphics.drawable.Drawable
import com.bumptech.glide.load.DataSource

class StyleActivity : AppCompatActivity() {


    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.style_nav)  // Your layout file for StyleActivity
// Initialize Firebase database reference
        database = FirebaseDatabase.getInstance().getReference("products")

        // Fetch product data and display it in the first HorizontalScrollView
        fetchProductData()
        // Home Button
        val homeTab = findViewById<LinearLayout>(R.id.home_id)
        homeTab.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val viewAllText = findViewById<TextView>(R.id.viewAllText1234)

        // Set a click listener to navigate to StyleViewActivity
        viewAllText.setOnClickListener {
            val intent = Intent(this, StyleViewActivity::class.java)
            startActivity(intent)
        }
        // Styles Button - Already in StylesActivity, no need to navigate
        val stylesTab = findViewById<LinearLayout>(R.id.styles_id)
        stylesTab.setOnClickListener {
            // Do nothing or refresh activity, as you are already in StylesActivity
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

        // Profile Button
        val profileTab = findViewById<LinearLayout>(R.id.profile)
        profileTab.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
    private fun fetchProductData() {
        // Get references to the LinearLayouts for both categories
        val firstScrollLinearLayout: LinearLayout = findViewById(R.id.firstScrollLinearLayout) // For Apparels
        val secondScrollLinearLayout: LinearLayout = findViewById(R.id.secondScrollLinearLayout) // For Sneakers

        // Fetch data from Firebase Realtime Database
        database.get().addOnSuccessListener { snapshot ->
            if (snapshot.exists()) {
                // Iterate through each product item
                for (productSnapshot in snapshot.children) {
                    // Get product object data
                    val product = productSnapshot.getValue(Product::class.java)
                    product?.let {
                        Log.d("Product Data", "Image URL: ${it.Image}, Category: ${it.Category}")

                        // Create a new ImageView for each product image
                        val imageView = ImageView(this)
                        imageView.layoutParams = LinearLayout.LayoutParams(
                            200, 300
                        ).apply {
                            setMargins(8, 0, 8, 0)  // Add some margin between images
                        }

                        // Load image using Glide
                        Glide.with(this)
                            .load(it.Image)  // Your image URL or path here
                            .listener(object : RequestListener<Drawable> {
                                override fun onLoadFailed(
                                    e: GlideException?,
                                    model: Any?,
                                    target: Target<Drawable>?,
                                    isFirstResource: Boolean
                                ): Boolean {
                                    Log.e("Glide", "Image failed to load", e)
                                    return false // Allow the error to propagate
                                }

                                override fun onResourceReady(
                                    resource: Drawable?,
                                    model: Any?,
                                    target: Target<Drawable>?,
                                    dataSource: DataSource?,
                                    isFirstResource: Boolean
                                ): Boolean {
                                    Log.d("Glide", "Image loaded successfully")
                                    return false // Allow Glide to handle the resource
                                }
                            })
                            .into(imageView)

                        // Set a click listener for the dynamically created imageView
                        imageView.setOnClickListener {
                            // Navigate to the AddToCartActivity with the product details
                            val intent = Intent(this, AddtocartActivity::class.java)
                            startActivity(intent)
                        }

                        // Check the category of the product and add it to the respective LinearLayout
                        when (it.Category.lowercase()) {
                            "apperals" -> {
                                // Add to the first scroll view (Apparels)
                                firstScrollLinearLayout.addView(imageView)
                            }
                            "sneakers" -> {
                                // Add to the second scroll view (Sneakers)
                                secondScrollLinearLayout.addView(imageView)
                            }
                            else -> {
                                // Handle products with categories other than "apparels" and "sneakers" (optional)
                            }
                        }
                    }
                }
            } else {
                Toast.makeText(this, "No products found", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            Toast.makeText(this, "Failed to load data", Toast.LENGTH_SHORT).show()
        }
    }

}
