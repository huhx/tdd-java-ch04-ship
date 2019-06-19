package com.thoughtworks.huhx;

public class Ship {

  private Location location;

  public Location getLocation() {
    return location;
  }

  public Ship(Location location) {
    this.location = location;
  }

  public Point move(Command command) {
    Point point = location.getPoint();
    int x = point.getX() + command.getDirection().getX() * command.getMiles();
    int y = point.getY() + command.getDirection().getY() * command.getMiles();
    return new Point(x, y);
  }
}
