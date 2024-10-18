public class fourDiractionMazePath {

    static void print(int sr, int sc, int er, int ec, String s,
                      boolean[][] isVisited){
        if (sr < 0 || sc < 0 || sr > er || sc > ec || isVisited[sr][sc]) {
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }


        isVisited[sr][sc] = true;

        //for right
        print(sr,sc+1,er,ec,s+"R",isVisited);
        //for down
        print(sr+1,sc,er,ec,s+"D",isVisited);
        //for left
        print(sr,sc-1,er,ec,s+"L",isVisited);
        //for right
        print(sr-1,sc,er,ec,s+"U",isVisited);

        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;

        boolean[][] isVisited = new boolean[rows][cols];

        print(0,0,rows-1,cols-1,"",isVisited);
    }
}
