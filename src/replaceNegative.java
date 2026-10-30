import java.util.Arrays;

public class replaceNegative {
    public static void main(String[] args){
        int[] numbers = {10, -5, 20, -15, 30, -2};

        for (int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                numbers[i]=0;
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}
