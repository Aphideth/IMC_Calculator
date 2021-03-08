package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.math.roundToInt
import kotlin.math.roundToLong


class MainActivity : AppCompatActivity() {

    //declaration variable
    var imc: Double = 0.0
        get() = field
    var editNom: String = ""
        get() = field
    var editPoids: Double = 0.0
    var editTaille: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find by id
        val nom = findViewById<EditText>(R.id.txtNom)
        val poids = findViewById<EditText>(R.id.txtPoids)
        val taille = findViewById<EditText>(R.id.txtTaille)
        val resultat = findViewById<Button>(R.id.btnResultat)

        resultat.setOnClickListener() {
            // recup des données saisies
            editNom = nom.text.toString()
            editPoids = poids.text.toString().toDouble()
            editTaille = taille.text.toString().toDouble()
            //appel de la methode de calcul
            calcul()
        }

    }

    // methode de calcul IMC
    fun calcul() {
        imc = (editPoids/((editTaille/100)*(editTaille/100)))
        Toast.makeText(this, "Votre IMC = $imc", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, ResultatActivity::class.java)
        startActivity(intent)
    }
}








