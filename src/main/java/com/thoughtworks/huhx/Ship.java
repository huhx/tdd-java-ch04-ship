package com.thoughtworks.huhx;

public class Ship {

  private Location location;

  public Location getLocation() {
    return location;
  }

  public Ship(Location location) {
    this.location = location;
  }

  public Location move(Direction direction, int miles) {
    Point point = location.getPoint();
    int x = point.getX() + direction.getX() * miles;
    int y = point.getY() + direction.getY() * miles;
    location.setPoint(new Point(x, y));
    return location;
  }
}
