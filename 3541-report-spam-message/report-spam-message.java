class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bannedWordsSet = new HashSet<>();
        for(String bannedWord:bannedWords)
        {
            bannedWordsSet.add(bannedWord);
        }
        int count=0;
        for(int i=0;i<message.length;i++)
        {
            if(bannedWordsSet.contains(message[i]))
            {
                count++;
            }
            if(count==2)
            {
                return true;
            }
        }
        return false;
    }
}