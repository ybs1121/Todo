package com.example.todo.domain;


import lombok.Data;

import java.time.LocalDateTime;

@Data

public class Todo {

    private String toDo;
    private LocalDateTime writeDate;
}
