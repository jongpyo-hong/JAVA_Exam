package exam4_collect;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01 {
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

        List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(names); // List

        Set<String> names2 = students.stream().map(Student::getName).collect(Collectors.toSet());
        System.out.println(names2); // Set

        ArrayList<String> names3 = students.stream().map(Student::getName)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(names3); // ArrayList

        Map<Integer, Student> students2 = students.stream()
                            .collect(Collectors.toMap(s -> Objects.hash(s.getBan(), s.getGrade(), s.getName(), s.getGender()),
                                    Function.identity())); // Map

        students2.entrySet().stream().forEach(System.out::println);

    }
}
