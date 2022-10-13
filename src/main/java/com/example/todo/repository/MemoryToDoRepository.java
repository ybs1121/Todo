package com.example.todo.repository;

import com.example.todo.domain.Todo;
import com.example.todo.domain.TodoList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@Repository
public class MemoryToDoRepository implements ToDoRepository{

    private final Map<Long, Todo> store;
    private static Long seq = 0L;
    private final  TodoList todoList;

    @Override
    public Long save(Todo todo) {
        seq++;
        store.put(seq,todo);
        todoList.getTodoList().add(todo);
        return seq;
    }

    @Override
    public Todo getTodo(Long id) {
        Todo todo = store.get(id);
        return todo;
    }

    @Override
    public TodoList all() {
        return todoList;
    }


}
