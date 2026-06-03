class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                List<String> strings = new ArrayList<>();
                strings.add(str);
                map.put(s, strings);
            }
        }

        return new ArrayList<>(map.values());
    }
}
