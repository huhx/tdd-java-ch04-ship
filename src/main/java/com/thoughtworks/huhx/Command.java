package com.thoughtworks.huhx;

public class Command {

  private Direction direction;
  private int miles;

  public Command(Direction direction, int miles) {
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
