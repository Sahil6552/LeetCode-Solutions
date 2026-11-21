class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
      int i = 0;
      while(i<s1.length()){
        char ch1 = s1.charAt(i);
        char ch2 = s2.charAt(i);
        if(ch1!=ch2){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            ArrayList<String> list = new ArrayList<>();
            while(i<s1.length() && s1.charAt(i)!=s2.charAt(i)){
                sb1.append(String.valueOf(s1.charAt(i)));
                sb2.append(String.valueOf(s2.charAt(i)));
                i++;
            }
            list.add(sb1.toString());
            list.add(sb2.toString());
            ans.add(list);
        }
        else  i++;
      }
      return ans;
    }
}