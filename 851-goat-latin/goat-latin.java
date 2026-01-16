class Solution {
    public String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (vowels.indexOf(word.charAt(0)) != -1) {
                result.append(word);
            } else {
                result.append(word.substring(1))
                      .append(word.charAt(0));
            }

            result.append("ma");
            result.append("a".repeat(i + 1));

            if (i < words.length - 1)
                result.append(" ");
        }

        return result.toString();
    }
}
