package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener{
            var result1 = 0
            var n1 = num_1.text.toString()

            var n2 = num_2.text.toString()

            if (n2 == "" || n1 == ""){
                Toast.makeText(
                    applicationContext,
                    "Please input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val nn1 = n1.toInt()
                val nn2 = n2.toInt()
                result1 = nn1 + nn2
                var nn3 = result1.toDouble()
                Result.setText(nn3.toString())
                compu.setText("+")
            }

        }

        minus.setOnClickListener {
            var result1 = 0
            var n1 = num_1.text.toString()
            var n2 = num_2.text.toString()
            if (n2 == "" || n1 == ""){
                Toast.makeText(
                    applicationContext,
                    "Please input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val nn1 = n1.toInt()
                val nn2 = n2.toInt()
                result1 = nn1 - nn2
                var nn3 = result1.toDouble()
                Result.setText(nn3.toString())
                compu.setText("-")
            }
        }

        multiply.setOnClickListener {
            var result1 = 0
            var n1 = num_1.text.toString()
            var n2 = num_2.text.toString()
            if (n2 == "" || n1 == ""){
                Toast.makeText(
                    applicationContext,
                    "Please input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val nn1 = n1.toInt()
                val nn2 = n2.toInt()
                result1 = nn1 * nn2
                var nn3 = result1.toDouble()
                Result.setText(nn3.toString())
                compu.setText("*")
            }
        }

        divider.setOnClickListener {
            var result1 = 0
            var n1 = num_1.text.toString()
            var n2 = num_2.text.toString()
            if (n2 == "" || n1 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            }else if (n2.toInt() == 0){
                Toast.makeText(
                    applicationContext,
                    "Do Not Num2 is Zero or Nul",
                    Toast.LENGTH_SHORT
                ).show()
                num_2.setText("")
            }else{
                val nn1 = n1.toInt()
                val nn2 = n2.toInt()
                result1 = nn1 / nn2
                var nn3 = result1.toDouble()
                Result.setText(nn3.toString())
                compu.setText("/")
            }
        }

        modulo.setOnClickListener {
            var result1 = 0
            var n1 = num_1.text.toString()
            var n2 = num_2.text.toString()
            if (n2 == "" || n1 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()

            }else{
                val nn1 = n1.toInt()
                val nn2 = n2.toInt()
                result1 = nn1 % nn2
                var nn3 = result1.toDouble()
                Result.setText(nn3.toString())
                compu.setText("%")
            }
        }

        clear.setOnClickListener{
            num_1.setText("")
            compu.setText("")
            num_2.setText("")
            Result.setText("")
        }


    }
}