package day251029;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 파일
public class _04_File {
    public static void main(String[] args) {
        // 객체를 만드는 것 만으로는 파일이 생성되는 건 X
        File file = new File("src/day251029/file.txt");
        // 파일 만들기 -> IO (In/Out)
//        FileWriter writer = null;
        try (FileWriter writer = new FileWriter(file)) {
            // try-with-resources -> 다 사용하고 나서 자동으로 close.
            if (file.createNewFile()) {
                System.out.println("파일이 생성되었음");
            } else {
                System.out.println("파일이 생성되지 않았음");
            }
//            FileWriter writer = new FileWriter(file);
//            writer = new FileWriter(file);
//            writer.write("안녕하세요 반갑습니다~");
            writer.write("제 이름은 뭐시기 입니다");
//            writer.close();
//        } catch (Exception e) {
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//            }
        }

    }
}