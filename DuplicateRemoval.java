public class DuplicateRemoval {
    public static void removeDuplicate(String str,int idx,String newStr,boolean[] map){
            // base condition
            if(idx==str.length()){
                System.out.println(newStr);
                return;
            }


            // work
            char currChar = str.charAt(idx);
            if(map[currChar-'a']){
                removeDuplicate(str,idx+1,newStr,map);
                
            }
            else{
                map[currChar-'a']=true;
                removeDuplicate(str,idx+1,newStr+currChar,map);
            }
            

    }
    public static void removeAdjacentDuplicate(String str,int idx,String newStr){
        // base condition
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        // work
        char currChar = str.charAt(idx);
        if(newStr.isEmpty() || newStr.charAt(newStr.length()-1) != currChar){
            removeAdjacentDuplicate(str,idx+1,newStr+currChar);
        }
        else{
            // if it's a duplicate we will remove it from last character of our new string
            removeAdjacentDuplicate(str,idx+1,newStr.substring(0,newStr.length()-1));
        }
    }
    public static void main(String[] args) {
        /*
         Remove all adjacent duplicates

         Problem Statement:

         You are given a string s consisting of lowercase English letters.
         A duplicate removal consists of choosing two adjacent and equal letters and removing them.

         We repeatedly make duplicate removals on s until we no longer can.
         Return the final string after all such duplicate removals have been made.

         Example: 
         Input: s = "abbaca"
         Output: "ca"

         */
        boolean[] map = new boolean[26];
        removeDuplicate("abbaca",0,"",map); // this function removes all duplicates not adjacent duplicates

        removeAdjacentDuplicate("abbaca",0,""); //this function will only remove adjacent duplicates characters 

        
    }
}
