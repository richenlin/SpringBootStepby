package com.example.muiltdb.dao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Foo {
    private Long id;
    private String bar;
}
