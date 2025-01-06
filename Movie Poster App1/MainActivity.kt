package com.example.kotlin_1

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var movie = arrayOf("라라랜드", "스즈메의 문단속", "노트북",
            "위대한쇼맨", "엘리멘탈")

        var posterID = arrayOf(R.drawable.movie1, R.drawable.movie2,
            R.drawable.movie3, R.drawable.movie4, R.drawable.movie5)

        var spinner = findViewById<Spinner>(R.id.spinner1)

        var adapter: ArrayAdapter<String>
        adapter = ArrayAdapter(this,  android.R.layout.simple_spinner_item, movie)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(arg0: AdapterView<*>, arg1: View, arg2: Int, arg3: Long) {

                var ivPoster = findViewById<ImageView>(R.id.ivPoster)
                ivPoster.scaleType = ImageView.ScaleType.FIT_CENTER
                ivPoster.setPadding(5, 5, 5, 5)
                ivPoster.setImageResource(posterID[arg2])
            }

            override fun onNothingSelected(arg0: AdapterView<*>) {

            }

        }

    }
}