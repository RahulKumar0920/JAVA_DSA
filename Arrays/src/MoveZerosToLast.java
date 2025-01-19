public class MoveZerosToLast {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){

        int[] arr = {1,0,1};


        int i = 0;
        int j = 1;

        //If order of rest of the element is needed to be maintained
        while(j <= arr.length - 1){

            if (arr[i] != 0 && arr[j] == 0){
                i++;
                j++;
            }else if(arr[i] == 0 && arr[j] == 0){
                j++;
            }else if(arr[i] != 0 && arr[j] != 0){
                i++;
                j++;
            }else{
                swap(arr, i, j);
                i++;
                j++;
            }

        }

        /*
        //If Order didn't need to be maintained
        int i = 0;
        int j = arr.length - 1;

        while(i <= j){

            if(arr[i]  == 0 && arr[j] != 0){
                swap(arr, i, j);
                i++;
                j--;
            }else if(arr[j] == 0){
                j--;
            }else{
                i++;
            }

        }

        */



        for(int it : arr){
            System.out.print(it + " ");
        }

    }
}
