package day251030;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Future (JS Promise 유사)
// ThreadPool -> Thread를 미리 준비해놓고 꺼내다가 사용하는 형태 <- ExecutorService
public class _05_ {
    public static void main(String[] args) {
        // 1. ExecutorService + Future
        ExecutorService pool = Executors.newFixedThreadPool(2); // 직접 만들어주면 성능상 최적화가 어려움
        // Pool <- 적절한 수를 유지
//        try {
//            System.out.println("결과 %d".formatted(f.get()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        List<Long> result = new ArrayList<>();
        List<Future<Long>> futures = new ArrayList<>();
        Random rd = new Random();
        // 처리 속도 보기
        long start = System.currentTimeMillis();
        try {
            for (int i = 0; i < 5; i++) {
                Future<Long> f = pool.submit(() -> factorial(rd.nextInt(10) + 5));
                result.add(f.get());
//                futures.add(f);
            }
//            for (Future<Long> future : futures) {
//                result.add(future.get()); // await와 비슷.
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(result);
        pool.shutdown();
    }

    static long factorial(long n) {
        System.out.println("연산 시작 " + n);
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            answer *= i;
        }
        return answer;
    }
}
