package com.elsevier.kata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoItem {
  private String name;
  private long dateAdded;
  private Long dateModified;
}
