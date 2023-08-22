package com.example.adindawidia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var portfolioView:RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(PortofolioData(
            R.drawable.web, "pendaftaran-siswa",
            "aplikasi pendaftaran siswa","https://github.com/Dinda53/pendaftaran-siswa"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.android, "profil-guru",
            "project membuat profil guru","https://github.com/Dinda53/profil-guru"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "project-berita",
            "project  membuat portal berita menggunakan ci","https://github.com/Dinda53/project-berita"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.android, "ujianpraktik",
            "project ujian praktek","https://github.com/Dinda53/ujianpraktik"
        ))


        portfolioView = findViewById(R.id.rvPortofolio)
        portfolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portfolioView.adapter = portofolioAdapter
    }
}