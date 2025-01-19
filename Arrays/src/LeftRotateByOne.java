public class LeftRotateByOne {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7};


        int k = 3;


        // Left to Right Rotate
        while(k != 0){

            int temp = arr[0];

            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i+1];
            }

            arr[arr.length - 1] = temp;

            k--;

        }


        for(int it : arr){
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
