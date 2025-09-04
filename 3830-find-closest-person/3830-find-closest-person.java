class Solution {
    public int findClosest(int x, int y, int z) {
          int count1 = 0;
          int count2 = 0;
          while(x!=z){
          if(x<z){
             count1++;
             x++;
           }
           else{
            count1++;
            x--;
           }
          }
          while(y!=z){
          if(y<z){
             count2++;
             y++;
           }
           else{
            count2++;
            y--;
           }
          }
          if(count1<count2){
            return 1;
          }
          else if(count1==count2){
            return 0;
          }
          return 2;
    }
}