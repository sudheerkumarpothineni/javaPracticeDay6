import java.util.Arrays;
public class copy {
    public static void main(String[] args){
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        for (int i=0;i<original.length;i++){
            copy[i] = original[i];
        }

        System.out.println("Orginal is: "+ Arrays.toString(original));
        System.out.println("Copy is: "+ Arrays.toString(copy));
    }
}
