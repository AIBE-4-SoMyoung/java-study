package day251030;

import java.util.stream.IntStream;

// Parallel Stream
public class _08_ParallelStream {
    public static void main(String[] args) {
        // Stream -> .parallel() <- ThreadPool
        // 순서보장, 공유 상태 X.
        long start = System.currentTimeMillis();
        // 일정 규모가 커지면... 분할이 더 빨라진다 / 순차적으로 진행했을 때 많이 느려지는 경우...
        long sum = IntStream.rangeClosed(1, 1_000_000_000)
                .parallel() // 없으면 3~4배 정도...
                .asLongStream()
                .sum();
        System.out.println("time : " + (System.currentTimeMillis() - start));
        System.out.println(sum);
    }
}