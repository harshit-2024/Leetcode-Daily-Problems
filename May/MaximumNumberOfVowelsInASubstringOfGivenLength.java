import java.util.*;
class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int n = s.length();
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int ans = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(vowel.contains(ch)){
                count++;
            }
            if(i>=(k-1)){
                ans = Math.max(ans, count);
                char front = s.charAt(i-k+1);
                if(vowel.contains(front)){
                    if(count>0)
                        count--;
                }
            }
        }
        return  ans;
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */