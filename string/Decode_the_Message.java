class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder ans =new StringBuilder();
        key=key.replaceAll(" ","");
        HashMap<Character,Character> letter=new HashMap<>();
        char original='a';
        for(int i=0;i<key.length();i++)
        {
            if(!letter.containsKey(key.charAt(i)))
                letter.put(key.charAt(i),original++);
        }
        
        for(int i=0;i<message.length();i++)
        {
            if(letter.containsKey(message.charAt(i)))
            {
                ans.append(letter.get(message.charAt(i)));
            }
            else{
                ans.append(message.charAt(i));
            }
        }
        return ans.toString();
    }
}
