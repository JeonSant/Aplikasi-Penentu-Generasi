package com.example.aplikasipertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi komponen
        var edTanggalLahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        var btnKlik = findViewById<Button>(R.id.btn_klik)
        var tvHasil = findViewById<TextView>(R.id.tv_hasil)

        /* ketika tombol ditekan, ambil input yang dimasukkan user
            cek user termasuk generasi apa
        * */
        btnKlik.setOnClickListener {
            // ubah input ke string lalu simpan dalam variabel input
            val input = edTanggalLahir.text.toString()
            // ubah input ke angka, lakukan pengecekkan user masuk generasi apa
            val hasil = when(input.toInt()) {
                in 1946..1964 -> "Baby boomer"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Z"
                else -> {"Gak tau mas"}
            }
            // tampilkan hasilnya
            tvHasil.text = "Kamu generasi $hasil"
        }

    }
}