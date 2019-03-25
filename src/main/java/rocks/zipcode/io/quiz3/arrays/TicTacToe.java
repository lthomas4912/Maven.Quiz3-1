package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] result = new String[board.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = board[i][value];

        }
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return isHomogeneous(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return isHomogeneous(column);
    }

    private Boolean isHomogeneous(String[] row) {
        for (int i = 0; i < row.length; i++) {
            if (!row[i].equals(row[0])) {
                return false;
            }
        }
        return true;
    }

    public String getWinner() {

        for (int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                return board[i][0];
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }
        String[] diagonal = getDiagonal1();
        if (isHomogeneous(diagonal)) {
            return diagonal[0];
        }
        String[] otherDiagonal = getDiagonal2();
        if (isHomogeneous(otherDiagonal)) {
            return otherDiagonal[0];
        }
        return null;
    }

    public String [] getDiagonal1() {
        String[] diagonal = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }
    
    public String [] getDiagonal2(){
        String [] diagonal2 = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            int num = board.length - i - 1;
            diagonal2[i] = board[num][i];
        }
        return diagonal2;
    }

    public String[][] getBoard() {
        return board;
    }
}
