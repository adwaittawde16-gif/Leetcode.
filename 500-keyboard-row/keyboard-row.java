class Solution {
    public String[] findWords(String[] words) {
        // Map each letter to its corresponding row number
        int[] rowMap = new int[26];
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (char c : row1.toCharArray()) rowMap[c - 'a'] = 1;
        for (char c : row2.toCharArray()) rowMap[c - 'a'] = 2;
        for (char c : row3.toCharArray()) rowMap[c - 'a'] = 3;

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            int row = rowMap[lower.charAt(0) - 'a'];
            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (rowMap[c - 'a'] != row) {
                    valid = false;
                    break;
                }
            }
            if (valid) result.add(word);
        }

        return result.toArray(new String[0]);
    }
}
