import java.io.IOException;
import java.util.*;

public class TabelAdd {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Koliko števil želite generirati? ");
        int length = in.nextInt();
        int[] generated = new int[length];
        for(int i : generated) {
            i = (int)(Math.random()*101);
        }
        System.out.println("Generirana števila so:");
        for(int i : generated) {
            System.out.println(i);
        }
        System.out.printf("Seštevek generiranih števil na rekurzivni način je %d.", addRecursive(generated, 0, length, 0));
        System.out.printf("Seštevek generiranih števil na iterativni način je %d.", addIterative(generated));
    }

    public static int addRecursive(int[] numbers, int index, int length, int result) {
        if(index<length) {
        result = result+numbers[index];
        addRecursive(numbers, index+1, length, result);
        }
        return result;
    }

    public static int addIterative(int[] numbers) {
        int result=0;
        for(int i : numbers) {
            result = result+i;
        }
        return result;
    }
}