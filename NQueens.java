public class NQueens {
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int i, j;

        // 1. Check the row (leftwards)
        j = col - 1;
        while (j >= 0) {
            if (board[row][j] == 'Q') return false;
            j--;
        }

        // 2. Check the column (upwards)
        i = row - 1;
        while (i >= 0) {
            if (board[i][col] == 'Q') return false;
            i--;
        }

        // 3. Check upper-left diagonal (Northwest)
        i = row - 1;
        j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        // 4. Check upper-right diagonal (Northeast)
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // 5. Check lower-left diagonal (Southwest)
        i = row + 1;
        j = col - 1;
        while (i < n && j >= 0) {
            if (board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        // 6. Check lower-right diagonal (Southeast)
        i = row + 1;
        j = col + 1;
        while (i < n && j < n) {
            if (board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        return true;
    }
    public static void display(char[][] board){
        int n = board.length;;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Nqueen(char[][] board, int row){
        int n = board.length;
        if(row == n){
            display(board);
            return;
        }

        for(int j = 0; j < n; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                Nqueen(board,row+1);
                board[row][j] = '.'; //Backtracking
            }
        }
    }
    public static void main(String[] args) {
        int n  = 4;   //the number of rows and columns
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
            System.out.println();
        }
        Nqueen(board,0);
    }
}
