public class arraySum {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};
        int arrayLength = numbers.length;
        int sum = 0;

        for(int i=0;i<arrayLength;i++){
            sum += numbers[i];
        }

        System.out.println("Sum of Array Elements "+ sum);
    }
}
