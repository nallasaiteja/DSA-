class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        
        int sum = 0;
        
        HashMap<Character,Integer> hm = new HashMap<>();
        while(j<s.length()){
            
            if(hm.containsKey(s.charAt(j))){
                int val = hm.get(s.charAt(j));
                
                hm.put(s.charAt(j),j);
                
                if(i<=val){
                  sum = Math.max(sum,j-i);
                  while(s.charAt(i) != s.charAt(j)){
                      i++;
                  }
                  i++;
                }
            }
            else{
                hm.put(s.charAt(j),j);
            }
                
                j++;

            
            
        }
        sum = Math.max(sum,j-i);
        return sum;
    }
}