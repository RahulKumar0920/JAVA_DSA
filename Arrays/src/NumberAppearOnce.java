import java.util.HashMap;
import java.util.Map;

public class NumberAppearOnce {
    public static void main(String[] args){

        int[] arr = {4,1,2,1,2};


        //Optimal approach
        int xor = 0;

        for(int i= 0; i < arr.length; i++){
            xor = xor ^ arr[i];
        }

        System.out.println(xor);


        /* Time taking approach
        Map<Integer, Integer> frequency = new HashMap<>();


        for(int i = 0; i < arr.length; i++){
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0) + 1);
        }

        for(Map.Entry<Integer, Integer> it : frequency.entrySet()){
            if(it.getValue() == 1){
                System.out.println(it.getKey());
            }
        }

         */

    }
}
