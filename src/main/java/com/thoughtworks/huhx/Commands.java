package com.thoughtworks.huhx;

public class Commands {

  private Direction direction;
  private int miles;

  public Commands(Direction direction, int miles) {
    this.direction = direction;
    this.miles = miles;
  }

  public Direction getDirection() {
    return direction;
  }

  public int getMiles() {
    return miles;
  }
}
