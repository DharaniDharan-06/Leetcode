class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ss = "";
        for(int i=0;i<words.size();i++){
                String str = words.get(i);
                char ch = str.charAt(0);
                ss+=ch;
        }
        if(ss.equals(s)){
            return true;
        }
        return false;
    }
}