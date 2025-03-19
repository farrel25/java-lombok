package com.farrel.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String username;

    @Setter(value = AccessLevel.PROTECTED)
    private String password;
}
