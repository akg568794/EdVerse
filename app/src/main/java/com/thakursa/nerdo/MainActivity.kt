package com.thakursa.nerdo

import android.content.Intent
import android.os.Bundle
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
            intent= Intent(this,MedicalActivity::class.java)
            startActivity(intent)
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