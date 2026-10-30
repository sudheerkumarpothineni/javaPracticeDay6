public class search {
    public static void main(String[] args){
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;
        boolean found = false;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                found = true;
                break;
            }
        }

        System.out.println("Element Found "+ found);
    }
}
