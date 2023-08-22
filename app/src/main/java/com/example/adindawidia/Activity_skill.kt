package com.example.adindawidia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_skill : AppCompatActivity() {

    lateinit var SkillView: RecyclerView
    lateinit var SkillAdapter: SkillAdapter
    val list = ArrayList<SkillData>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        SkillView = findViewById(R.id.rvSkill)
        SkillView.layoutManager = LinearLayoutManager(this)

        list.add(SkillData("kotlin", "Pemrograman android"))
        list.add(SkillData("Laravel", "Pemrograman Web"))
        list.add(SkillData("kotlin", "Pemrograman android"))
        list.add(SkillData("Laravel", "Pemrograman Web"))
        list.add(SkillData("kotlin", "Pemrograman android"))
        list.add(SkillData("Laravel", "Pemrograman Web"))

        SkillAdapter = SkillAdapter(list)
        SkillView.adapter = SkillAdapter
    }
}