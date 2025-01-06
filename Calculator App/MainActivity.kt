package com.example.kotlin_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;  lateinit var edit2 : EditText
    lateinit var btnAdd : Button;   lateinit var btnSub : Button
    lateinit var btnMul : Button;   lateinit var btnDiv : Button
    lateinit var btnRem : Button
    lateinit var textResult : TextView
    lateinit var num1 : String;    lateinit var num2 : String
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "계산기"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        btnRem = findViewById<Button>(R.id.BtnRem)

        textResult = findViewById<TextView>(R.id.TextResult)

        btnAdd.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            // num1이나 num2가 비어 있다면
            if (num1.trim() == "" || num2.trim() == "") {
                Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
            } else {
                result = num1.toDouble() + num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }
        }

        btnSub.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            // num1이나 num2가 비어 있다면
            if (num1.trim() == "" || num2.trim() == "") {
                Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
            } else {
                result = num1.toDouble() - num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }
        }

        btnMul.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            // num1이나 num2가 비어 있다면
            if (num1.trim() == "" || num2.trim() == "") {
                Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
            } else {
                result = num1.toDouble() * num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }
        }

        btnDiv.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            // num1이나 num2가 비어 있다면
            if (num1.trim() == "" || num2.trim() == "") {
                Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
            } else {
                result = num1.toDouble() / num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }
        }

        btnRem.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            // num1이나 num2가 비어 있다면
            if (num1.trim() == "" || num2.trim() == "") {
                Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
            } else {
                result = num1.toDouble() % num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }
        }
    }
}