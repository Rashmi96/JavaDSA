package DSA.stackQueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

// This follows concept of first in first out(FIFO)

public class Queue {
    private int size;

    private List<String> data;

    public Queue(int size){
        this.size = size;
        this.data = new ArrayList<>(size);
    }

    //Push Operation
    private void enQueue(String element){
        data.add(element);
    }

    //Pop Operation
    private String deQueue(){
        if(data.size() == 0){
            return null;
        }
        return data.remove(0);
    }

    //peek Operation
    private String peek(){
        if(data.size() == 0){
            return null;
        }
        return data.get(0);
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

    private void display(Queue q){

        for(int i = 0; i<q.data.size();i++){
            System.out.println(q.data.get(i));
        }
    }

    public static void main(String [] args) throws JsonProcessingException {
        Queue queue = new Queue(5);

        queue.enQueue("Rashmi");
        queue.enQueue("Swain");
        queue.enQueue("Lizza");
        System.out.println("Stack peek " + queue.peek());
        System.out.println("Stack peek " + queue.deQueue());
        System.out.println("Stack peek " + queue.isEmpty());
        System.out.println("Stack peek " + queue.isFull());
        queue.display(queue);
        //System.out.println("Stack is " + new ObjectMapper().writeValueAsString(queue));

    }
}
