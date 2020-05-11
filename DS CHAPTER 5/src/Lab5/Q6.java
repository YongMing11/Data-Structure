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
public class Q6 {

    static char[][] maze;
    static char[][] mirrorMaze;

    public static void main(String[] args) {
        initializeMaze();
        System.out.println("The original maze is");
        printSolution();
        System.out.println("");
        findRoute();
    }

    public static void findRoute() {
        Stack<Integer> move = new Stack<>();
        int point[] = startandend();
        int row = point[0], column = point[1];
        int endrow = point[2], endcolumn = point[3];
        boolean valid = false;
        while (true) {

            valid = false;
            //up
            if (isValid(row - 1, column)) {
//                System.out.println("move 1");
                row--;
                move.push(1);
                mirrorMaze[row][column] = '.';
                valid = true;
            } //down
            else if (isValid(row + 1, column)) {
//                System.out.println("move 2");
                row++;
                move.push(2);
                mirrorMaze[row][column] = '.';
                valid = true;
            } //left
            else if (isValid(row, column - 1)) {
//                System.out.println("move 3");
                column--;
                move.push(3);
                mirrorMaze[row][column] = '.';
                valid = true;
            } //right
            else if (isValid(row, column + 1)) {
//                System.out.println("move 4");
                column++;
                move.push(4);
                mirrorMaze[row][column] = '.';
                valid = true;
            }
            if (!valid) {
                mirrorMaze[row][column] = '#';
                int temp = backtrack(move);
                switch (temp) {
                    case 1: {
                        row--;
                        break;
                    }
                    case 2: {
                        row++;
                        break;
                    }
                    case 3: {
                        column--;
                        break;
                    }
                    case 4: {
                        column++;
                        break;
                    }
                    default:
                        break;
                }
            }
            if (row == endrow && column == endcolumn) {
                mirrorMaze[row][column]='F';
                System.out.println("The Solution is");
                printSolution();
                break;
            }
        }
    }

    public static void printSolution() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (mirrorMaze[i][j] == '.') {
                    System.out.print(mirrorMaze[i][j]);
                } else {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println("");
        }
    }

    public static void initializeMaze() {
        //size 10 X 20
        maze = new char[][]{{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', 'S', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', 'F', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#'},
        {'#', ' ', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#'},
        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', '#', '#', ' ', '#'},
        {'#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', '#', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
        {'#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};
        mirrorMaze = new char[][]{{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', 'S', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', 'F', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#'},
        {'#', ' ', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#'},
        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', '#', '#', ' ', '#'},
        {'#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', '#', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
        {'#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};
    }

    private static boolean isValid(int row, int column) {
        switch (mirrorMaze[row][column]) {
            case ' ':
                return true;
            case '#':
                return false;
            case 'F':
                return true;
        }
        return false;
    }

    private static int backtrack(Stack<Integer> a) {
        int b = 0;
        if (a.isEmpty()) {
            return -1;
        } else {
            b = a.pop();
        }
        switch (b) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 4;
            case 4:
                return 3;
            default:
                return -1;
        }
    }

    private static int[] startandend() {
        int[] a = new int[4];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    a[0] = i;
                    a[1] = j;
                }
                if (maze[i][j] == 'F') {
                    a[2] = i;
                    a[3] = j;
                }
            }
        }
        return a;
    }
}
