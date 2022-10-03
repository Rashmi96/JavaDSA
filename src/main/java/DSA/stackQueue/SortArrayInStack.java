package DSA.stackQueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Stack;

public class SortArrayInStack {

    public static void main(String args[]) throws JsonProcessingException {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(15);
        stack.push(12);
        stack.push(8);
        int element = 12;

        sortArray(stack);
        System.out.println(new ObjectMapper().writeValueAsString(stack));
    }


    private static void sortArray(Stack<Integer> stack) {

        if(stack.size()<=0){
            return;
        }

        int i = stack.pop();

        sortArray(stack);

        addToTop(stack,i);
    }

    private static void addToTop(Stack<Integer> stack, int element) {

        if(stack.size()<=0 || (stack.size() >0 && stack.peek()<element)){
            stack.push(element);
            return;
        }

        int i = stack.pop();

        addToTop(stack,element);

        stack.push(i);
    }
}
