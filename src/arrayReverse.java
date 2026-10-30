public class arrayReverse {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        int length = numbers.length;


        for (int i=length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }
    }
}
