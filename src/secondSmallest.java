public class secondSmallest {
    public static void main(String[] args){
        int[] numbers = {25, 8, 40, 15, 30};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] < smallest){
                secondSmallest = smallest;
                smallest = numbers[i];
//                break;
            }else if(numbers[i] > smallest && numbers[i] < secondSmallest){
                secondSmallest = numbers[i];
//                break;
            }
        }

        System.out.println("Smallest Number is "+ smallest);
        System.out.println("Second Smallest Number is "+ secondSmallest);
    }
}
