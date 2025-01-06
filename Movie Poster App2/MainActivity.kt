package com.example.kotlin_1

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Gallery
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

@Suppress("deprecation")
class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "갤러리 영화 포스터(개선)"

        var gallery = findViewById<Gallery>(R.id.gallery1)

        var galAdapter = MyGalleryAdapter(this)
        gallery.adapter = galAdapter
    }

    inner class MyGalleryAdapter(internal var context: Context) : BaseAdapter() {
        var posterID = arrayOf(R.drawable.movie6, R.drawable.movie7, R.drawable.movie8, R.drawable.movie9, R.drawable.movie10)

        var posterTitle =  arrayOf("소울메이트", "덤블도어의 비밀", "스즈메의 문단속",
            "30일", "패트릭 앤 더 웨일")

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var imageview = ImageView(context)
            imageview.layoutParams = Gallery.LayoutParams(200, 300)
            imageview.scaleType = ImageView.ScaleType.FIT_CENTER
            imageview.setPadding(5, 5, 5, 5)
            imageview.setImageResource(posterID[p0])

            imageview.setOnTouchListener { v, event ->
                var ivPoster = findViewById<ImageView>(R.id.ivPoster)
                ivPoster.scaleType = ImageView.ScaleType.FIT_CENTER
                ivPoster.setImageResource(posterID[p0])

                var toast = Toast(applicationContext)
                var toastView = View.inflate( applicationContext, R.layout.toast, null)
                var toastText = toastView
                    .findViewById<View>(R.id.textView1) as TextView
                toastText.text = posterTitle[p0]
                toast.view = toastView
                toast.show()

                false
            }

            return imageview
        }

        override fun getItem(p0: Int): Any {
            return 0
        }

        override fun getItemId(p0: Int): Long {
            return 0
        }

        override fun getCount(): Int {
            return posterID.size
        }
    }

}
