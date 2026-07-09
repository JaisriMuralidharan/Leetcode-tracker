// Last updated: 7/9/2026, 11:27:39 AM
class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        String ans[]=new String[arr.length];
        for(String res:arr){
            int index=res.charAt(res.length()-1)-'1';
            ans[index]=res.substring(0,res.length()-1);
        }
        for(String k:ans){
            sb.append(k+" ");
        }
        return sb.toString().trim();
    }
}