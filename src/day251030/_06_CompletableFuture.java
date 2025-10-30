package day251030;

import java.util.concurrent.CompletableFuture;

// CompletableFuture
public class _06_ {
    public static void main(String[] args) {
        // Future + CompletionStage <- 체이닝
        CompletableFuture<String> f = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        System.out.println("비동기 작업 시작");
                        Thread.sleep(2000);
                        System.out.println("비동기 작업 종료");
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }
                    return "비동기 작업 완료";
                }
        );
        System.out.println("메인 스레드 시작");
        try {
            // get이 없으면 -> 스레드 종료되면서 X
            // f.get();
            f
//                    .thenApply(r -> "결과 : %s".formatted(r))
                    .thenApply("결과 : %s"::formatted) // map
//                    .thenAccept(r -> System.out.println(r)) // forEach
                    .thenAccept(System.out::println) // forEach
                    .join(); // get -> await.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("메인 스레드 종료");
    }
}
