package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ChessBoardTest {

    @Test
    public void wayIs6() {
        int way = ChessBoard.way(0,0,0,6);
        assertThat(way, is(6));
    }

    @Test
    public void wayIs5(){
        int way = ChessBoard.way(0, 0,5,0);
        assertThat(way,is(5));
    }

    @Test
    public void wayIs0(){
        int way = ChessBoard.way(0,0,5,6);
        assertThat(way, is(0));
    }

    @Test
    public void moveElephantIs0(){
        int way = ChessBoard.moveElephant(0,0,5,0);
        assertThat(way, is(0));
    }

    @Test
    public void moveElephantIs12(){
        int way = ChessBoard.moveElephant(0, 0,5,7);
        assertThat(way, is(12));
    }
}