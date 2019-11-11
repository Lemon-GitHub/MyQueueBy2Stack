package MyQueueBy2Stack;

import java.util.Stack;

public class test {
    /** Initialize your data structure here. */
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    /** Push element x to the back of queue. */
    public void push(int x) {
        //A用来入队列 （先将B中的元素导入A中，之后在A中插入新元素
        while(!B.isEmpty()){
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        //空队列 不需要出队列
        if(A.isEmpty() && B.isEmpty()){
            return 0;
        }
        while(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.pop();
    }

    /** Get the front element. */
    public int peek() {
        //空队列 不需要出队列
        if(A.isEmpty() && B.isEmpty()){
            return 0;
        }
        while(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(A.isEmpty() && B.isEmpty()){
            return true;
        }
        return false;
    }
}
