package day251029;

import java.io.*;
import java.time.LocalDateTime;

// 파일 다루기
public class _05_FileReadWrite {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt.toString());
        String filename = "%s.txt".formatted(dt).replace(":", ".");
        File file = new File("src/day251029/" + filename);
        // Buffer. <- Buffered? <- 저수준 (컴퓨터 자체에 좀 더 가까워서) -> 편의기능 x
        // File <- 편의기능들이 들어가있다...
        try (FileWriter writer = new FileWriter(file);) { // TWR 구문을 통해서 알아서 close
            file.createNewFile(); // 파일이 겹치는 경우에 대한 throw는 X
            writer.write("파일 내용입니다~\n");
            writer.write("파일 내용입니다~\n");
            writer.write("파일 내용입니다~\n");
            writer.write("파일 내용입니다~\n");
            writer.write("파일 내용입니다~");
            ;
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println(reader.readLine()); // 한줄만...
//            while(true) {
            String line;
            while((line = reader.readLine()) != null) {
//                String line = reader.readLine();
//                if (line == null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Java 대기 기능
        try {
            Thread.sleep(5000);
//            file.delete();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}