class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map=new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

    Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }

                if(st.pop()!=map.get(ch)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
