import java.util.ArrayList;
import java.util.HashMap;

public class UnionTwoArray {
    public static void main(String[] args){

        int[] arr1 = {-7 ,8};
        int[] arr2 = {-8 ,-3 ,8};


        HashMap<Integer, Integer> frequency = new HashMap();
        ArrayList<Integer> union = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            frequency.put(arr1[i],frequency.getOrDefault(arr1[i],0) + 1);
        }


        for(int j = 0; j < arr2.length; j++){
            frequency.put(arr2[j], frequency.getOrDefault(arr2[j], 0) + 1);
        }

        for(int it : frequency.keySet()){
            union.add(it);
        }

        union.sort(null);

        for(int it : union){
            System.out.print(it + " ");
        }

    }
}
