package org.craftycoder.tennisKata

import org.junit.Test
import kotlin.test.assertEquals


class GameTest {

    @Test fun score_should_be_love_all_when_just_started() {
        val game = Game("player1","player2")
        assertEquals("Love-All", game.getScore())
    }


}