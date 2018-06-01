package basic03;
import java.util.*;
public class StackQueue {
    Deque<Integer> in;
    Deque<Integer> out;

    public StackQueue(){
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    private void shuffle(){
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }

    public Integer poll(){
        shuffle();
        if(out.isEmpty()){
            return null;
        }
        return out.pop();
    }

    public Integer peek(){
        shuffle();
        if(out.isEmpty()){
            return null;
        }
        return out.peek();
    }

    public void offer(int element){
        in.push(element);
    }

    public int size(){
        return in.size()+out.size();
    }

    public boolean isEmpty(){
        return in.isEmpty() && out.isEmpty();
    }
}
