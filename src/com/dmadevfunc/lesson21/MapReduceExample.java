package com.dmadevfunc.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(new Student(20, "Joll"),
                        new Student(50, "Joll2"),
                        new Student(15, "Joll3"),
                        new Student(60, "Jol4"),
                        new Student(40, "Jol5"),
                        new Student(17, "Jol6")
//                ).sequential().flatMap(student -> student.getMarks().stream())
                ).sequential()
                .reduce((stud1, stud2) -> stud1.getAge() > stud2.getAge() ? stud1 : stud2);
        maybeStudent.ifPresent(System.out::println);
//        maybeStudent.map(Student::getAge).filter(age-> age>15).stream().sequential()
//        maybeStudent.map(Student::getAge).filter(age-> age>15).ifPresentOrElse();
        maybeStudent.map(Student::getAge).flatMap(age->Optional.of(Optional.ofNullable(null))).ifPresent(System.out::println);






//        Optional<Student> maybeStudent1 = Stream.of(new Student(20, "Joll"),
//                        new Student(50, "Joll2"),
//                        new Student(15, "Joll3"),
//                        new Student(60, "Jol4"),
//                        new Student(40, "Jol5"),
//                        new Student(17, "Jol6")
//                ).sequential().filter(student -> student.getAge()<14)
//                .reduce((stud1, stud2) -> stud1.getAge() > stud2.getAge() ? stud1 : stud2);
//        maybeStudent1.ifPresent(System.out::println);
//        boolean maybeStudent1Empty = maybeStudent1.isEmpty();
//        System.out.println(maybeStudent1Empty);

    }
}
