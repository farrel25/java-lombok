package com.farrel.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Merchant {

    //private final Long id;
    private Long id;

    private String name;
}
