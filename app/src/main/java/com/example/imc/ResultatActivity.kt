package com.example.imc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultat.*


class ResultatActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultat)

        val bundle: Bundle? = intent.extras
        val name: String? = bundle?.getString("nom")
        val imc: Double? = bundle?.getString("imc")?.toDouble()
        println("$name $imc")


        if (imc != null) {
            if (imc < 16.5) {
                imgResultat.setImageResource(R.drawable.imc1)
                txtResultat.text = ("$name, \nvotre IMC est de $imc")
            }
            if (imc >= 16.5 && imc < 18.5) {
                imgResultat.setImageResource(R.drawable.imc2)
                txtResultat.text = ("$name, \nvotre IMC est de $imc")
            }
            if (imc >= 18.5 && imc < 25) {
                imgResultat.setImageResource(R.drawable.imc3)
                txtResultat.text = ("$name, \nvotre IMC est de $imc")
            }
            if (imc >= 25 && imc < 30) {
                imgResultat.setImageResource(R.drawable.imc4)
                txtResultat.text = ("$name, \nvotre IMC est de $imc")
            }
            if (imc >= 30 && imc < 35) {
                imgResultat.setImageResource(R.drawable.imc5)
                txtResultat.text = ("$name, \nvotre IMC est de $imc")
            }
            if (imc >= 35 && imc < 40) {
                imgResultat.setImageResource(R.drawable.imc6)
                txtResultat.text = ("$name, \nvotre IMC est de $imc")
            }
            if (imc >= 40) {
                imgResultat.setImageResource(R.drawable.imc7)
                txtResultat.text = ("$name, \nvotre IMC est de $imc")
            }
        }
    }
}