package com.thoughtworks.huhx;

public class Ship {

  private Location location;

  private Direction direction;

  public Location getLocation() {
    return location;
  }

  public Ship(Location location, Direction direction) {
    this.location = location;
    this.direction = direction;
  }

  public Location move(int miles) {
    Point point = location.getPoint();
    int x = point.getX() + direction.getX() * miles;
    int y = point.getY() + direction.getY() * miles;
    location.setPoint(new Point(x, y));
    return location;
  }
}
