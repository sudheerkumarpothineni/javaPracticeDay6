public class sumEvenNumbers {
    public static void main(String[] args){
        int[] numbers = {3, 6, 9, 12, 15, 18};
        int sum = 0;

        for (int i=0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                sum += numbers[i];
            }
        }

        System.out.println("Sum of even numnbers is: "+ sum);
    }
}
