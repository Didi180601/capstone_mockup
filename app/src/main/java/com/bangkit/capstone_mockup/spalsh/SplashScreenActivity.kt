package com.bangkit.capstone_mockup.spalsh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bangkit.capstone_mockup.MainActivity
import com.bangkit.capstone_mockup.R
import com.bangkit.capstone_mockup.welcome.WelcomeActivity

class SplashScreenActivity : AppCompatActivity() {
    private val splashtimeout: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(mainLooper).postDelayed({
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        }, splashtimeout)
    }
}
