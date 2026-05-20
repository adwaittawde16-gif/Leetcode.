class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // For 'a' to 'z'

        // Count letters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false; // Letter not available
            }
            count[c - 'a']--; // Use one instance
        }

        return true;
    }
}
