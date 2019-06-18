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

  public Location move(int miles) {
    Point point = location.getPoint();
    if (direction.equals(Direction.SOUTH)) {
      point.setY(point.getY() - miles);
      location.setPoint(point);
    } else if (direction.equals(Direction.NORTH)) {
      point.setY(point.getY() + miles);
      location.setPoint(point);
    } else if (direction.equals(Direction.WEST)) {
      point.setX(point.getX() - miles);
      location.setPoint(point);
    } else if (direction.equals(Direction.EAST)) {
      point.setX(point.getX() + miles);
      location.setPoint(point);
    }
    return location;
  }
}
