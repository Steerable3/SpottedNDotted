package Java;
import java.util.*;

public class TabelAdd {
    public static void main(String[] args) {
        System.out.println("Koliko števil želite generirati? ");
        int length = scanInt();
        int[] generated = new int[length];
        for(int i=0; i<length; i++) {
            generated[i] = (int)(Math.random()*101);
        }
        System.out.println("Generirana števila so:");
        for(int i : generated) {
            System.out.println(i);
        }
        System.out.printf("Seštevek generiranih števil na rekurzivni način je %d.\n", addRecursive(generated, 0,  0));
        System.out.printf("Seštevek generiranih števil na iterativni način je %d.\n", addIterative(generated));
    }

    public static int addRecursive(int[] numbers, int index, int result) {
        if(index<numbers.length) {
            result = result+numbers[index];
            return addRecursive(numbers, index+1, result);
        }
        else
            return result;
    }

    public static int addIterative(int[] numbers) {
        int result=0;
        for(int i : numbers) {
            result = result+i;
        }
        return result;
    }

    public static int scanInt() { // Preverja ce je v scannerju res int
        int input;
        Scanner in = new Scanner(System.in);
        while(true) {
            if(in.hasNextInt()){
                input = in.nextInt();
                break;
            }
            else {
                System.out.println("Niste vnesli celega stevila. Poskusite ponovno.");
                in.next();
            }
        }
        in.close();
        return input;
    }
}