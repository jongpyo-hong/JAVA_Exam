package exam04;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex01 {
    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };


        //HashMap<String, String> members = new HashMap<>();
        TreeMap<String, String> members = new TreeMap<>(Comparator.reverseOrder());

        members.put("user04", "이름4");
        members.put("user02", "이름2");
        members.put("user03", "이름3");
        members.put("user01", "이름1");




        //members.put("user02", "이름1(수정)"); // 기존의 키가 있으면 그 키를 수정한다

        /**
         String user02 = members.get("user02");
         System.out.println(user02);
         */

        for (Map.Entry<String, String> entry : members.entrySet()) { // .put() -> Node()
            String key = entry.getKey();                             // Node()에 정의되어있는 Map.Entry<> ...entrySet()을 사용할 수 있다
            String value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }
    }
}
