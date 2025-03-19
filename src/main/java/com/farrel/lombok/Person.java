package com.farrel.lombok;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Long id;

    private String name;

    private Integer age;

    @Singular
    private List<String> hobbies;
}
