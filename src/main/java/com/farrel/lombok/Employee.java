package com.farrel.lombok;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class Employee {

    private Long id;

    private String name;
}
