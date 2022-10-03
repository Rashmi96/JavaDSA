package DSA.stackQueue;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

// This follows concept of last in first out(LIFO) nad has a particular size

public class StackImplementation {
    private int size;

    private List<String> data;

    public StackImplementation(int size){
        this.size = size;
        this.data = new ArrayList<>(size);
    }

    //Push Operation
    private void push(String element){
        data.add(element);
    }

    //Pop Operation
    private String pop(){
        if(data.size() == 0){
            return null;
        }
        return data.remove(data.size()-1);
    }

    //peek Operation
    private String peek(){
        if(data.size() == 0){
            return null;
        }
        return data.get(data.size()-1);
    }

    //Is Empty
    private boolean isEmpty(){
        if(data.size() == 0)
            return true;
        return false;
    }

    //Is Full
    private boolean isFull(){
        if(data.size() == size)
            return true;
        return false;
    }
    private void display(StackImplementation s){

        for(int i = 0; i<s.data.size();i++){
            System.out.println(s.data.get(i));
        }
    }


    public static void main(String [] args) throws JsonProcessingException {
        StackImplementation stackImplementation = new StackImplementation(5);

        stackImplementation.push("Rashmi");
        stackImplementation.push("Swain");
        stackImplementation.push("Lizza");
        System.out.println("Stack peek " + stackImplementation.peek());
        System.out.println("Stack peek " + stackImplementation.pop());
        System.out.println("Stack peek " + stackImplementation.isEmpty());
        System.out.println("Stack peek " + stackImplementation.isFull());
        stackImplementation.display(stackImplementation);
        //System.out.println("Stack is " + new ObjectMapper().writeValueAsString(stack));

    }
}
