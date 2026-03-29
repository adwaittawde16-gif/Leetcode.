class Solution {
    public String reverseWords(String s) {
        if(s.equals(null))
        {
            return s;
        }
        String r  = "";
        int i = 0;
        while(i<s.length())
        {
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        String w ="";
        while(i < s.length() && s.charAt(i)!=' ')
        {
            w+=s.charAt(i);
            i++;
        }
        if(!w.equals(""))
        {
            r = w + " " + r;
        }
        }
        if(r.isEmpty())
        {
            return "";
        }
        return r.substring(0,r.length()-1);
    }
 }
 