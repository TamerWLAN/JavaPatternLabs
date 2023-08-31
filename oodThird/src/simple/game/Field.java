package simple.game;

public class Field {
    static final private int size = 3;
    static final private char emptyChar = '_';
    final private char[][] board = new char[3][3];
    public Field () {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                board[i][j] = emptyChar;
            }
        }
    }
    final void put(char symbol, int xPos, int yPos) {
        board[xPos][yPos] = symbol;
    }
    final String getBoard() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    final boolean isEmpty(int xPos, int yPos) {
        return board[xPos][yPos] == emptyChar;
    }

    final State checkState() {

        for (int i = 0; i < size; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != emptyChar) {
                board[i][0] = board[i][1] = board[i][2] = '*';
                return State.somebodyWin;
            }
        }

        for (int j = 0; j < size; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != emptyChar) {
                board[0][j] = board[1][j] = board[2][j] = '*';
                return State.somebodyWin;
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != emptyChar) {
            board[0][0] = board[1][1] = board[2][2] = '*';
            return State.somebodyWin;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != emptyChar) {
            board[0][2] = board[1][1] = board[2][0] = '*';
            return State.somebodyWin;
        }

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == emptyChar) {
                    return State.working;
                }
            }
        }

        return State.nobodyWin;
    }
}
