/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Forge-15 1650
 */
public class Q3 {

    static final int N = 12;
    static char[][] a = new char[N][N];
    static int[][] b = new int[N][N];

    public static void main(String[] args) {
        System.out.println("Solving the "+N+" Queens problem");
        reset();
        NQueen();
    }

    public static void reset() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = 0;
                a[i][j] = '*';
            }
        }
    }
    static int row = 0;
    static int column = 0;
    static int count = 0;
    static Stack<Integer> ROW = new Stack<>();
    static Stack<Integer> COLUMN = new Stack<>();

    public static void NQueen() {
        boolean solution;
        for (row = 0; row < N;) {
            if (isValid(row, column)) {
                ROW.push(row);
                COLUMN.push(column);
                b[row][column] = 1;
                row++;
                column = 0;
            } else if (!isValid(row, column)) {
                if (column < N - 1) {
                    column++;
                } else {
                    solution = backtrack();
                    if (!solution) {
                        return;
                    }
                }

            }
            if (ROW.getSize() == N) {
                count++;
                printQueen();
                solution = backtrack();
                if (!solution) {
                    return;
                }
            }
        }
    }

    public static boolean backtrack() {
        while (true) {
            if (ROW.isEmpty()) {
                System.out.println("The number of solutions are : " + count);
                return false;
            }
            row = ROW.pop();
            column = COLUMN.pop();
            b[row][column] = 0;
            if (column < N - 1) {
                column++;
                return true;
            }
        }
    }

    public static void printQueen() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (b[i][j] == 1) {
                    a[i][j] = 'Q';
                } else {
                    a[i][j] = '*';
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
//    public static void NQueen() {
//        Stack<String> c = new Stack<>();
//        String position = "";
//        int ro = 0;
//        int co = 0;
//        int row = 0;
//        int column = 0;
//        int count = 0;
//
//        while (true) {
//            for (row = ro; row < N; row++) {
//                for (column = co; column < N; column++) {
//                    if (isValid(row, column)) {
////                        System.out.println(row + " " + column);
//                        b[row][column] = 1;
//                        c.push(row + "," + column);
//                    }
//                }
//                co = 0;
//            }
//
////            for (int i = 0; i < N; i++) {
////                for (int j = 0; j < N; j++) {
////                    System.out.print(b[i][j] + " ");
////                }
////                System.out.println("");
////            }
////            System.out.println("");
//            if (c.getSize() == N) {
//                for (int i = 0; i < N; i++) {
//                    for (int j = 0; j < N; j++) {
//                        if (b[i][j] == 1) {
//                            a[i][j] = 'Q';
//                        }
//                        System.out.print(a[i][j] + " ");
//                    }
//                    System.out.println("");
//                }
//                System.out.println("");
//                count++;
//                reset();
//                for(int i=0;i<N;i++){
//                position = c.pop();
//                }
//                String[] s = position.split(",");
//                ro = 0;
//                co = Integer.parseInt(s[1])+1;
//            } else {
//                position = c.pop();
//                String[] s = position.split(",");
//                ro = Integer.parseInt(s[0]);
//                co = Integer.parseInt(s[1]);
//                b[ro][co] = 0;
//                if (co == N - 1) {
//                    if (ro == N - 1) {
//                        System.out.println("Number of solutions: " + count);
//                        break;
//                    } else {
//                        ro = ro + 1;
//                        co = 0;
//                    }
//                } else {
//                    co = co + 1;
//                }
//            }
//        }
//    }

    public static boolean isValid(int row, int column) {
//        System.out.println(row);
//        System.out.println(column);
//        for (int i = 0; i < N; i++) {
//            if (b[row][i] == 1) {
//                return false;
//            }
//        }
        for (int i = 0; i < N; i++) {
            if (b[i][column] == 1) {
                return false;
            }
        }
        //left down
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (b[i][j] == 1) {
                return false;
            }
        }
        //left up
        for (int i = row, j = column; i >= 0 && j < N; i--, j++) {
            if (b[i][j] == 1) {
                return false;
            }
        }
        //right down
        for (int i = row, j = column; i < N && j >= 0; i++, j--) {
            if (b[i][j] == 1) {
                return false;
            }
        }
        //right up
        for (int i = row, j = column; i < N && j < N; i++, j++) {
            if (b[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
