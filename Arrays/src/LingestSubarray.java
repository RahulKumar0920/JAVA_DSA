public class LingestSubarray {
    public static void main(String[] args){

        int[] arr = {2,3,5};
        int k = 5;


        int length = 0;
        for(int i = 0; i < arr.length; i++){

            int sum = 0;
            for(int j = i; j < arr.length; j++){

                sum += arr[j];

                if(sum == k){
                    length = Math.max(length, j - i + 1);
                }

            }

        }

        System.out.println(length);

    }
}
