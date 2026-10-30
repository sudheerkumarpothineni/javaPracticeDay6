public class countOccurrences {
    public static void main(String[] args){
        int[] numbers = {10, 20, 10, 30, 10, 40, 20};
        int count = 0;
        int target=10;
        
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                count++;
            }
        }

        System.out.println(count);
    }
}
