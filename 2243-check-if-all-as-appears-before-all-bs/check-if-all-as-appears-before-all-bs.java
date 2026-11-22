class Solution {
    public boolean checkString(String s) {
        int b = -1;
      for(int i = 0;i<s.length();i++){
         char ch = s.charAt(i);;
         if(ch=='b'){
            b = i;
            break;
         }
      }
      if(b!=-1){
        for(int i = b;i<s.length();i++){
         if(s.charAt(i)=='a'){
            return false;
         }
      }
      }
      return true;
    }
}