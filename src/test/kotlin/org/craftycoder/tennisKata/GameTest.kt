package org.craftycoder.tennisKata

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


}