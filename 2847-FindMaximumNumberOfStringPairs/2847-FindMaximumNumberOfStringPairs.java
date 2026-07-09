// Last updated: 7/9/2026, 11:26:55 AM
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
      int n=words.length;
      int count=0;
      for(int i=0;i<n;i++){
          String s=words[i];
           for(int j=i+1;j<n;j++){
             String sb=new StringBuilder(words[j]).reverse().toString();
               if(s.equals(sb)){
                  count++;
               }
           }
      }
      return count;
    }
}