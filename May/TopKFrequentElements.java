import java.util.*;

public class TopKFrequentElements {
    public void getFrequency(int[] nums, HashMap<Integer, Integer> map){
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        getFrequency(nums, map);
        int n = nums.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<Integer>());
        }
        for(Map.Entry<Integer, Integer> el : map.entrySet()){
            int key = el.getKey();
            int value = el.getValue();
            list.get(value).add(key);
        }
        int count = 0;
        boolean flag = false;
        for(int i=list.size()-1;i>=0;i--){
            ArrayList<Integer> temp = list.get(i);
            if(temp.size()>0){
                for(int j=0;j<temp.size();j++){
                    answer[count++] = temp.get(j);
                    if(count==k){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                break;
            }
        }
        return answer;
    }
}