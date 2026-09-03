class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        Map<Character,Character> clstoopn=new HashMap<>();
        clstoopn.put(']','[');
        clstoopn.put(')','(');
        clstoopn.put('}','{');
        for(char si : s.toCharArray()){
            if(clstoopn.containsKey(si)){
                if(!st.isEmpty() && st.peek()==clstoopn.get(si)){
                    st.pop();
                }
                else {
                    return false;
                }

            }else {
                st.push(si);
            }
        }
        return st.isEmpty();
    }
}
