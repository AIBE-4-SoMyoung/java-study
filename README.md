# Java 학습 프로젝트

IntelliJ IDEA로 관리하는 자바 학습용 프로젝트입니다.

## 프로젝트 구조

```
java_study/
├── src/
│   ├── day251022/    # 2025-10-22 예제
│   ├── day251023/    # 2025-10-23 예제
│   └── day251024/    # 2025-10-24 예제
├── out/              # 컴파일된 클래스 파일 (gitignored)
└── java_study.iml    # IntelliJ IDEA 모듈 설정
```

## 실행 방법

### 1. 명령줄에서 컴파일 및 실행

**단일 파일 컴파일 및 실행:**
```bash
# 컴파일
javac -d out src/day251024/Example01.java

# 실행
java -cp out day251024.Example01
```

**여러 파일 컴파일:**
```bash
# 특정 패키지 컴파일
javac -d out src/day251024/*.java

# 모든 패키지 컴파일
javac -d out src/day251022/*.java src/day251023/*.java src/day251024/*.java
```

**다른 예제 실행:**
```bash
# Example05 실행
javac -d out src/day251024/Example05.java
java -cp out day251024.Example05

# Example11 실행
javac -d out src/day251023/Example11.java
java -cp out day251023.Example11
```

### 2. IntelliJ IDEA에서 실행

1. IntelliJ에서 프로젝트 열기
2. 실행하려는 Java 파일 열기 (예: `Example01.java`)
3. 우클릭 → `Run 'Example01.main()'` 선택
4. 또는 `Ctrl + Shift + F10` (Windows/Linux) / `Ctrl + Shift + R` (Mac)

## 디버깅 방법

### 1. 명령줄 디버깅

**디버그 정보 포함 컴파일:**
```bash
javac -g -d out src/day251024/Example01.java
```

**jdb (Java Debugger) 사용:**
```bash
# 디버거 모드로 실행
jdb -classpath out day251024.Example01

# jdb 명령어:
# - stop at day251024.Example01:4    # 4번 라인에 브레이크포인트 설정
# - run                               # 프로그램 실행
# - list                              # 현재 코드 위치 보기
# - print 변수명                      # 변수 값 출력
# - step                              # 한 줄씩 실행
# - cont                              # 다음 브레이크포인트까지 실행
# - quit                              # 디버거 종료
```

### 2. IntelliJ IDEA 디버깅

**디버그 모드 실행:**
1. 코드 라인 번호 옆 여백 클릭하여 브레이크포인트 설정 (빨간 점 표시)
2. 우클릭 → `Debug 'Example01.main()'` 선택
3. 또는 `Shift + F9` 단축키 사용

**디버그 단축키:**
- **F8**: Step Over (현재 줄 실행하고 다음 줄로)
- **F7**: Step Into (메소드 내부로 들어가기)
- **Shift + F8**: Step Out (현재 메소드에서 나가기)
- **F9**: Resume (다음 브레이크포인트까지 실행)
- **Ctrl + F8**: 브레이크포인트 토글

**디버그 창:**
- **Variables**: 현재 변수 값 확인
- **Watches**: 특정 표현식 모니터링
- **Console**: 프로그램 출력 확인
- **Call Stack**: 메소드 호출 스택 확인

### 3. 일반 디버깅 팁

**System.out.println 활용:**
```java
public class Example01 {
    public static void main(String[] args) {
        int value = 10;
        System.out.println("Debug: value = " + value);  // 변수 값 확인
        System.out.println("Debug: 이 라인이 실행됨");
    }
}
```

**스택 트레이스 읽기:**
```
Exception in thread "main" java.lang.NullPointerException
    at day251024.Example01.main(Example01.java:5)
```
- `Example01.java:5` → Example01.java 파일의 5번째 줄에서 오류 발생

## 빌드 정리

```bash
# 컴파일된 파일 전체 삭제
rm -rf out/

# Windows PowerShell
Remove-Item -Recurse -Force out
```

## 문제 해결

### 빨간 줄 / 컴파일 에러

1. **패키지 선언 확인**: 파일 맨 위에 `package day251024;` 확인
2. **클래스명과 파일명 일치**: `Example01.java` 파일은 `public class Example01` 이어야 함
3. **IntelliJ 캐시 삭제**: `File` → `Invalidate Caches...` → `Invalidate and Restart`

### 실행 안 됨

1. **컴파일 먼저**: 실행 전에 반드시 컴파일 (`javac` 명령)
2. **classpath 확인**: `-cp out` 옵션 포함 확인
3. **패키지명 포함**: `java -cp out day251024.Example01` (패키지명.클래스명)

## 참고 사항

- 이 프로젝트는 Maven/Gradle을 사용하지 않습니다
- JDK는 IntelliJ IDEA 설정에서 상속받습니다
- `out/` 디렉토리는 `.gitignore`에 포함되어 있습니다
