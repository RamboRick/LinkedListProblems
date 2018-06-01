package basic03;
import java.util.*;
public class MiniStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MiniStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int element){
        stack.push(element);
        if(minStack.isEmpty() || element <= minStack.peek()){
            minStack.push(element);
        }
    }

    public Integer pop(){
        if(stack.isEmpty()){
            return null;
        }
        Integer t = stack.pop();
        if(t.equals(minStack.peek())){
            minStack.pop();
        }
        return t;
    }

    public Integer top(){
        if(stack.isEmpty()){
            return null;
        }
        return stack.peek();
    }

    public Integer min(){
        if(minStack.isEmpty()){
            return null;
        }
        return minStack.peek();
    }
}
