package com.example.ktgk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var login : Button = findViewById(R.id.login)


        var ten : TextView = findViewById(R.id.ten)

        var email : TextView = findViewById(R.id.email)

        var sdt : TextView = findViewById(R.id.sdt)

        login.setOnClickListener {

            var intent  = Intent(this,MainActivity::class.java)

            intent.putExtra("account",account(ten.text.toString(),email.text.toString(),sdt.text.toString()))
            startActivity(intent)

        }


    }
}