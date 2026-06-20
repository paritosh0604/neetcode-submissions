class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map1.get(ch)==null)
            map1.put(ch, 0);
            map1.put(ch,map1.get(ch)+1);
        }
        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(map2.get(ch)==null)
            map2.put(ch, 0);
            map2.put(ch,map2.get(ch)+1);
        }
        return map1.equals(map2);
    }
}
