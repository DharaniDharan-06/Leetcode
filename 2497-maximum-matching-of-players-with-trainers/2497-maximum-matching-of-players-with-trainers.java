class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;
        int r = 0;
        int l = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(r<players.length && l<trainers.length){
            if(players[r]<=trainers[l]){
                r++;
                count++;
            }
            l++;
        }
       return count;
    }
}