package exam4_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Ex04 {
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

        HashSet<String> names = students.stream().map(Student::getName)
                .collect(toCollection(HashSet::new));
        System.out.println(names); // HashSet 형태
        System.out.println("-------------------------------------------------------------");

        String str = names.stream().collect(Collectors.joining("# "));
        System.out.println(str);


    }
}
