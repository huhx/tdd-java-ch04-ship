package com.thoughtworks.huhx;

public enum Direction {
  NORTH(0, 'N'), EAST(1, 'E'), SOUTH(2, 'S'), WEST(3, 'W'), NONE(4, 'X');

  private int code;
  private char value;

  Direction(int code, char value) {
    this.code = code;
    this.value = value;
  }
}
