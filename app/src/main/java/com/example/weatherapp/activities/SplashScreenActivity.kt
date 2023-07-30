package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.weatherapp.activities.MainActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var SplashScreenImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        SplashScreenImage=findViewById(R.id.SplashScreenImage)

        // Load the animation from the XML resource
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        // Set up an animation listener to handle events
        fadeInAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                // Animation start event
            }

            override fun onAnimationEnd(animation: Animation?) {
                // Animation end event
                SplashScreenImage.visibility = View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {
                // Animation repeat event
            }
        })

        // Apply the animation to the view
        SplashScreenImage.startAnimation(fadeInAnimation)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 3000 is the delayed time in milliseconds.

    }
}