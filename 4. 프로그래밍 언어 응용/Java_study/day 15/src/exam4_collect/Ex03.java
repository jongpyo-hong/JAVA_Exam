package exam4_collect;

import java.util.*;
import java.util.stream.Collector;
import static java.util.stream.Collectors.*;

public class Ex03 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, 3, "이름1", 'F'),
                new Student(2, 3, "이름1", 'M'),
                new Student(3, 3, "이름3", 'F'),
                new Student(1, 2, "이름4", 'F'),
                new Student(2, 2, "이름5", 'M'),
                new Student(1, 2, "이름6", 'M'),
                new Student(3, 1, "이름7", 'F'),
                new Student(2, 1, "이름8", 'F'),
                new Student(1, 1, "이름9", 'M'),
                new Student(1, 3, "이름2", 'F')
        );

        //List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
        //System.out.println(names); // List 형태 (중복 허용)

        //Set<String> names = students.stream().map(Student::getName).collect(Collectors.toSet());
        //System.out.println(names); // Set 형태 (중복X)

        Map<Integer, Student> students2 = students.stream()
                .collect(toMap(Ex03::keyMapper, s->s)); // Map 형태 (hash()로 Student의 메서드를 하나로 묶는다)

        students2.entrySet().stream().forEach(System.out::println); // stream().forEach() 형태

    }

    private static int keyMapper(Student s) {
        return Objects.hash(s.getBan(), s.getGrade(), s.getGender(), s.getName());
    }
}
