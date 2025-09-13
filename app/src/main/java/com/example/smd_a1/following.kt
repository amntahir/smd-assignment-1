package com.example.smd_a1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class following : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_following)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<TextView>(R.id.btnyou)?.setOnClickListener {
            startActivity(Intent(this, followingyou::class.java))
        }

        findViewById<ImageButton>(R.id.btnt1).setOnClickListener {
            startActivity(Intent(this, feed::class.java))
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
    }
}