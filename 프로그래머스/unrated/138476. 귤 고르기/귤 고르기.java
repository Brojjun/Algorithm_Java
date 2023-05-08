import java.util.*;
import java.util.Map.Entry;
class Solution {
    
    
    public int solution(int k, int[] tangerine) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i = 0;i<tangerine.length;i++){
            int cnt = 1;

            if(map.containsKey(tangerine[i])){
                cnt = map.get(tangerine[i]) + 1;
            }
            map.put(tangerine[i],cnt);
        }
        
        ArrayList <Integer> arr = new ArrayList<>();
        for(Entry<Integer,Integer> now : map.entrySet()){
            arr.add(now.getValue());
        }
        Collections.sort(arr);
        int n = arr.size();
        int answer = 0;
        while(k > 0){
            answer++;
            k -= arr.get(n-1);
            n--;
        }
        return answer;
    }
}