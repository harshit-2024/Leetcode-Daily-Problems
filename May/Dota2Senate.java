import java.util.*;
class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Character> q = new LinkedList<>();
        Queue<Character> aq = new LinkedList<>();
        int l = senate.length();
        for(int i=0;i<l;i++){
            q.add(senate.charAt(i));
        }
        char ch = ' ';
        while(q.size()>0){
            ch = q.poll();
            if(aq.size()==0 || aq.peek()==ch){
                aq.add(ch);
            }
            else{
                if(ch=='R' && aq.peek()=='D' || ch=='D' && aq.peek()=='R'){
                    q.add(aq.poll());
                }
            }
        }
        if(ch=='R')
            return "Radiant";
        return "Dire";
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */