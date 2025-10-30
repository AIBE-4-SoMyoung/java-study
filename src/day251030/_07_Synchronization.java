package day251030;

import java.util.Random;

// 분산 처리, 동시성 제어, 비동기 처리
// JS : 싱글 스레드 -> 자원 경합
// => counter 꼬였던 것처럼 => 특정한 인스턴스의 데이터를 누가 먼저, 어느 순서로 접근하냐...
// Java : 멀티 스레드 (같은 프로세스=JVM=컴퓨터)
// => '공유' => JVM 단위 '락'
// Cloud <- Docker, K8S -> JVM,컴퓨터 => 여러 개.
// 아예 컴퓨터 여러개를 혹은 가상화시켜서 마치 여러개의 컴퓨터에서 서버를 돌리는 듯.
// => 멀티 스레드에서 락을 걸어봤자 => 다른 컴퓨터에는 영향을 미칠 수 X.
// '공유'
// 1. Redis -> 중앙 집중형 스토리지
// -> 공유해서 저장해야하는 데이터. => DB는 메모리에 비해서 I/O(저장,불러오기) 속도가 느림
// 레디스 -> DB는 DB인데 메모리 수준의 속도를 보장하는 빠른 입출력 중심 데이터베이스
// -> (단점, 한계) 고도화된 쿼리 X, 안정성에서 DB보다 낮은 수준.
// Redis (공유해야하는 데이터 - 캐시, 세션...) <= 분산화된 데이터를 중앙에다가 처리.
// JWT.
// 2. Kafka, AWS SMS -> 메시징 큐
// 순차적으로 처리하게 만드는 방식
// AWS 언급.
// 코틀린 -> 코루틴
// REST API - MVC <- Flux 패턴 (Future, 가상 쓰레드...)

// 동기화
// JS -> 싱글 스레드 -> 상태화 '동기화'
// Java -> 멀티 스레드 -> 공유자원 '경쟁 조건' (race condition)
public class _07_Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable task = () -> {
//            for (int i = 0; i < 1_000_000; i++) {
            for (int i = 0; i < 1_000; i++) {
                counter.increase();
            }
        };

        Thread t1 = new Thread(task, "스레드 1");
        Thread t2 = new Thread(task, "스레드 2");
        Thread t3 = new Thread(task, "스레드 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}

class Counter {
    private int count; // 공유자원 -> 대입하거나 변경...
    // 순서보장 -> synchronized
//    ConcurrentHashMap -> 경쟁조건 방지를 어느정도 해주는 자료구조...

    // JVM 락 (같은 프로세스 내에서 공유자원 락)
    public synchronized void increase() {
//    public void increase() {
//        count++; // 증감연산자
        // int tmp = count (?)
        int tmp = count;
        Random rd = new Random();
        try {
            Thread.sleep(rd.nextInt(5));
            tmp += 1;
            count = tmp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        // tmp += 1;
        // count = tmp;
        System.out.println("%s -> %d".formatted(Thread.currentThread().getName(), count));
    }

    public int getCount() {
        return count;
    }
}