package com.farrel.lombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    public void sayHello(@NonNull String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}
