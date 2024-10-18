
import java.util.*;

public class ArrayPermutations {
    static void permutations(int[] nums, int idx, List<List<Integer>> list){
        int n = nums.length;
        if(idx == n){
            List<Integer> li = new ArrayList<>();
            for(int i = 0; i < n; i++){
                li.add(nums[i]);
            }
            list.add(li);
            return;
        }

        for(int i = idx; i < n; i++){
            swap(i,idx,nums);
            permutations(nums,idx+1,list);
            swap(i,idx,nums);
        }
    }

    public static void swap(int i,int idx,int[] nums){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = {1,2,3};
        int idx = 0;
        permutations(nums,idx,list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
