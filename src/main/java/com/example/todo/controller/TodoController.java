package com.example.todo.controller;


import com.example.todo.domain.Todo;
import com.example.todo.domain.TodoList;
import com.example.todo.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final ToDoRepository toDoRepository;

    @GetMapping("/{id}")
    public Todo toDo(@PathVariable Long id){
        Todo todo = toDoRepository.getTodo(id);
        return todo;
    }

    @GetMapping()
    public TodoList todoList(){
        return toDoRepository.all();
    }

    @PostMapping()
    public Long save(@RequestBody Todo todo){
        Long save = toDoRepository.save(todo);
        return save;

    }


}
