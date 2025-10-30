package day251030;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 동시성 (Concurrency)
// https://www.baeldung.com/java-concurrency
public class _04_Thread {
    public static void main(String[] args) {
        // 동시성 : 단일한 요청에 대해서 여러 작업을 '거의 동시'에 실행해서 응답성과 처리량 높임
        // 애플리케이션,요청 -> (N개를 여러 스레드, 방식) -> 속도 높임.
        // Java? -> 멀티 스레딩. => 프로세스(Process). 스레드(Thread)
        // Process -> 프로그램의 실행 단위. 별도의 메모리 공간을 가짐. 무거움 (자원을 많이 소모, 운영체제가 많은 공간을 할당)
        // 별도의 소켓, 파이프라인... 복잡.
        // Thread -> 프로세스 내부에 한 번더 쪼갠 실행 단위. 같은 프로세스의 메모리를 공유. 가벼움.
        // -> Thread 간의 소통이 쉽고.
        // Java -> JVM -> 프로세스. => Thread.
        // '멀티 스레드 환경' <-> JS Node - 싱글 스레드. (이벤트 루프, 태스크 큐)
        // main() <- 스레드. => 다른 스레드를 호출하거나 병렬해서 처리.
        // 하나의 프로세스 -> 여러 개의 스레드 (자바 동시성 프로그래밍의 핵심)
        // JVM 레벨에서 파고드는 '고급 자바 프로그래밍' / JVM 프로그래밍.
        // => 우리가 스레드를 관리하지 않고. 프레임워크나 소프트웨어가 '알아서' 스레드를 관리.
        // => 스레드가 '상태 공유' => 우리가 기대하는 방식으로 작동하지 않을 수 있기 때문에...
        // Redis, DB, Kafka => Thread를 통한 동시성 X. 외부의 소프트웨어를 사용해서 동시성 이슈 해결

        // Thread
//        Runnable task = () -> {
//            Random rd = new Random();
//            int ms = (rd.nextInt(10) + 1) * 1000;
//            System.out.println("작업 시작 %d".formatted(ms));
//            try {
//                Thread.sleep(ms); // 1000분의 1초
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("작업 종료 %d".formatted(ms));
//        };
//        // 비동기.
//        new Thread(task, "Worker-1").start();
//        new Thread(task, "Worker-2").start();
//        new Thread(task, "Worker-3").start();
        // 구현클래스
        System.out.println("메인 스레드 시작");
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Task(i));
            threads.add(t);
            t.start(); // 새로운 스레드를 시작하는데... '병렬' (나의 종료와 이 종료는 상관 X)
        }
        for (Thread t : threads) {
            try {
                t.join(); // 모든 스레드가 끝나기를 기다리는 것
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("메인 스레드 종료"); // 스레드가 구분되어 있다 -> 메인 스레드는 다른 스레드에 작업을 위탁하고 나서 종료.
        // 비동기랑 비슷하게...
        // Thread를 생성하고 파괴하는 걸 서블릿 컨테이너 -> 알아서 진행.
    }
}

class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task %d 시작".formatted(taskId));
        try {
            Thread.sleep((new Random()).nextInt(10) * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Task %d 종료".formatted(taskId));
    }
}

// Java에서는 기본적인 JVM 실행 단위는 Process를 Thread로 쪼개서 여러 요청들을 나눠서 받을 수 있다
// -> Java를 통한 서버 구현을 하면 서버를 구현해주는 프레임워크에서 Thread 알아서 요청당 나누고 회수하는...
