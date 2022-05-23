import java.util.*;

class ReverseString {
    public void reverseString(char[] s) {
        char c ;
        for (int i=0;i< Math.floor(s.length/2);i++){
            c=s[s.length-i-1];
            s[s.length-i-1]=s[i];
            s[i]=c;
        }
    }
  public void reverseString1(char[] s) {
        
        Stack<Character> st = new Stack<Character>();
        for (int i=0;i< s.length;i++){
            st.push(s[i]);
        }
        for (int i=0;i< s.length;i++){
            s[i]=st.pop();
        }
    }
}