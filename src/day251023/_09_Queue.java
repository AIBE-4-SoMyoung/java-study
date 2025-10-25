package day251023;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// Queue
public class _09_Queue {
    // Queue -> 큐 돌리다 -> 줄을 서서 대기
    // 선입선출 (First In, First Out)
    // Stack -> 들어오는게 있고, 나가는게 있음
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("사과"); // 새로운 데이터를 추가 (가장 마지막으로 나옴)
        queue.offer("배");
        queue.offer("토마토"); // 스택이라면 여기부터 나가는데...
        System.out.println(queue);
        queue.poll(); // 가장 먼저 들어온 걸 큐 밖으로 꺼냄
        // 가장 먼저 추가된 '사과'부터 나가게 됨
        System.out.println(queue);
        System.out.println(queue.peek());
        // Stack, Queue -> 일반적인 List보다 속도가 빠르고
        // 자체적인 입출력 기준이 있기 때문에 자료구조만 지정해서 사용

        // Stack<> -> 입구와 출구가 같은 경우
        // Queue<> -> 입구와 출구가 각각 존재하는 경우
        // 출구는 다 뚫어놓는 상태에서 상황에 따라 입출구 지정하는 자료구조?
        // Deque (덱)
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> stack = new ArrayDeque<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        Deque<String> qu = new ArrayDeque<>();
        qu.offer("1");
        qu.offer("2");
        qu.offer("3");
        System.out.println(stack);
        System.out.println(qu);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        //  (push & pop) <- [ a       ]
        //  (push & pop) <- [ b a     ]
        //  (push & pop) <- [ c b a   ]
        //  (poll) <= [ a       ] <- (offer)
        //  (poll) <= [ a b     ] <- (offer)
        //  (poll) <= [ a b c   ] <- (offer)
    }
}