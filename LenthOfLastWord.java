 class LenthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = s.length()-1;
        int count=0;
        while(len>=0)
        {
            if (s.charAt(len) !=' '){
                count++;
            }
            else{
                if (count>0){
                    return count;
                }
                
            }
            len--;
        }
        return count;
    }
}