package com.crud.tasks.domian;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Task {
    private Long id;
    private String title;
    private String content;
}
