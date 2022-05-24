import java.util.*;
import java.io.*;
import java.util.ArrayList;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Stack<Character> stack = new Stack<Character>();
        int stack_size ;
        
        //sorting of array
        Arrays.sort(strs,new Sortbylen());
        //push elements in stack
        for(char element : strs[0].toCharArray()){
            stack.push(element);
        }
        
        //compare to other and pop if not match
        for(String element : strs){
            stack_size = 0;
            while(stack.size() > stack_size){
                
                if(stack.elementAt(stack_size) != element.charAt(stack_size)){
                    while(stack.size() > stack_size){
                        stack.pop();
                    }
                    break ;
                }
                stack_size++;
                /*
                if(stack.elementAt(stack_size) != element.charAt(stack_size)){
                    
                    stack.pop();
                    stack_size = stack.size()-1;
                }
                else{
                    stack_size--;
                }
                */
            }
        }
        
         
        
        return convert(stack);  
    }
    
    String convert(Stack<Character> stack){
        String st="";
        while(!stack.empty()){
            st=stack.pop()+st;
        }
        
        return st;
    }
}

class Sortbylen implements Comparator<String> {
    
    public int compare(String a, String b)
    {
        return a.length() - b.length();
    }
}