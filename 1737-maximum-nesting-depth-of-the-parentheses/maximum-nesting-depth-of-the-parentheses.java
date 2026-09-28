class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
      int ans = 0;
      int count = 0;
      for(int i = 0;i<s.length();i++){
         char ch = s.charAt(i);
         if(ch!='(' && ch!=')') continue;
         if(ch=='('){
            st.push(ch);
            count++;
         }
         else if(ch==')'){
            st.pop();
            count--;
         }
         ans = Math.max(ans,count);
         
      }
      return ans;
    }
}