package org.craftycoder.tennisKata

class Game {

    private val scoreTranslation = arrayOf("Love", "Fifteen", "Thirty", "Forty")

    private var playerOnePoints = 0
    private var playerTwoPoints = 0

    fun getScore(): String =

            if (playerOnePoints + playerTwoPoints < 6) {
                if (playerOnePoints == playerTwoPoints) "${pointsToScore(playerOnePoints)}-All"
                else pointsToScore(playerOnePoints) + "-" + pointsToScore(playerTwoPoints)
            } else {
                if (playerOnePoints == playerTwoPoints) "Deuce"
                else if (playerOnePoints > playerTwoPoints) "Advantage Player1"
                else "Advantage Player2"
            }


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