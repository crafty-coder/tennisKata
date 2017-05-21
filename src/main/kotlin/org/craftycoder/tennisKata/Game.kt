package org.craftycoder.tennisKata

class Game {

    private val scoreTranslation = arrayOf("Love", "Fifteen", "Thirty", "Forty")

    private var playerOnePoints = 0
    private var playerTwoPoints = 0

    fun getScore(): String =
            if (playerOnePoints == 0 && playerTwoPoints == 0) "Love-All"
            else if (playerOnePoints == 1 && playerTwoPoints == 0) pointsToScore(playerOnePoints) + "-" + pointsToScore(playerTwoPoints)
            else if (playerTwoPoints == 1 && playerOnePoints == 0) "Love-Fifteen"
            else "Fifteen-All"

    fun addPointToPlayer1() {
        playerOnePoints = 1
    }

    fun addPointToPlayer2() {
        playerTwoPoints = 1
    }

    private fun pointsToScore(score: Int): String {
        return scoreTranslation[score]
    }
}