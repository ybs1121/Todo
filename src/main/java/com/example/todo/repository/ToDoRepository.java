package com.example.todo.repository;

import com.example.todo.domain.Todo;
import com.example.todo.domain.TodoList;

public interface ToDoRepository {
    Long save(Todo todo);
    Todo getTodo(Long id);
    TodoList all();
}
