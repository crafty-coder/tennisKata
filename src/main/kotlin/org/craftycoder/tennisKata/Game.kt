package org.craftycoder.tennisKata

class Game {

    private var playerOneScore = false
    private var playerTwoScore = false

    fun getScore(): String =
            if (!playerOneScore && !playerTwoScore) "Love-All"
            else if (playerOneScore && !playerTwoScore) "Fifteen-Love"
            else if (playerTwoScore && !playerOneScore) "Love-Fifteen"
            else "Fifteen-All"

    fun addPointToPlayer1() {
        playerOneScore = true
    }

    fun addPointToPlayer2() {
        playerTwoScore = true
    }
}