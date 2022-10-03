package DSA.stackQueue;

import java.util.Stack;

public class RedundantBrackets {

    public static void main(String args[]){
        String str = "(a+b)";
        boolean b = checkRedundancy(str);
        System.out.println(b);

    }

    private static boolean checkRedundancy(String str) {
        char [] charArr = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i< charArr.length; i++){
            if(charArr[i] == '(' || charArr[i] == '+' || charArr[i] == '-' ||
                    charArr[i] == '*' || charArr[i] == '/' || charArr[i] == '%'){
                stack.push(charArr[i]);
            }
            else if(charArr[i] == ')'){
                boolean redundant = true;
                while(stack.peek() != '('){
                    char top = stack.peek();
                    if(top == '+' || top == '-' ||
                            top == '*' || top == '/' || top == '%'){
                        stack.pop();
                        redundant = false;
                    }
                }
                if(redundant == true)
                    return true;
                stack.pop();
            }
        }
        return false;
    }
}
