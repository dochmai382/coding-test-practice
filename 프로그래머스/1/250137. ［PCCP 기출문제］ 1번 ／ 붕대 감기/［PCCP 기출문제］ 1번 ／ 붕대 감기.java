/*
t초 동안 - 1초마다 x만큼 체력 회복
t초 연속 성공 - y만큼 추가 회복

현재체력 <= 최대 체력

공격당하면 기술 취소 - 체력회복불가
즉시 붕대 감기 다시 사용, 연속성공 시간 = 0 초기화

피격시 현재체력 - 피해량
현재체력 == 0 회복불가

bandage[] = {시전시간, 초당회복량, 추가회복량}
health = 최대체력
attack[][] = 공격시간/피해량

return health == 0 ? -1 : 남은 체력

*/



class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currHealth = health;
        int seq = 0;
        int time = attacks[attacks.length - 1][0];

        int idx = 0;
        for (int i = 0; i <= time; i++) {
            if (seq == bandage[0]) {
                currHealth = Math.min(health, currHealth + bandage[2]);
                seq = 0;
            }            
            
            if (i == attacks[idx][0]) {
                currHealth -= attacks[idx][1];
                if (currHealth <= 0) return -1;
                
                seq = 0;
                idx++;
            } else {
                currHealth = Math.min(health, currHealth + bandage[1]);
                seq++;
            }
        } 
        
        return currHealth;
    }
}


