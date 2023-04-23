package com.example.smilelens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomePageActivity : AppCompatActivity() {
    private lateinit var viewBinding: HomePageActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val startButton = findViewById<Button>(R.id.beginButton)
        startButton.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent);

            Toast.makeText(this, "Record something around you that is making you happy!",Toast.LENGTH_SHORT).show()
        }


    }


}