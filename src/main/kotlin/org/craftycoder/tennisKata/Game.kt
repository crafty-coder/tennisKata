package org.craftycoder.tennisKata

class Game {

    private var playerOneScore = false
    private var playerTwoScore = false

    fun getScore(): String =
            if (!playerOneScore && !playerTwoScore) "Love-All"
            else if (playerOneScore) "Fifteen-Love"
            else "Love-Fifteen"

    fun addPointToPlayer1() {
        playerOneScore = true
    }

    fun addPointToPlayer2() {
        playerTwoScore = true
    }
}