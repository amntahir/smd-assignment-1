package com.example.smd_a1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class instaprof : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instaprof)

        val root = findViewById<View>(R.id.main) ?: window.decorView
        ViewCompat.setOnApplyWindowInsetsListener(root) { v, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }

        findViewById<TextView>(R.id.editing).setOnClickListener {
            startActivity(Intent(this, editprofile::class.java))
        }

        findViewById<ImageView>(R.id.btnt1).setOnClickListener {
            startActivity(Intent(this, feed::class.java))
        }
        findViewById<ImageView>(R.id.btnt2).setOnClickListener {
            startActivity(Intent(this, feedpage::class.java))
        }
        findViewById<ImageView>(R.id.btnt3).setOnClickListener {
            startActivity(Intent(this, gallery::class.java))
        }
        findViewById<ImageView>(R.id.btnt4).setOnClickListener {
            startActivity(Intent(this, following::class.java))
        }




        findViewById<ImageView>(R.id.picture31).setOnClickListener {
            startActivity(Intent(this, highlight::class.java))
        }

    }
}
