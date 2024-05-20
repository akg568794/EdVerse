package com.thakursa.nerdo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val medbut=findViewById<Button>(R.id.medbut)
        medbut.setOnClickListener({
            val packageName = "com.JB.Human_Body"
            val launchIntent = packageManager.getLaunchIntentForPackage(packageName)

            if (launchIntent != null) {
                val chooserIntent = Intent.createChooser(launchIntent, "Open with")
                chooserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(chooserIntent)
            } else {
                // Handle the case where the intent is null, meaning the app is not installed
                // or some other issue occurred.
            }

        })
        val psybut=findViewById<Button>(R.id.psybut)
        psybut.setOnClickListener({
            val packageName = "com.VirtualEdx.Code4Cause"
            val launchIntent = packageManager.getLaunchIntentForPackage(packageName)

            if (launchIntent != null) {
                val chooserIntent = Intent.createChooser(launchIntent, "Open with")
                chooserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(chooserIntent)
            } else {
                // Handle the case where the intent is null, meaning the app is not installed
                // or some other issue occurred.
            }

        })
        val vocbut=findViewById<Button>(R.id.vocbut)
        vocbut.setOnClickListener({
            intent= Intent(this,VocationalActivity::class.java)
            startActivity(intent)
        })
        val comm=findViewById<Button>(R.id.commbut)
        comm.setOnClickListener({
            intent= Intent(this,CommunicationActivity::class.java)
            startActivity(intent)
        })
        val sad=findViewById<Button>(R.id.sadbut)
        sad.setOnClickListener({
            intent= Intent(this,SkillDevelopmentActivity::class.java)
            startActivity(intent)
        })
        val des=findViewById<Button>(R.id.desbut)
        des.setOnClickListener({
            intent= Intent(this,GDactivity::class.java)
            startActivity(intent)
        })
    }
}