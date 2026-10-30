public class secondLargest {
    public static void main(String[] args){
        int[] numbers = {15, 50, 25, 40, 10};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
//                break;
            }else if(numbers[i] < largest && numbers[i] > secondLargest){
                secondLargest = numbers[i];
//                break;
            }
        }

        System.out.println("Largest Number is "+ largest);
        System.out.println("Second Largest Number is "+ secondLargest);
    }
}
