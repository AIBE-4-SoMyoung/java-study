package day251023;

import java.util.HashMap;
import java.util.Map;

// Map, Set
public class _06_Map {
    public static void main(String[] args) {
        // JS. Map, Object. - Java Map.
        // 공간 복잡성, 시간 복잡성 -> O(1)...
        // Map -> 메모리 차지를 늘려서 대신 속도를 개선 (hash table, tree)
        // key - value
        // Set -> 값 (키&값). 존재여부만 중요한 '집합'

        // Map : key, value... 약속
        // HashMap, TreeMap.
        // List -> 들어가는 value. <E>
        // Map -> <K, V>
        Map<String, String> map = new HashMap<>();
        // 0-99 + ... => setting
//        map.get
        // map.put (put <- add / set) key => put
        // 없으면 넣어주고 있으면 덮어씌움
        map.put("자바", "어렵다");
        map.put("자바스크립트", "덜 어렵다");
        System.out.println(map.get("자바"));
        System.out.println(map.get("자바스크립트"));
        System.out.println(map.get("파이썬")); // null
        map.remove("자바");
        System.out.println(map);
        map.clear(); // 내용 지우기
        System.out.println(map);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("서울", 1000);
        map2.put("인천", 2000);
        System.out.println(map2);
//        for (int v : map2) {
//
//        }
        for (String key : map2.keySet()) {
            System.out.println(key);
            System.out.println(map2.get(key));
        }
        for (int v : map2.values()) {
            System.out.println(v);
        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}