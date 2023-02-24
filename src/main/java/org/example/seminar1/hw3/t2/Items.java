package org.example.seminar1.hw3.t2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private String country;
    private Integer weight;
    private Integer cost;
    private Integer sort;
}