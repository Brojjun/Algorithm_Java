import java.util.*;

class Solution {
    static class Point{
        int y=0;
        int x=0;
    }
    public int[] solution(String[] maps) {
        int by = maps.length;
        int bx = maps[0].length();
        
        boolean visit[][] = new boolean[by][bx];
        char[][] map = new char[by][bx];
        for(int i = 0; i < by; i++){
            map[i] = maps[i].toCharArray();
        }
        
        
        
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,1,-1};
        int cnt = 0;
        ArrayList<Integer>arr = new ArrayList();
        
        for(int y = 0; y < by; y++){
            for(int x = 0; x < bx; x++){
                if(visit[y][x] || map[y][x] == 'X')continue;
                Queue <Point> que = new LinkedList<>();
                int score = 0;
                Point start = new Point();
                start.x = x;
                start.y = y;
                visit[y][x] = true;
                que.add(start);
                
                while(!que.isEmpty()){
                    Point now = que.poll();
                    
                    score += (map[now.y][now.x] - '0');
                    for(int i = 0; i < 4; i++){
                        Point next = new Point();
                        next.x = now.x + dx[i];
                        next.y = now.y + dy[i];
                        if(next.x < 0 || next.y < 0 || next.x >= bx || next.y >= by) continue;
                        if(visit[next.y][next.x] || map[next.y][next.x] == 'X') continue;
                        visit[next.y][next.x] = true;
                        que.add(next);
                    }
                }
                arr.add(score);
            }
        }
        
        int answer[] = new int [arr.size()];
        for(int i = 0; i < arr.size();i++){
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        if(arr.size() == 0){
            answer = new int [1];
            answer[0] = -1;
        }
        return answer;
    }
}