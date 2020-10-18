package com.gauro.springExampleinIn28minutes.web.services;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.gauro.springExampleinIn28minutes.web.model.Todo;


@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "chandra", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "chandra", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "chandra", "Learn Hibernate", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public void addTodo(String name, String desc, Date targetDate,
            boolean isDone) {
        todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }

	public void updateTodo( Todo todo) {
		todos.remove(todo);
		todos.add(todo);
		
	}

	public Todo retrieveTodo(int id) {
		Optional<Todo> todo=todos.stream().filter(el->el.getId()==id).findFirst();
		
		return todo.isPresent()? todo.get():null;
	}
}