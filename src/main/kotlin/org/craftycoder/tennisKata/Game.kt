package org.craftycoder.tennisKata

class Game {

    private var playerOneScore = 0
    private var playerTwoScore = 0

    fun getScore(): String =
            if (playerOneScore == 0 && playerTwoScore == 0) "Love-All"
            else if (playerOneScore == 1 && playerTwoScore == 0) "Fifteen-Love"
            else if (playerTwoScore == 1 && playerOneScore == 0) "Love-Fifteen"
            else "Fifteen-All"

    fun addPointToPlayer1() {
        playerOneScore = 1
    }

    fun addPointToPlayer2() {
        playerTwoScore = 1
    }
}