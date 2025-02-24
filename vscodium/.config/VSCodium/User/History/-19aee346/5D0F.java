import java.util.*;

public class TicTacToe {
    static boolean player1=true;
    static char[][] table = new char[3][3];
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        tableFormat();
        int turnTrack=0;
        while (turnTrack<=9 && winCheck()==false) {
            turnTrack++;
            turn();

        }
    }
    public static void tablePrint() {
        System.out.printf("\n%C%C%C", 'A', 'B', 'C');
        for (int x=0; x<table.length; x++) {
            System.out.printf("\n%d", i+1);
            for (int y=0; y<table[x].length; y++) {
                System.out.printf("%C", table[x][y]);
            }
        }
        System.out.printf("\n%C%C%C", 'A', 'B', 'C');
    }
    public static void tableFormat() {
        for (int x=0; x<table.length; x++) {
            for (int y=0; y<table[x].length; y++) {
                table[x][y] = '#';
            }
        }
    }
    public static void turn() {
        System.out.printf("%C so na potezi. Vnesite koordinate postavitve:");
        
        player1=!player1;
    }
    public static boolean winCheck() {
        
    }
}