public class SecondLargestSmallest {
    public static void main(String[] args){

        int[] arr = {1,2,4,7,7,5};

        //For Second Largest
        int largeEle = Integer.MIN_VALUE;
        int secondLargeEle = Integer.MIN_VALUE;

        //For Second Smallest
        int smallEle = Integer.MAX_VALUE;
        int secondSmallEle = Integer.MAX_VALUE;


        //Logic
        for(int i = 0; i < arr.length; i++){

            //For Second Largest
            if(arr[i] > largeEle){
                secondLargeEle = largeEle;
                largeEle = arr[i];
            }else if(arr[i] > secondLargeEle && arr[i] != largeEle){
                secondLargeEle = arr[i];
            }


            //For Second Small
            if(arr[i] < smallEle){
                secondSmallEle = smallEle;
                smallEle = arr[i];
            }else if(arr[i] < secondSmallEle && arr[i] != smallEle){
                    secondSmallEle = arr[i];
            }

        }


        System.out.println("Second Large = " + secondLargeEle);
        System.out.println("Second Small = " + secondSmallEle);
    }
}
