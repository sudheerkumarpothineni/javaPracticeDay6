public class index {
    public static void main(String[] args){
        int[] numbers = {15, 25, 35, 45, 55};
        int index = -1;
        boolean found = false;
        int target = 45;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == target){
                found =true;
                index = i;
                break;
            }
        }

        System.out.println("Element Found "+ found);
        System.out.println("Element Index is "+ index);
    }
}
