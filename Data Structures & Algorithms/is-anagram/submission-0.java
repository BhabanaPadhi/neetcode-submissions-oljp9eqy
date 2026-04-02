class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

// s = "racecar"
// r=2, a=2, c=2, e=1
            HashMap<Character,Integer> hashmap1 = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                char ch1 = s.charAt(i); // r
                hashmap1.put(ch1, hashmap1.getOrDefault(ch1, 0) + 1);
            }
// t= "c  arrace"
// 
            for(int i = 0; i < t.length(); i++){
                char ch2 = t.charAt(i); // c
                hashmap1.put(ch2, hashmap1.getOrDefault(ch2, 0) - 1);
            }

            for(int count : hashmap1.values()){
                if(count != 0) return false;
            }
            return true;
    }
}
