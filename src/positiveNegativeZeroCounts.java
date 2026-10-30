public class positiveNegativeZeroCounts {
    public static void main(String[] args){
        int[] numbers = {12, -7, 0, -15, 8, -2, 0, 25};

        int pC=0;
        int nC=0;
        int zC=0;

        for (int i=0; i<numbers.length;i++){
            if(numbers[i]>0){
                pC++;
            }

            else if (numbers[i]<0) {
                nC++;
            }

            else if (numbers[i]==0) {
                zC++;
            }
        }

        System.out.println("Positive count is :"+ pC);
        System.out.println("Negative count is :"+ nC);
        System.out.println("Zero count is :"+ zC);
    }
}
