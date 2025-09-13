// feedpage.kt
package com.example.smd_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class feedpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedpage)

        val root = findViewById<View>(R.id.main) ?: window.decorView
        ViewCompat.setOnApplyWindowInsetsListener(root) { v, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }
        findViewById<ImageView>(R.id.btnt1).setOnClickListener {
            startActivity(Intent(this, feed::class.java))
        }
        findViewById<ImageView>(R.id.btnt3).setOnClickListener {
            startActivity(Intent(this, gallery::class.java))
        }

        findViewById<ImageView>(R.id.btnt5).setOnClickListener {
            startActivity(Intent(this, instaprof::class.java))
        }

        findViewById<ImageButton>(R.id.btnt4).setOnClickListener {
            startActivity(Intent(this, following::class.java))
        }
        // feedpage.kt
        findViewById<android.widget.TextView>(R.id.searchBox).setOnClickListener {
            startActivity(Intent(this, internshala::class.java))
        }


    }
}
