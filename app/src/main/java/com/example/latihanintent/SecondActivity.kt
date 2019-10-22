package com.example.latihanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //get data from intent
        val intent = intent
        val nim = intent.getStringExtra("Nim")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")

        //textview
        val resultTv = findViewById<TextView>(R.id.et_output)
        //setText
        resultTv.text = "Nim    : "+nim+"\nNama: "+nama+"\nNilai   : "+nilai

    }
}