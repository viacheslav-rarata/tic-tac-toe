package org.task.solution;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AppTest {

    private TestUtils utils;
    private WinningState state;

    @Before
    public void setUp() {
        utils = new TestUtils();
        state = new WinningState3X3();
    }

    @Test
    public void testFirstHorizontalLine() {
        assertTrue(state.isBoardInWinningState(utils.firstHorizontalLine));
    }

    @Test
    public void testSecondHorizontalLine() {
        assertTrue(state.isBoardInWinningState(utils.secondHorizontalLine));
    }

    @Test
    public void testThirdHorizontalLine() {
        assertTrue(state.isBoardInWinningState(utils.thirdHorizontalLine));
    }

    @Test
    public void testFirstVerticalLine() {
        assertTrue(state.isBoardInWinningState(utils.firstVerticalLine));
    }

    @Test
    public void testSecondVerticalLine() {
        assertTrue(state.isBoardInWinningState(utils.secondVerticalLine));
    }

    @Test
    public void testThirdVerticalLine() {
        assertTrue(state.isBoardInWinningState(utils.thirdVerticalLine));
    }

    @Test
    public void testFirstDiagonalLine() {
        assertTrue(state.isBoardInWinningState(utils.firstDiagonalLine));
    }

    @Test
    public void testSecondDiagonalLine() {
        assertTrue(state.isBoardInWinningState(utils.secondDiagonalLine));
    }

    @Test
    public void testNoResults() {
        assertFalse(state.isBoardInWinningState(utils.noResults));
    }

    @Test
    public void testWrongArray() {
        try {
            state.isBoardInWinningState(utils.wrongArray);
            fail();
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Array have wrong size"));
        }
    }

}
