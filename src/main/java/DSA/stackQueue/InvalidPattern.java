package DSA.stackQueue;

import java.util.Stack;

public class InvalidPattern {

    public static void main(String[] args){
        String s = "{{}()((}";
        boolean b = checkPattern(s);
        System.out.println(b);

    }

    private static boolean checkPattern(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'){
                char c = stack.pop();
                if(s.charAt(i) == '}'){
                    if('{'!= c){
                        return false;
                    }
                }
                else if(s.charAt(i) == ']'){
                    if('['!= c){
                        return false;
                    }
                }
                else if(s.charAt(i) == ')'){
                    if('('!= c){
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
