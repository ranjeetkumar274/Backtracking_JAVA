public class RatinADeadMazefourDirection {
    static void print(int sr, int sc, int er, int ec, String s,int[][] maze){
        if (sr < 0 || sc < 0 || sr > er || sc > ec || maze[sr][sc] == -1 || maze[sr][sc] == 0) {
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }


        maze[sr][sc] = -1;

        //for right
        print(sr,sc+1,er,ec,s+"R",maze);
        //for down
        print(sr+1,sc,er,ec,s+"D",maze);
        //for left
        print(sr,sc-1,er,ec,s+"L",maze);
        //for right
        print(sr-1,sc,er,ec,s+"U",maze);

        maze[sr][sc] = 1;
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        int[][] maze = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};

        print(0,0,rows-1,cols-1,"",maze);
    }
}
