public class smallestNumber {
    public static void main(String[] args){
        int[] numbers = {45,18,32,7,25};
        int smallest = numbers[0];

        for (int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest is "+ smallest);
    }
}
