import java.util.Scanner;

public class EightQueens {
    static int[] queens = new int[8];
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        queens[0] = row;
        placeQueens(row + 1);
    }

    private static void placeQueens(int row) {
        if (row == 8) {
            count++;
            printQueens();
        } else {
            for (int col = 0; col < 8; col++) {
                if (isValid(row, col)) {
                    queens[row] = col;
                    placeQueens(row + 1);
                }
            }
        }
    }

    private static boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col) {
                return false;
            }
            if (Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens() {
        System.out.println("Solution " + count + ":");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

