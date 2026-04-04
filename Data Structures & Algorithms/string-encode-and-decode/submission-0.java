
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s :  strs){
            sb.append(s.length()).append("#").append(s);
        }// ["Hello","World"] -> 5#Hello5#World
        return sb.toString();
    }

  public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;
    
    while (i < str.length()) {
        int hashIndex = str.indexOf('#', i);
        int len = Integer.parseInt(str.substring(i, hashIndex));
        String word = str.substring(hashIndex + 1, hashIndex + 1 + len);
        result.add(word);
        i = hashIndex + 1 + len;
    }
    return result;
}
}
