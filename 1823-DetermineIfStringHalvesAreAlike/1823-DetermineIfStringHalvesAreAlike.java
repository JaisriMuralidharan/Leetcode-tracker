// Last updated: 7/9/2026, 11:27:53 AM
class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int vowelCount = 0, midIdx = s.length()/2;
        for(int i=0;i<midIdx;i++){
            char chA = s.charAt(i), chB = s.charAt(midIdx+i);
            if(set.contains(chA))vowelCount++;
            if(set.contains(chB))vowelCount--;
        }
        return vowelCount==0;
    }
}