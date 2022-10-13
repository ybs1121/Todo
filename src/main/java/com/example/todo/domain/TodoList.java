package com.example.todo.domain;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@RequiredArgsConstructor
@Component
public class TodoList {

    private final List<Todo> todoList;
}
