import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public static void main(String[] args){

        HashMap<Integer, Integer> frequency = new HashMap<>();

        int n = 5;
        int[] arr = {1,2,4,5};


        for(int num : arr){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }


        for(int i = 1; i <= n; i++){
            if(!frequency.containsKey(i)){
                System.out.println(i);
                break;
            }
        }
    }
}
