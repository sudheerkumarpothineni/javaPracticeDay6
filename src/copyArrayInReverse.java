import java.util.Arrays;
public class copyArrayInReverse {
    public static void main(String[] args){
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        for (int i=original.length-1;i>=0;i--){
            copy[original.length-1-i] = original[i];
        }

//        copy[0] = 100;

        System.out.println("Orginal is: "+ Arrays.toString(original));
        System.out.println("Copy is: "+ Arrays.toString(copy));
    }
}
