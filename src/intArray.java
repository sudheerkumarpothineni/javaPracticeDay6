public class intArray {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};
        int arrayLength = numbers.length;

        for(int i=0;i<arrayLength;i++){
            System.out.println(numbers[i]);
        }

        System.out.println("Array Length is "+ arrayLength);
    }
}
