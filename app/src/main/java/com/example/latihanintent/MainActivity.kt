package com.example.latihanintent

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nimEt = findViewById<EditText>(R.id.nimEt)
        val namaEt = findViewById<EditText>(R.id.namaEt)
        val nilaiEt = findViewById<EditText>(R.id.nilaiEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        //handle button click
        saveBtn.setOnClickListener {
            //get text from edittexts
            val nim = nimEt.text.toString()
            val nama = namaEt.text.toString()
            val nilai = nilaiEt.text.toString()

            //intent to start activity
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai", nilai)
            startActivity(intent)

        }

    }
}