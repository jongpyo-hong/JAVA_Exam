package exam4_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex06 {
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

        Map<Integer, List<Student>> studentsByGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));  // groupingBy() : 항목을 그룹화 한다
        IntStream.rangeClosed(1, 3).mapToObj(studentsByGrade::get).forEach(System.out::println);

    }
}
