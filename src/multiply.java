import java.util.Arrays;

public class multiply {
    public static void main(String[] args){
        int[] numbers = {5, 10, 15, 20, 25};

        for (int i=0;i<numbers.length;i++){
            numbers[i] = numbers[i]*2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
