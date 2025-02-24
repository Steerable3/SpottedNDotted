import java.util.*;

public class TicTacToe {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] table = new int[3][3];
    }
    public static void tablePrint(int[][] table) {
        System.out.printf("%C%C%C", "A", "B", "C");
        for (int x=0; x<table.length; x++) {
            for (int y=0; y<table[x].length; y++) {
                System.out.printf("%C", table[x][y]);
            }
        }
        System.out.printf("%C%C%C", "A", "B", "C");
    }
    public static void tableFormat(int[][] table) {
        System.out.printf("%C%C%C", "A", "B", "C");
        for (int x=0; x<table.length; x++) {
            for (int y=0; y<table[x].length; y++) {
                System.out.printf("%C", table[x][y]);
            }
        }
        System.out.printf("%C%C%C", "A", "B", "C");
    }
    public static void turn(int[][] table, boolean player1) {
        System.out.printf("%C so na potezi. Vnesite koordinate postavitve:");
    }
}