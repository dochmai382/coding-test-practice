class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        long start = 1;
        long end = 100000;
        
        int minLevel = (int) end;
        
        while (start <= end) {
            long mid = start + (end - start) / 2;
            
            if (check(mid, limit, diffs, times)) {
                minLevel = (int) mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return minLevel;
    }
    
    private boolean check(long level, long limit, int[] diffs, int[] times) {
        long totalTime = 0;
        int n = diffs.length;
        
        totalTime += times[0];
        
        for (int i = 1; i < n; i++) {
            long diff = diffs[i];
            long currTime = times[i];
            long prevTime = times[i - 1];
            
            if (diff <= level) {
                totalTime += currTime;
            } else {
                long k = diff - level;
                long wrongTime = (currTime + prevTime) * k;
                totalTime += wrongTime + currTime;
            }
            
            if (totalTime > limit) return false;
        }
        
        return totalTime <= limit;
    }
}