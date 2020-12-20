package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (index == row) {
                    if (board[index][cell] != 'X') {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

}
