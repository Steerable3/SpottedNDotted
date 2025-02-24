import java.util.*;

public class TicTacToe {
    public static void main(String args[]) {
        char[][] field = new char[3][3];
        for (int i=0;i<field.length;i++) {
            for (int j=0;j<field[i].length;j++) {
            field[i][j]= ' ';
            }
        }
        tablePrint(field);
    }
    public static void tablePrint(char[][] table) {
        for (int i=0;i<table.length;i++) {
            for (int j=0;j<table[i].length;j++) {
            System.out.printf("%C", table[i][j]);
            }
        }
    }
}