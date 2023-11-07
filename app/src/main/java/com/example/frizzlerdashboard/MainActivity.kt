package com.example.frizzlerdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Sbutton = findViewById<Button>(R.id.Searchbtn)
        val Fbutton = findViewById<Button>(R.id.Fridgebtn)
        val Sebutton = findViewById<Button>(R.id.Settingbtn)

        Sbutton.setOnClickListener {
            val intent = Intent(this, SearchMenu::class.java)
            startActivity(intent)
        }
        Fbutton.setOnClickListener {
            val intent = Intent(this, FridgeMenu::class.java)
            startActivity(intent)
        }
        Sebutton.setOnClickListener {
            val intent = Intent(this, SettingMenu::class.java)
            startActivity(intent)
        }
    }
}