import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        List<List<String>> allRobotPaths = new ArrayList<>();
        
        for (int[] route : routes) {
            List<String> paths = new ArrayList<>(); 
            
            int currR = points[route[0] - 1][0];
            int currC = points[route[0] - 1][1];
            paths.add(currR + "," + currC);
            
            for (int i = 1; i < route.length; i++) {
                int targetR = points[route[i] - 1][0];
                int targetC = points[route[i] - 1][1];
                
                while (currR != targetR) {
                    currR += (targetR > currR) ? 1 : -1;
                    paths.add(currR + "," + currC);
                }
                
                while (currC != targetC) {
                    currC += (targetC > currC) ? 1 : -1;
                    paths.add(currR + "," + currC);
                }
            }
            allRobotPaths.add(paths);
        }
        
        int answer = 0;
        int maxTime = 0;
        for (List<String> paths : allRobotPaths) {
            maxTime = Math.max(maxTime, paths.size());
        }
        
        for (int i = 0; i < maxTime; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (List<String> paths : allRobotPaths) {
                if (i < paths.size()) {
                    String pos = paths.get(i);
                    map.put(pos, map.getOrDefault(pos, 0) + 1);
                }
            }
            
            for (int count : map.values()) {
                if (count > 1) answer++;
            }
        }
        
        return answer;
    }
}
