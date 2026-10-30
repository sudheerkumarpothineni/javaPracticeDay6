public class countEvenNumbers {
    public static void main(String[] args){
        int[] numbers = {5, 10, 14, 17, 22, 25, 30};
        int count=0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                count++;
            }
        }

        System.out.println("Even numbers count is "+ count);
    }
}
