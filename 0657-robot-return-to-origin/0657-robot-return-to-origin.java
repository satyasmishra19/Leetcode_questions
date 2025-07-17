class Solution {
    public boolean judgeCircle(String moves) {
        int rl = 0;
        int ud = 0;
        for(int i = 0 ; i < moves.length() ; i++){
            char ch = moves.charAt(i);
            if(ch == 'R'){
                rl++;
            }
            else if(ch == 'L'){
                rl--;
            }
            else if(ch == 'U'){
                ud++;
            }
            else{
                ud--;
            }
        }
        if(rl==0 && ud==0){
            return true;
        }
        return false;
    }
}