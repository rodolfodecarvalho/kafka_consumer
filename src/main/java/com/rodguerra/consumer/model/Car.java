package com.rodguerra.consumer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String model;

    private String color;
}