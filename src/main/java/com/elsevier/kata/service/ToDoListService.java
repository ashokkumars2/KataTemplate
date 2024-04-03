package com.elsevier.kata.service;

import com.elsevier.kata.model.ToDoList;
import com.elsevier.kata.model.TodoItem;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class ToDoListService {

  private ToDoList toDoList = new ToDoList();
  public List<TodoItem> addItem(List<String> itemsToBeAdded){
    toDoList.getNewlyAddedItems().addAll(itemsToBeAdded.stream().filter(this::isItemAlreadyAdded).map(this::map).toList());
    return  toDoList.getNewlyAddedItems();
  }

  private TodoItem map(String item){
    return new TodoItem(item, System.currentTimeMillis(), null);
  }

  private boolean isItemAlreadyAdded(String item){
    Optional<TodoItem> optional = toDoList.getNewlyAddedItems().stream()
        .filter(addedItem -> addedItem.getName().equals(item)).findFirst();
    return optional.isEmpty();
  }
}
