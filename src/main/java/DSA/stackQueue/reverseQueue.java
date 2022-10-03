package DSA.stackQueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {

    public static void main(String args[]) throws JsonProcessingException {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

//        Stack<Integer> stack = reverseUsingStack(queue);
//        System.out.println(new ObjectMapper().writeValueAsString(stack));

//        Queue<Integer> queue1 =  reverseUsingRecursion(queue);
//        System.out.println(new ObjectMapper().writeValueAsString(queue1));

        List<Integer> queue2 =  reverseUsingSwap((List<Integer>) queue,0,queue.size()-1);
        System.out.println(new ObjectMapper().writeValueAsString(queue2));
    }

    private static Queue<Integer> reverseUsingRecursion(Queue<Integer> queue){
        if(queue.isEmpty()){
            return queue;
        }
        int element = queue.peek();
        queue.remove();
        reverseUsingRecursion(queue);

        queue.add(element);
        return queue;
    }

    private static Stack<Integer> reverseUsingStack(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.addAll(queue);
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        return stack1;

    }

    private static List<Integer> reverseUsingSwap(List<Integer> queue, int start, int end){
        while(start <= end){
            int temp = queue.get(start);
            queue.set(start,queue.get(end));
            queue.set(end,temp);
            start++;
            end--;
        }
        return queue;
    }

}


