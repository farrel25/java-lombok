package com.farrel.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"price"})
public class Product {

    private final Long id;

    private String name;

    private Double price;
}
