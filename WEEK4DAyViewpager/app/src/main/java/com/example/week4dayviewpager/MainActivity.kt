package com.example.week4dayviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pagerMain = findViewById<FrameLayout>(R.id.pagerMain)
        var btnpagerone = findViewById<Button>(R.id.btnPager1)
        var btnpagertwo = findViewById<Button>(R.id.btnpager2)
        var btnpage3 = findViewById<Button>(R.id.btnpager3)
        var afragment = HomeFragment()
        var bfragment = ProfileFragment()
        var cfragment = ExploreFragment()


        btnpagerone.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.pagerMain, afragment)
                .commit()
        }

        btnpagertwo.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.pagerMain, bfragment)
                .commit()
        }
        btnpage3.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.pagerMain, cfragment)
                .commit()
        }
        pagerMain.adapter=Adapter(supportFragmentManager)
    }


}


