public class sumOddNumbers {
    public static void main(String[] args){
        int[] numbers = {4, 7, 10, 13, 16, 19};
        int sum = 0;

        for (int i=0;i<numbers.length;i++){
            if (numbers[i]%2!=0){
                sum += numbers[i];
            }
        }

        System.out.println("Sum of odd numnbers is: "+ sum);
    }
}
