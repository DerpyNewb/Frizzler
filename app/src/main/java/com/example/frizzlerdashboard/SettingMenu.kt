package com.example.frizzlerdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_menu)

        val Hbutton = findViewById<Button>(R.id.Homebtn)
        val Sbutton = findViewById<Button>(R.id.Searchbtn)
        val Fbutton = findViewById<Button>(R.id.Fridgebtn)


        Sbutton.setOnClickListener {
            val intent = Intent(this, SearchMenu::class.java)
            startActivity(intent)
        }
        Fbutton.setOnClickListener {
            val intent = Intent(this, FridgeMenu::class.java)
            startActivity(intent)
        }
        Hbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}