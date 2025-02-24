import java.util.*;

public class TabelAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Koliko števil želite generirati? ");
        int[] stevila = new int[10];
        for(int i : stevila) {
            i = (int)(Math.random()*101);
        }
        
    }
}