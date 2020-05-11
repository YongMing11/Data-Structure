package Lab5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Forge-15 1650
 */
public class q3_1 {

    static final int N = 4;
    static char[][] a = new char[N][N];
    static int[][] b = new int[N][N];

    public static void main(String[] args) {
        System.out.println("Solving the 4 Queens problem");
        reset();
        solve();
    }

    public static void solve() {
        Stack<Integer> c = new Stack<>();
        int solution = 0;
        int currentco = 0;
        int row = 0;
        int column = 0;
        boolean valid = false;
        while (true) {
            for (; column < N; column++) {
                if (isValid(row, column)) {
                    c.push(column);
                    b[row][column] = 1;
                    row++;
                    column=0;
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                if (c.isEmpty()) {
                    System.out.println("The number of solutions are : "+solution);
                    break;
                } else {
                    currentco = c.pop();
                    row--;
                    b[row][currentco] = 0;
                    column = currentco + 1;
                }
            }
            if (c.getSize() == N) {
                solution++;
                while(c.peek()!=null){
                    currentco = c.pop();
                }
                column=currentco+1;
                row=0;
                printQueen();
                reset();
            }
            valid=false;
        }
    }

    public static void printQueen() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (b[i][j] == 1) {
                    a[i][j] = 'Q';
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void reset() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = 0;
                a[i][j] = '*';
            }
        }
    }

    public static boolean isValid(int row, int column) {
        //upper row
        for (int i = row; i >= 0; i--) {
            if (b[i][column] == 1) {
                return false;
            }
        }

        //right up
        for (int i = row, j = column; i >= 0 && j < N; i--, j++) {
            if (b[i][j] == 1) {
                return false;
            }
        }

        //left up
        for (int i = row, j = column; i >=0 && j >= 0 ; i--, j--) {
            if (b[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
