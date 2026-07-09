// Last updated: 7/9/2026, 11:27:56 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       
        Map<Character,Integer>map = new HashMap<>();
        int max = -1;
        for(int i = 0; i < s.length();i++){
            int count = 0;
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                count = i - map.get(ch);
                max = Math.max(max,count-1);
            }
        }
        return max;
    }
}