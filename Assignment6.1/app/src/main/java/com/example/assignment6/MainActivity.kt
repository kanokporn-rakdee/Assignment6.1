package com.example.assignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val not = Toast.makeText(applicationContext, "กรุณากรอกให้ครบทุกช่อง", Toast.LENGTH_LONG)
        val nonum2 = Toast.makeText(applicationContext, "ห้ามกรอกช่อง Num2 = 0 !!", Toast.LENGTH_LONG)
        val numm2 = Toast.makeText(applicationContext, "กรอกค่า Num2", Toast.LENGTH_LONG)
        var n1 = 0
        var n2 = 0
        PLUS.setOnClickListener {
            if (NUM1.text.toString() != "" && NUM2.text.toString() != "") {
                d.setText("+")
                n1 = NUM1.text.toString().toInt()
                n2 = NUM2.text.toString().toInt()
                var total = n1 + n2
                a.setText("$total")
            } else if (NUM1.text.toString() == "" && NUM2.text.toString() == "") {
                not.show()
            } else if (NUM2.text.toString() == "") {
                numm2.show()
            } else {
                not.show()
            }
        }

        val N2 = Toast.makeText(applicationContext, "กรอกค่า Num2", Toast.LENGTH_LONG)
        MIN.setOnClickListener {
            if (NUM1.text.toString() != "" && NUM2.text.toString() != "") {
                d.setText("-")
                n1 = NUM1.text.toString().toInt()
                n2 = NUM2.text.toString().toInt()
                var total = n1 - n2
                a.setText("$total")
            } else if (NUM1.text.toString() == "" && NUM2.text.toString() == "") {
                not.show()
            } else if (NUM2.text.toString() == "") {
                N2.show()
            } else {
                not.show()
            }
        }
        M.setOnClickListener {
            if (NUM1.text.toString() != "" && NUM2.text.toString() != "") {
                d.setText("x")
                n1 = NUM1.text.toString().toInt()
                n2 = NUM2.text.toString().toInt()
                var total = n1 * n2
                a.setText("$total")
            } else if (NUM1.text.toString() == "" && NUM2.text.toString() == "") {
                not.show()
            } else if (NUM2.text.toString() == "") {
                N2.show()
            } else {
                not.show()
            }
        }

        D.setOnClickListener {
            if (NUM2.text.toString() == "") {
                numm2.show()
            } else if (NUM2.text.toString() == "0") {
                nonum2.show()
            } else if (NUM1.text.toString() != "" && NUM2.text.toString() != "") {
                d.setText("÷")
                var n3:Double = NUM1.text.toString().toDouble()
                var n4:Double = NUM2.text.toString().toDouble()
                var total:Double = n3 / n4
                a.setText("$total")
            } else if (NUM1.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }

        m.setOnClickListener {
            if (NUM2.text.toString() == "") {
                numm2.show()
            } else if (NUM2.text.toString() == "0") {
                nonum2.show()
            } else if (NUM1.text.toString() != "" && NUM2.text.toString() != "") {
                d.setText("%")
                n1 = NUM1.text.toString().toInt()
                n2 = NUM2.text.toString().toInt()
                var total = n1 % n2
                a.setText("$total")
            } else if (NUM1.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }

       CLEAR.setOnClickListener {
           NUM1.setText("")
           NUM2.setText("")
           d.setText("")
           a.setText("")
       }

    }

}
