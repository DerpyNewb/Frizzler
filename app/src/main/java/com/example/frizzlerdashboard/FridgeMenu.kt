package com.example.frizzlerdashboard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentManager
import com.example.frizzlerdashboard.databinding.ActivityFridgeMenuBinding
import com.example.frizzlerdashboard.databinding.ActivityMainBinding

class FridgeMenu : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityFridgeMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFridgeMenuBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_fridge_menu)
        setContentView(binding.root)

        binding.buttonFragment1.setOnClickListener {
            goToFragment(FridgeFragment1())
        }

        binding.buttonFragment2.setOnClickListener {
            goToFragment(FridgeFragment2())
        }

        val Hbutton = findViewById<Button>(R.id.Homebtn)
        val Sbutton = findViewById<Button>(R.id.Searchbtn)
        val Sebutton = findViewById<Button>(R.id.Settingbtn)


        Sbutton.setOnClickListener {
            val intent = Intent(this, SearchMenu::class.java)
            startActivity(intent)
        }
        Sebutton.setOnClickListener {
            val intent = Intent(this, SettingMenu::class.java)
            startActivity(intent)
        }
        Hbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, fragment).commit()
    }
}