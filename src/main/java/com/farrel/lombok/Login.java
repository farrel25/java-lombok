package com.farrel.lombok;

import lombok.*;

@Getter
@NoArgsConstructor(staticName = "getInstance")
@AllArgsConstructor(staticName = "getInstance")
@ToString
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String username;

    @Setter(value = AccessLevel.PROTECTED)
    @ToString.Exclude
    private String password;
}
