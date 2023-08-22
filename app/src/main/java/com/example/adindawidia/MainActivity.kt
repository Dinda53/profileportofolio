package com.example.adindawidia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfile : CardView = findViewById(R.id.Profile)
        val btnPortofolio : CardView = findViewById(R.id.Portofolio)
        val btnSkill : CardView = findViewById(R.id.Skill)
        val btnEducation : CardView = findViewById(R.id.Education)
        val btnHobby : CardView = findViewById(R.id.Hobby)


        btnProfile.setOnClickListener {
           val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        btnPortofolio.setOnClickListener {
            val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)
        }

        btnSkill.setOnClickListener {
            val intent = Intent(this, Activity_skill::class.java)
            startActivity(intent)
        }

        btnEducation.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnHobby.setOnClickListener {
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
        }

    }
}