package Lab5;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Solving the 4 Queens problem");
        solve();

    }
    private static int N = 4;

    private static int board[][] = {{0, 0, 0, 0},
    {0, 0, 0, 0},
    {0, 0, 0, 0},
    {0, 0, 0, 0}};
    private static char board2[][] = {{'*', '*', '*', '*'},
    {'*', '*', '*', '*'},
    {'*', '*', '*', '*'},
    {'*', '*', '*', '*'}};

    public static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void printSolution(char board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static boolean isValid(int row, int col) {
        int i, j;
        for (i = 0; i < N; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (i = 0; i < N; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i < N && j < N; i++, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; j < N && i >= 0; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void solve() {
        int numSolutions = 0;
        Stack<String> stac = new Stack<>();
        String currentPosition = "0,0";
        while (true) {
            String[] arr = currentPosition.split(",");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            for (int i = a; i < N; i++) {
                for (int j = b; j < N; j++) {
//                    System.out.println(i + "," + j);
                    if (isValid(i, j)) {
                        currentPosition = i + "," + j;
                        stac.push(currentPosition);
                        board[i][j] = 1;
                    }
//                    printSolution(board);
//                    System.out.println(stac.getSize());

                }
                b = 0;
            }

            if (stac.getSize() == 4) {
                numSolutions++;
                while (stac.getSize() != 0) {
                    currentPosition = stac.pop();
                    arr = currentPosition.split(",");
                    a = Integer.parseInt(arr[0]);
                    b = Integer.parseInt(arr[1]);
                    board2[a][b] = 'Q';
                }
                printSolution(board2);
                clearBoard();
                currentPosition = nextPosition(currentPosition);

            } else {
                String temp = stac.pop();
                arr = temp.split(",");
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[1]);
                board[a][b] = 0;
                currentPosition = nextPosition(temp);
            }
            if (currentPosition.equals("0,0")) {
                System.out.println("The number of solutions are : " + numSolutions);
                break;
            }
        }
    }

    public static String nextPosition(String currentPosition) {
        String[] arr = currentPosition.split(",");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        if (b == N - 1) {
            if (a == N - 1) {
                a = 0;
                b = 0;
            } else {
                a++;
                b = 0;
            }
        } else {
            b++;

        }
        return a + "," + b;
    }

    public static void clearBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
                board2[i][j] = '*';
            }
        }
    }

}
