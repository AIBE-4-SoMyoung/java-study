package day251023;

import java.util.Stack;

// Stack
public class _08_Stack {
    // stack을 쌓다
    // full stack - 중첩. 겹침
    // 위에서 아래로 겹쳐져 있는 형태
    public static void main(String[] args) {
        // LIFO (Last In First Out)
        // 마지막에 삽입된 요소가 가장 먼저 삭제되는 자료구조
        // 데이터의 삽입 및 방출 방향이 정해져있는 구조
        // -> 일반적인 리스트보다 속도가 빠르다 -> 삽입되는 '인덱스'.
        // 연결 과정.
        // https://visualgo.net/en

        // push -> head 맨 앞 파트에 데이터를 추가
        // pop -> head 맨 앞 파트 데이터를 출력(삭제)
        // JavaScript Array -> Push. Pop.
        Stack<Integer> stack = new Stack<>();
        stack.push(10); // add와 비슷...
        System.out.println(stack);
        stack.push(20);
        System.out.println(stack);
        stack.push(30);
        System.out.println(stack); // 내부에 어떤 데이터가 들어갔는지...
        stack.pop(); // return이 있으므로 변수로 받으면... -> 30
        System.out.println(stack);
        stack.pop(); // 20
        System.out.println(stack);
        stack.pop(); // 10
        System.out.println(stack);
        stack.push(100);
        stack.push(200);
        System.out.println(stack);
        System.out.println(stack.peek()); // 데이터를 뽑지는 않고, 데이터를 확인 (pop했을 경우 나올 데이터를 확인)
        System.out.println(stack);

        // ctrl + y,z / 되돌아가기.
        Stack<String> history = new Stack<>();
        history.push("h");
        history.push("e");
        history.push("l");
        history.push("l");
        history.push("o");
        System.out.println(history); // 직전에 입력한 내용을 취소하고 싶다
        history.pop(); // 직전 입력 내용을 취소 혹은 삭제
        System.out.println(history);
        history.push("i");
        System.out.println(history);
        // 뒤집기 개념
        Stack<String> s1 = new Stack<>();
        s1.push("w");
        s1.push("o");
        s1.push("r");
        s1.push("l");
        s1.push("d");
        System.out.println(s1);
        Stack<String> s2 = new Stack<>();
        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());
        System.out.println(s2); // 끝점에 있는 걸 '먼저' 추가하니까...
    }
}