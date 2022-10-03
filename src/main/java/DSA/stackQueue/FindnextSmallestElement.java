package DSA.stackQueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindnextSmallestElement {

    public static void main(String args[]) throws JsonProcessingException {
        int [] intArr = {3,8,1,4,2};
        int [] result = getNextSmallestElement(intArr);
        System.out.println(new ObjectMapper().writeValueAsString(result));
    }

    private static int [] getNextSmallestElement(int[] intArr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int [] result = new int[5];

        for(int i =intArr.length -1 ;i>=0;i--){

            while(stack.peek()>=intArr[i]){
                stack.pop();
            }
            result[i] = stack.peek();
            stack.push(intArr[i]);
        }
        return result;
    }
}
