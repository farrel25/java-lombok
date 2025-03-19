package com.farrel.lombok;

import lombok.*;

@Getter
@NoArgsConstructor(staticName = "getInstance")
@AllArgsConstructor(staticName = "getInstance")
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String username;

    @Setter(value = AccessLevel.PROTECTED)
    private String password;
}
