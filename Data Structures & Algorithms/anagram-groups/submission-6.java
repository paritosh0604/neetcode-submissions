class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> anagram = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            List<Integer> alphabet = new ArrayList<>(Collections.nCopies(26,0));
            for(int j = 0; j < strs[i].length(); j++){
                char ch = strs[i].charAt(j);
                int ascii = ch;
                alphabet.set(ascii-97, alphabet.get(ascii-97)+1);
            }
            if(anagram.get(alphabet)==null){
                List<String> ana = new ArrayList<>();
                ana.add(strs[i]);
                anagram.put(alphabet, ana);
            }
            else{
            List<String> an = anagram.get(alphabet);
            an.add(strs[i]);
            anagram.put(alphabet,an);
            }
        }
        List<List<String>> res = new ArrayList<>();
        anagram.forEach((key, value) -> {
            res.add(anagram.get(key));
        });
        return res;
    }
}
