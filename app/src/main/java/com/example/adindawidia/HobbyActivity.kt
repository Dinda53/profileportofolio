package com.example.adindawidia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {

    lateinit var hobbyView: RecyclerView
    lateinit var hobbyAdapter: HobbyAdapter
    var list = ArrayList<HobbyData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyView = findViewById(R.id.rvHobby)
        hobbyView.layoutManager = LinearLayoutManager(this)

        list.add(HobbyData("Nonton","Menonton Film"))
        list.add(HobbyData("Masak","Memasak Makanan,Roti"))
        list.add(HobbyData("Membaca","Cuma Membaca Jenis Buku-Buku Tertentu"))
        list.add(HobbyData("Mewarnai","Mewarnai gambar-gambar aneh "))
        list.add(HobbyData("Menulis","Nulis Apapun"))
        list.add(HobbyData("Olahraga","Tentang Olahraga Semua Suka"))



        hobbyAdapter = HobbyAdapter(list)
        hobbyView.adapter = hobbyAdapter

    }
}