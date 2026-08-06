class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {   String Arr[]=new String[strs.length];
        for(int i=0;i<strs.length;i++)
        {
           char arr[]=strs[i].toCharArray();
           Arrays.sort(arr);
           Arr[i]=new String(arr);
        }
        HashMap<String, List<String>> s1=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            if(s1.containsKey(Arr[i]))
            {
                s1.get(Arr[i]).add(strs[i]);
            }
            else 
            {
                ArrayList <String> s2=new ArrayList<>();
                s2.add(strs[i]);
                s1.put(Arr[i],s2);

            }
            
        }

        return new ArrayList(s1.values());
        
    }
}
