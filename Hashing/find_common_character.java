// Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
// Example 1:

// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]
// Example 2:

// Input: words = ["cool","lock","cook"]
// Output: ["c","o"]

class Solution {
    public List<String> commonChars(String[] words) {
        String w1 = words[0];
        Map<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<w1.length(); i++){
            hmap.put(w1.charAt(i),hmap.getOrDefault(w1.charAt(i),0)+1);
        }
        for(int i=1; i<words.length; i++){
            String w = words[i];
            Map<Character,Integer> freqMap = new HashMap<>();
            for(int j=0; j<w.length(); j++){
                freqMap.put(w.charAt(j),freqMap.getOrDefault(w.charAt(j),0)+1);
            }

            for(Character key:hmap.keySet()){
                if(freqMap.containsKey(key)){
                    hmap.put(key,Math.min(hmap.get(key),freqMap.get(key)));
                }
                else{
                    hmap.put(key,0);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for(Character key:hmap.keySet()){
            if(hmap.get(key)>0){
                for(int i=0; i<hmap.get(key); i++){
                    result.add(key+"");
                }
            }
        }
        return result;
    }
}
