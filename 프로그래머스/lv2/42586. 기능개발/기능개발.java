import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        int day = 1;
        
        for(int i = 0; i < progresses.length; i++){
            que.add(progresses[i]);
        }
        
        int at = 0;
        int count = 0;
        while(!que.isEmpty()){
            int data = que.peek() + (day * speeds[at]);

            if(data >= 100){
                while(!que.isEmpty()){
                    int data2 = que.peek() + (day * speeds[at]);
                    if(data2 < 100) break;
                    
                    que.poll();
                    at++;
                    count++;
                }
                arr.add(count);
            }
            count = 0;
            day++;           
        }
        
        int answer[] = new int [arr.size()];
        
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}