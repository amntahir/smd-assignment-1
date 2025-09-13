package com.example.smd_a1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class feed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feed)

        val root = findViewById<View?>(R.id.main)
        root?.let {
            ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
                insets
            }
        }


        findViewById<ImageButton>(R.id.btnt2).setOnClickListener {
            startActivity(Intent(this, feedpage::class.java))
        }
        findViewById<ImageButton>(R.id.btnt3).setOnClickListener {
            startActivity(Intent(this, gallery::class.java))
        }
        findViewById<ImageButton>(R.id.btnt5).setOnClickListener {
            startActivity(Intent(this, instaprof::class.java))
        }

        findViewById<ImageButton>(R.id.btnt4).setOnClickListener {
            startActivity(Intent(this, following::class.java))
        }

        findViewById<ImageButton>(R.id.btnshare).setOnClickListener {
            startActivity(Intent(this, jacob_wSearch::class.java))
        }
        findViewById<ImageView>(R.id.btnoval).setOnClickListener {
            startActivity(Intent(this, addingstory::class.java))
        }
        findViewById<ImageView>(R.id.btnoval4).setOnClickListener {
            startActivity(Intent(this, viewstory::class.java))
        }
    }
}
