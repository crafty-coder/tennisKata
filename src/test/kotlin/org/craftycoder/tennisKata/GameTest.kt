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

    @Test fun score_should_be_Thirty_Love_when_playerTwo_scores_his_two_first_points_in_a_row() {
        val game = Game()
        game.addPointToPlayer2()
        game.addPointToPlayer2()
        assertEquals("Love-Thirty", game.getScore())
    }

    @Test fun score_should_be_Forty_Love_when_playerOne_scores_his_two_first_points_in_a_row() {
        val game = Game()
        game.addPointToPlayer1()
        game.addPointToPlayer1()
        game.addPointToPlayer1()
        assertEquals("Forty-Love", game.getScore())
    }

    @Test fun score_should_be_Love_Forty_when_playerTwo_scores_his_two_first_points_in_a_row() {
        val game = Game()
        game.addPointToPlayer2()
        game.addPointToPlayer2()
        game.addPointToPlayer2()
        assertEquals("Love-Forty", game.getScore())
    }


    @Test fun score_should_be_Thirty_All_when_both_players_got_two_points_each() {
        val game = Game()
        game.addPointToPlayer1()
        game.addPointToPlayer1()
        game.addPointToPlayer2()
        game.addPointToPlayer2()
        assertEquals("Thirty-All", game.getScore())
    }

    @Test fun score_should_be_deuce_when_both_players_got_the_same_points_and_more_than_3_points() {

        val game = Game()
        game.addPointToPlayer1()
        game.addPointToPlayer1()
        game.addPointToPlayer1()

        game.addPointToPlayer2()
        game.addPointToPlayer2()
        game.addPointToPlayer2()
        assertEquals("Deuce", game.getScore())

    }

    @Test fun score_should_be_advantage_when_the_point_difference_is_One_and_each_player_got_at_least_3_points() {

        val game = Game()

        game.addPointToPlayer1()
        game.addPointToPlayer1()

        game.addPointToPlayer2()
        game.addPointToPlayer2()

        game.addPointToPlayer1()
        game.addPointToPlayer1()

        game.addPointToPlayer2()

        assertEquals("Advantage Player1",game.getScore())

        val game2 = Game()

        game2.addPointToPlayer1()
        game2.addPointToPlayer1()
        game2.addPointToPlayer1()

        game2.addPointToPlayer2()
        game2.addPointToPlayer2()
        game2.addPointToPlayer2()
        game2.addPointToPlayer2()

        assertEquals("Advantage Player2",game2.getScore())

    }

    @Test fun score_should_be_win_for_when_a_player_more_than_four_points_and_difference_with_the_other_player_is_more_than_one() {

        val game = Game()

        game.addPointToPlayer1()
        game.addPointToPlayer1()
        game.addPointToPlayer1()
        game.addPointToPlayer1()
        game.addPointToPlayer1()

        assertEquals("Win for Player1",game.getScore())

        val game2 = Game()

        game2.addPointToPlayer2()
        game2.addPointToPlayer2()
        game2.addPointToPlayer2()
        game2.addPointToPlayer2()
        game2.addPointToPlayer2()

        assertEquals("Win for Player2",game2.getScore())

    }





}