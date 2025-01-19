public class LargestEle {
    public static void main(String[] args){

        int[] arr = {2,5,1,3,9};


        int ele = Integer.MIN_VALUE;

        for(int i =0; i < arr.length; i++){
            if(arr[i] > ele){
                ele = arr[i];
            }
        }

        System.out.println(ele);
    }
}
