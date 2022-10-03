package DSA.stackQueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Stack;

public class AddElementToLast {

    public static void main(String args[]) throws JsonProcessingException {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(8);
        int element = 12;

        addToLast(stack,element);
        System.out.println(new ObjectMapper().writeValueAsString(stack));
    }

    private static void addToLast(Stack<Integer> stack, int element) {

        if(stack.size()<=0){
            stack.push(element);
            return;
        }

        int i = stack.pop();

        addToLast(stack,element);

        stack.push(i);
    }
}
