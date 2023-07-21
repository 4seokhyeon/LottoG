package com.first.lottogame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setInitialize()
    }
    private fun setInitialize(){
        val tvNumber1 = findViewById<TextView>(R.id.tv_number_1)
        val tvNumber2 = findViewById<TextView>(R.id.tv_number_2)
        val tvNumber3 = findViewById<TextView>(R.id.tv_number_3)
        val tvNumber4 = findViewById<TextView>(R.id.tv_number_4)
        val tvNumber5 = findViewById<TextView>(R.id.tv_number_5)
        val tvNumber6 = findViewById<TextView>(R.id.tv_number_6)

        findViewById<Button>(R.id.btn_create_number).setOnClickListener{
            val lottoNumber = mutableListOf<Int>()
            while (lottoNumber.size < 6){
                val randomNumber = Random.nextInt(1,46)
                if(lottoNumber.contains(randomNumber))
                    continue

                lottoNumber.add(randomNumber)
            }
            lottoNumber.sort()

            tvNumber1.text = lottoNumber[0].toString()
            tvNumber2.text = lottoNumber[1].toString()
            tvNumber3.text = lottoNumber[2].toString()
            tvNumber4.text = lottoNumber[3].toString()
            tvNumber5.text = lottoNumber[4].toString()
            tvNumber6.text = lottoNumber[5].toString()

        }

    }
}