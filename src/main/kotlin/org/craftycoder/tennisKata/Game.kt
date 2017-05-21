package org.craftycoder.tennisKata

class Game {

    private val scoreTranslation = arrayOf("Love", "Fifteen", "Thirty", "Forty")

    private var playerOnePoints = 0
    private var playerTwoPoints = 0

    fun getScore(): String =

            if (playerOnePoints < 4 && playerTwoPoints < 4 && playerOnePoints + playerTwoPoints < 6) {
                if (playerOnePoints == playerTwoPoints) "${pointsToScore(playerOnePoints)}-All"
                else pointsToScore(playerOnePoints) + "-" + pointsToScore(playerTwoPoints)
            } else {
                if (playerOnePoints == playerTwoPoints) "Deuce"
                else {
                    val player = if (playerOnePoints > playerTwoPoints) "Player1" else "Player2"
                    if (playerOnePoints - playerTwoPoints == 1) "Advantage $player" else "Win for $player"
                }

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