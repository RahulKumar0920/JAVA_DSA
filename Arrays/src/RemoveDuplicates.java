public class RemoveDuplicates {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){

        int[] arr = {1,1,2,2,2,3,3};


        int i = 0;
        int j = 1;

        while(j < arr.length){

            if(arr[i] == arr[j]){
                j++;
            }else{
                swap(arr,i+1,j);
                i++;
                j++;
            }
        }


        for(int it : arr){
            System.out.print(it);
        }

        System.out.println("Unique Elements : " + (i + 1));

    }
}
