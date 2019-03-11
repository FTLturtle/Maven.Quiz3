package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value], board[1][value], board[2][value]};
    }

    private String[] getTLtoBRdiagonal() {
        String[] diagonal = new String[3];
        for (int i = 0; i < 3; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    private String[] getBLtoTRdiagonal() {
        String[] diagonal = new String[3];
        for (int i = 0; i < 3; i++) {
            diagonal[i] = board[i][2 - i];
        }
        return diagonal;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return isStringArrayHomogeneous(getRow(rowIndex));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return isStringArrayHomogeneous(getColumn(columnIndex));
    }

    private Boolean isStringArrayHomogeneous(String[] stringArray) {
        return (Arrays.stream(stringArray)
                .distinct()
                .toArray(String[]::new)
                .length == 1);
    }

    public String getWinner() {
        String winner = "tie";

        if (isStringArrayHomogeneous(getBLtoTRdiagonal())) {
            winner = getBLtoTRdiagonal()[0];
        } else if (isStringArrayHomogeneous(getTLtoBRdiagonal())) {
            winner = getTLtoBRdiagonal()[0];
        } else {
            for (int i = 0; i < 3; i++) {
                if (isRowHomogenous(i)) {
                    winner = getRow(i)[0];
                } else if (isColumnHomogeneous(i)) {
                    winner = getColumn(i)[0];
                }
            }
        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
