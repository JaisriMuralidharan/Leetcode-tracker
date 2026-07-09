// Last updated: 7/9/2026, 11:27:44 AM
class Solution {
    public static boolean checkPangram(String sentence){
        int letters[] = new int[26];
        for(char ch: sentence.toCharArray()){
            letters[ch-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<letters.length;i++){
            if(letters[i]<min){
                min = letters[i];
            }
        }
        if(min>=1){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkIfPangram(String sentence) {
        return checkPangram(sentence);
    }
}