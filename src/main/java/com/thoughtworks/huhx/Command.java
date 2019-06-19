package com.thoughtworks.huhx;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Command {

  private Direction direction;
  private int miles;
}
