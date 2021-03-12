package com.example.imc
//Mourad***********
class Personne (var editNom: String, var imc: Double, var editPoids: Double, var editTaille: Double) {

    // methode de calcul IMC
    fun calcul() {
        imc = (editPoids / ((editTaille / 100) * (editTaille / 100)))
    }
}
