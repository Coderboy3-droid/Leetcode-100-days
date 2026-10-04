class Solution {
    public int reverseDegree(String s) {
        int reverse_degree = 0 , product , ans = 0;
        for (int i = 0 ; i <s.length() ; i++){
            reverse_degree = 'z' - s.charAt(i) + 1;
            product = (i+1) * reverse_degree;
            ans = ans + product; 
        }
        return ans;
        
        
    }
}