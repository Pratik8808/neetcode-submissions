class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>s1=new HashMap();
        HashMap<Character,Integer>s2=new HashMap();

        for(int i=0;i<s.length();i++)
        {
            if(s1.containsKey(s.charAt(i)))
            {
               s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
            }
            else
            {
                s1.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++)
        {
            if(s2.containsKey(t.charAt(i)))
            {
                s2.put(t.charAt(i),s2.getOrDefault(t.charAt(i),0)+1);
            }

            else
            {
                s2.put(t.charAt(i),1);
            }
        }

    

       return s1.equals(s2);


    }
}
