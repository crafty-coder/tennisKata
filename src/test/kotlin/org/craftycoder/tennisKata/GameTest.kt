package org.craftycoder.tennisKata

import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals


class GameTest {

    @Test fun score_should_be_love_all_when_just_started() {
        val game = Game()
        assertEquals("Love-All", game.getScore())
    }

    @Test fun score_should_be_fifteen_love_when_playerOne_scores_first_point() {
        val game = Game()
        game.addPointToPlayer1()
        assertEquals("Fifteen-Love", game.getScore())
    }

    @Test fun score_should_be_love_fifteen_when_playerTwo_scores_first_point() {
        val game = Game()
        game.addPointToPlayer2()
        assertEquals("Love-Fifteen", game.getScore())
    }
    @Test fun score_should_be_fifteen_all_when_both_players_scores_their_first_point() {
        val game = Game()
        game.addPointToPlayer1()
        game.addPointToPlayer2()
        assertEquals("Fifteen-All", game.getScore())
    }

    @Test fun score_should_be_Thirty_Love_when_playerOne_scores_his_two_first_points_in_a_row() {
        val game = Game()
        game.addPointToPlayer1()
        game.addPointToPlayer1()
        assertEquals("Thirty-Love", game.getScore())
    }

}