package com.example.pesoideal

import kotlin.math.pow


class calculoPesoIdeal (var altura: Double, var peso: Double) {

    var calculo: Double = 0.00


    init {
        this.calcular()
    }

    fun calcular() {
        this.calculo = 72.7*altura - 58
    }






}

