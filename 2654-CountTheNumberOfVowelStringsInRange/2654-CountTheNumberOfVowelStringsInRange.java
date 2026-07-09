// Last updated: 7/9/2026, 11:27:07 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt=0;
        
        while(left <= right){
            char s = words[left].charAt(0);
            char e = words[left].charAt(words[left].length()-1);
            if(s=='a' ||s=='e' ||s=='i' ||s=='o' ||s=='u'){
                if(e=='a' ||e=='e' ||e=='i' ||e=='o' ||e=='u'){
                    cnt++;
                }
            }
            left++;
        }
        return cnt;
    }
}