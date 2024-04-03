package com.elsevier.kata.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class ToDoList {

  private final List<TodoItem> newlyAddedItems;
  private final List<TodoItem> deletedItems;
  private final List<TodoItem> completedItems;
  private final List<TodoItem> unCompletedItems;

  public ToDoList(){
    newlyAddedItems = new ArrayList<>();
    deletedItems = new ArrayList<>();
    completedItems = new ArrayList<>();
    unCompletedItems = new ArrayList<>();
  }

}
