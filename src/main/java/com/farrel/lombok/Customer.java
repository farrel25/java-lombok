package com.farrel.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"name"})
public class Customer {

    private Long id;

    private String name;
}
