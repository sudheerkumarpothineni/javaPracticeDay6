public class average {
    public static void main(String[] args){
        int[] numbers = {10, 15, 20, 25, 30};
        int sum = 0;

        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }

        double avg = (double)sum/numbers.length;

        System.out.println("SUM is "+ sum);
        System.out.println("AVG is "+ avg);
    }
}
