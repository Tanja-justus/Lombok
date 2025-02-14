package org.example;


import lombok.*;

import java.util.List;
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
        private int id;
        private String name;
        private String teacher;
        private List<Student> students;

}

