package org.craftycoder.tennisKata

class Game {

    private var score = false

    fun getScore(): String = if (!score) "Love-All" else "Fifteen-Love"

    fun addPointToPlayer1() {
        score = true
    }
}