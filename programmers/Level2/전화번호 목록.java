import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hm = new HashMap<>();

        for(String s : phone_book) {
            hm.put(s, 1);
        }

        for(int i=0; i< phone_book.length; i++) {
            for(int j=0; j<phone_book[i].length(); j++) {
                String key = phone_book[i].substring(0,j);
                if(hm.containsKey(key)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String[] phone_book = {"119", "97674223", "1195524421"};

        System.out.println(T.solution(phone_book));
    }
}