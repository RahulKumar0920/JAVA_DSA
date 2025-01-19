public class CheckSorted {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        //int[] arr = {5,4,6,7,8};

        boolean flag = true;

        /*

        int i = 0;
        int j = 1;

        while(j < arr.length){

            if(arr[i] < arr[j]){
                flag = true;
            }else{
                flag = false;
                break;
            }

            i++;
            j++;

        }
        */


        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }

        System.out.println(flag);

    }
}
