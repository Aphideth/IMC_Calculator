package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FieldClassification
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.math.roundToInt
import kotlin.math.roundToLong


class MainActivity : AppCompatActivity() {

    //declaration variable
    var imc: Double = 0.0
    var imc2: String = ""
    var editNom: String = ""
    var editPoids: Double = 0.0
    var editTaille: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find by id
//        val nom = findViewById<EditText>(R.id.txtNom)
//        val poids = findViewById<EditText>(R.id.txtPoids)
//        val taille = findViewById<EditText>(R.id.txtTaille)
//        val resultat = findViewById<Button>(R.id.btnResultat)

            btnResultat.setOnClickListener() {
                // recup des données saisies
                editNom = txtNom.text.toString()
                println("$editNom")
                editPoids = txtPoids.text.toString().toDouble()
                println("$editPoids")
                editTaille = txtTaille.text.toString().toDouble()
                println("$editTaille")
                //appel de la methode de calcul
                imc = (editPoids / ((editTaille / 100) * (editTaille / 100)))
                println(imc)
                imc2 = String.format("%.2f",imc)
                println(imc2)
                val intent = Intent(this, ResultatActivity::class.java)
                intent.putExtra("nom",editNom)
                intent.putExtra("imc",imc2)
                startActivity(intent)


                /* Mourad****************
        var personne : Personne? = null
        btnResultat.setOnClickListener() {
            // recup des données saisies
            personne?.editNom = txtNom.text.toString()
            println("${personne?.editNom}")
            personne?.editPoids = txtPoids.text.toString().toDouble()
            println("${personne?.editPoids}")
            personne?.editTaille = txtTaille.text.toString().toDouble()
            println("${personne?.editTaille}")
            //appel de la methode de calcul
            personne?.calcul()
            println(personne?.imc)
            val intent = Intent(this, ResultatActivity::class.java)
            intent.putExtra("nom",personne?.editNom)
            intent.putExtra("imc",personne?.imc)
            startActivity(intent)
*/
            }

    }


}








