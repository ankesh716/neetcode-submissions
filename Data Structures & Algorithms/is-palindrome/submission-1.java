class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch=Character.toLowerCase(s.charAt(i));

            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
        }
        StringBuilder reverseStr=new StringBuilder(str);
        reverseStr.reverse();

        return str.toString().equals(reverseStr.toString());
    }
}
