package com.elsevier.kata.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoListServiceTest {

  private ToDoListService toDoListService;
  @BeforeEach
  void setUp(){
    toDoListService = new ToDoListService();
  }
  @Test
  void shouldAddNewItemsToTheList(){
    List<String> items = List.of("item1", "item2", "item3","item4","item5","item6");
    assertEquals(items.size(), toDoListService.addItem(items).size());
  }

  @Test
  void shouldNotAllowDuplicateItemsToTheList(){
    List<String> items = List.of("item1", "item2", "item3","item4","item5","item1");
    assertEquals(items.size(), toDoListService.addItem(items).size());
  }
}
