import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets,new Comparator<int []>(){
       @Override
       public int compare(int[] o1, int[] o2){
           if(o2[1] == o1[1])return o1[0] - o2[0];
           return o1[1] - o2[1];
       }
   });
        
        int nowEnd = targets[0][1];
        answer = 1;
        
        for(int i = 0; i < targets.length; i++){
            if(nowEnd <= targets[i][0]){
                nowEnd = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}