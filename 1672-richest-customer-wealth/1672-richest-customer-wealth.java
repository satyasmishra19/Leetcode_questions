class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = 0;//row = costumer
        int col = 0;// col= wealth
        int min = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(min<sum){
                min=sum;
            }
        }
        return min;
    }
}