package com.dedi.aplikasitimeshalat

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    internal lateinit var rellay_jadwal: RelativeLayout //rellay_jadwal
    internal lateinit var rellay_halal: RelativeLayout //rellay_halal
    internal lateinit var rellay_asmaulhusna: RelativeLayout //rellay_asmaulhusna


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rellay_jadwal = findViewById(R.id.rellay_jadwal)
        rellay_halal = findViewById(R.id.rellay_halal)
        rellay_asmaulhusna= findViewById(R.id.rellay_asmaulHusna)


        rellay_jadwal.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_Jadwal::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
        rellay_halal.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_Halal::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

        rellay_asmaulhusna.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityAsmaulHusna::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)

        }
    }
}