class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCap(word)||onlyOne(word)||allSmall(word))
        {
        return true;
         }
    return false;        
    }
    public boolean allCap(String word)
    {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
        if(word.length()==count)
        {
            return true;
        }
        return false;
    }
    public boolean onlyOne(String word)
{
    if(!Character.isUpperCase(word.charAt(0)))
    {
        return false;
    }

    for(int i = 1; i < word.length(); i++)
    {
        if(!Character.isLowerCase(word.charAt(i)))
        {
            return false;
        }
    }
    return true;
}
    public boolean allSmall(String word)
    {
            
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                count++;
            }
        }
        if(word.length()==count)
        {
            return true;
        }
        return false;
    }
}