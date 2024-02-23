import java.util.ArrayList;

public class AllPathMaze {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        ArrayList<String> ans = mazePath(board, 0,0, new StringBuilder(), 0);
//        System.out.println(ans);
    }
    // Displaying all possible path combinations.
    public static ArrayList<String> maze(boolean[][] matrix, int rows, int cols, String ans){
        if (rows == matrix.length-1 && cols==matrix[0].length-1){
            ArrayList<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }

        ArrayList<String> res = new ArrayList<>();

        if (!matrix[rows][cols])
            return res;
        matrix[rows][cols] = false;
        if (rows < matrix.length-1) {
            res.addAll(maze(matrix, rows + 1, cols, ans + "D"));
        }
        if (cols < matrix[0].length-1) {
            res.addAll(maze(matrix, rows, cols + 1, ans + "R"));
        }
        if (rows > 0) {
            res.addAll(maze(matrix, rows - 1, cols, ans + "U"));
        }
        if (cols>0) {
            res.addAll(maze(matrix, cols - 1, cols, ans + "L"));
        }
        matrix[rows][cols] = true;
        return res;
    }

    // Printing the path too
//    public static ArrayList<String> mazePath(boolean[][] matrix, int rows, int cols,  ans, int step){
//        if (rows == matrix.length-1 && cols==matrix[0].length-1){
//            ArrayList<String> res = new ArrayList<>();
//            res.add(String.valueOf(ans));
//            return res;
//        }
//
//        ArrayList<String> res = new ArrayList<>();
//
//        if (!matrix[rows][cols])
//            return res;
//
//        matrix[rows][cols] = false;
//
//        if (rows < matrix.length-1) {
//            res.addAll(mazePath(matrix, rows + 1, cols, ans.append("D"), ++step));
//        }
//        if (cols < matrix[0].length-1) {
//            res.addAll(mazePath(matrix, rows, cols + 1, ans.append("R"), ++step));
//        }
//        if (rows > 0) {
//            res.addAll(mazePath(matrix, rows - 1, cols, ans.append("U"), ++step));
//        }
//        if (cols>0) {
//            res.addAll(mazePath(matrix, cols - 1, cols, ans.append("L"), ++step));
//        }
//        matrix[rows][cols] = true;
//
//        return res;
//    }
}
