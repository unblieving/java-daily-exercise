package day12;
import java.util.*;
public class Test4 {
    public static void main(String[] args){
        //四种常见的“数据结构”
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("java");
        list.addLast("c");
        list.add(1,"c++");
        list.removeFirst();
        list.removeLast();
        list.get(0);//有索引
        list.remove(0);
        list.set(0,"C++");


        Deque<String> stack =new ArrayDeque<>();
        stack.push("a");
        stack.push("b");
        stack.peek();
        stack.pop();
        stack.size();
        stack.isEmpty();



        Queue<String> q=new ArrayDeque<>();
        q.offer("a");
        q.peek();
        q.poll();
        q.isEmpty();



        Deque<String> deque=new ArrayDeque<>();
        deque.offerFirst("a");
        deque.offerLast("b");
        deque.peekFirst();
        deque.peekLast();
        deque.pollFirst();
        deque.pollLast();
    }
}
