class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0, start = -1;

        Map<Character, Integer> freq = new HashMap<>();

        for(int end = 0; end<s.length(); end++){
            char c = s.charAt(end);

            freq.put(c, freq.getOrDefault(c,0)+1);

            while(freq.get(c) > 2){
                start++;
                char st = s.charAt(start);
                freq.put(st, freq.get(st)-1);
            }

            ans = Math.max(ans, end-start);
        }

        return ans;
    }
}