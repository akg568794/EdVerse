package com.thakursa.nerdo
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val logo=findViewById<ImageView>(R.id.logo)
        setContentView(R.layout.activity_splash)
//        val animation: Animation = AnimationUtils.loadAnimation(
//            this , R.anim.zoomanim)
//        logo.startAnimation(animation)
//        YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(logo)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            var item = Intent(this, LoginActivity::class.java)
            startActivity(item)

            finish()
        },5000)
        val song :MediaPlayer=MediaPlayer.create(this,R.raw.woosh)
        song.start()

    }
}