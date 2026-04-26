import java.util.*;
public class Constructure {
    public static void main(String[] args){
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.peek();
        stack.size();
        stack.isEmpty();


        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.removeFirst();
        ll.removeLast();
        ll.get(0);



        Queue<Integer> q=new ArrayDeque<>();
        q.offer(1);
        q.peek();
        q.poll();
        q.isEmpty();
        q.size();



        Deque<Integer> deque=new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.peekFirst();
        deque.peekLast();
        deque.pollFirst();
        deque.pollLast();
        

    }

}
