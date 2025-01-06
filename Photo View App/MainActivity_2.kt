package com.example.kotlin_1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var switchAgree : Switch
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoTteokbokki : RadioButton
    lateinit var rdoJajangmyeon : RadioButton
    lateinit var rdoPasta : RadioButton
    lateinit var rdoCurry : RadioButton
    lateinit var rdoSushi : RadioButton
    lateinit var btnQuit : Button
    lateinit var btnRerun : Button
    lateinit var imgFood : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "안드로이드 사진 보기"

        text1 = findViewById<TextView>(R.id.Text1)
        switchAgree = findViewById<Switch>(R.id.SwitchAgree)

        text2 = findViewById<TextView>(R.id.Text2)
        rGroup1 = findViewById<RadioGroup>(R.id.Rgroup1)
        rdoTteokbokki = findViewById<RadioButton>(R.id.RdoTteokbokki)
        rdoJajangmyeon = findViewById<RadioButton>(R.id.RdoJajangmyeon)
        rdoPasta = findViewById<RadioButton>(R.id.RdoPasta)
        rdoCurry = findViewById<RadioButton>(R.id.RdoCurry)
        rdoSushi = findViewById<RadioButton>(R.id.RdoSushi)

        btnQuit = findViewById<Button>(R.id.BtnQuit)
        btnRerun = findViewById<Button>(R.id.BtnRerun)
        imgFood = findViewById<ImageView>(R.id.ImgFood)

        // 시작함 체크박스의 체크가 변경되면
        switchAgree.setOnCheckedChangeListener{ compoundButton, b ->
            // 체크되면 모두 보이도록 설정
            if (switchAgree.isChecked == true) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnQuit.visibility = android.view.View.VISIBLE
                btnRerun.visibility = android.view.View.VISIBLE
                imgFood.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnQuit.visibility = android.view.View.INVISIBLE
                btnRerun.visibility = android.view.View.INVISIBLE
                imgFood.visibility = android.view.View.INVISIBLE
            }
        }

        // 라디오버튼을 클릭할 때, 이미지 뷰를 변경 시킴 ==> 배열로 처리함.
        val draw = intArrayOf(R.drawable.tteokbokki, R.drawable.jajangmyeon, R.drawable.pasta, R.drawable.curry, R.drawable.sushi)
        val radioArray = arrayOf(rdoTteokbokki, rdoJajangmyeon, rdoPasta, rdoCurry, rdoSushi)

        for (i in radioArray.indices) {
            radioArray[i].setOnClickListener(View.OnClickListener { imgFood.setImageResource(draw[i]) })
        }

        // 종료 버튼을 클릭하면
        btnQuit.setOnClickListener{ finish() }

        // 처음으로 버튼을 클릭하면
        btnRerun.setOnClickListener{
            text2.visibility = android.view.View.VISIBLE
            rdoTteokbokki.visibility = android.view.View.VISIBLE
            rdoJajangmyeon.visibility = android.view.View.VISIBLE
            rdoPasta.visibility = android.view.View.VISIBLE
            rdoCurry.visibility = android.view.View.VISIBLE
            rdoSushi.visibility = android.view.View.VISIBLE

            btnQuit.visibility = android.view.View.INVISIBLE
            btnRerun.visibility = android.view.View.INVISIBLE

            rGroup1.clearCheck()
            switchAgree.isChecked = false
        }
    }
}