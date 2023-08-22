package com.example.adindawidia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rveducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("TK Islam Siti Sulaechah 2A", "Perumahan Pondok Raden Patah Blok F/16 "))
        list.add(SchoolData("SD Islam Siti Sulaechah 2", "Perumahan Pondok Raden Patah"))
        list.add(SchoolData("SMP N 1 SAYUNG", "Jalan Raya Sayung No. 33 Purwosari, Kec. Sayung Kab Demak"))
        list.add(SchoolData("SMK N 1 SAYUNG", " JL. RAYA SEMARANG DEMAK KM 14  ONGGORAWE KEC. SAYUNG Kab Demak"))



        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter
    }
}