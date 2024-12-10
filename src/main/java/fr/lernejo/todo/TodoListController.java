package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoListController 
{

    private final List<Todo> todoList = new ArrayList<>();

    @PostMapping
    public void addTodo(@RequestBody Todo todo) 
    {
        todoList.add(todo);
    }

    @GetMapping
    public List<Todo> getTodos() 
    {
        return todoList;
    }
}
