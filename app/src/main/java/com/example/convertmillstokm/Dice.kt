package com.example.convertmillstokm

class Dice (private var numSides: Int) {

    fun setNumSides(NewNum: Int){
        numSides = NewNum
    }
    fun getNumSides(): Int {
        return numSides
    }
    fun roll(): Int {
        return (1..numSides).random()
    }
}