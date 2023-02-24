package org.example.seminar1.hw3.t3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String title;
    private String author;
    private Integer cost;
    private Integer year;
    private Integer pageCount;
}