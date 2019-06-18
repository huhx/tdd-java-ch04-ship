package com.thoughtworks.huhx;


public class Ship {

  private Location location;

  private Direction direction;

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public Ship(Location location, Direction direction) {
    this.location = location;
    this.direction = direction;
  }
}
