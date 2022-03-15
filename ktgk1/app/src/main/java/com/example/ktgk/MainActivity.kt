package com.example.ktgk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var ten : TextView = findViewById(R.id.tenn)

        var email : TextView = findViewById(R.id.emaill)

        var sdt : TextView = findViewById(R.id.sdtt)


       var account:account = intent.getParcelableExtra("account")!!

        ten.text = account.ten
        email.text = account.email
        sdt.text = account.sdt

        val list  = listOf<String>("Ha Noi","Vienna","Brussels","Mexico City","Oslo","Pyongyang","Belijing","Moscow","Budapest","Nairobi","Tokyo","Denver","Helsinki","Berlin")

        var recyclerView : RecyclerView = findViewById(R.id.recycleview)

        var adapter : adapter = adapter(list,this)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        recyclerView.adapter = adapter

    }
}