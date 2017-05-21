package org.craftycoder.tennisKata

class Game {

    private val scoreTranslation = arrayOf("Love", "Fifteen", "Thirty", "Forty")

    private var playerOnePoints = 0
    private var playerTwoPoints = 0

    fun getScore(): String =
            if (playerOnePoints == 0 && playerTwoPoints == 0) "Love-All"
            else if (playerTwoPoints == 1 && playerOnePoints == 1) "Fifteen-All"
            else pointsToScore(playerOnePoints) + "-" + pointsToScore(playerTwoPoints)

    fun addPointToPlayer1() {
        playerOnePoints += 1
    }

    fun addPointToPlayer2() {
        playerTwoPoints += 1
    }

    private fun pointsToScore(score: Int): String {
        return scoreTranslation[score]
    }
}