public class countOddNumbers {
    public static void main(String[] args){
        int[] numbers = {11, 20, 33, 46, 51, 17, 24};
        int count=0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
                count++;
            }
        }

        System.out.println("Odd numbers count is "+ count);
    }
}
