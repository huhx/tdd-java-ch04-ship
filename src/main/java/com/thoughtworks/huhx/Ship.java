package com.thoughtworks.huhx;

public class Ship {

  private Location location;

  public Location getLocation() {
    return location;
  }

  public Ship(Location location) {
    this.location = location;
  }

  public Point move(Commands commands) {
    Point point = location.getPoint();
    int x = point.getX() + commands.getDirection().getX() * commands.getMiles();
    int y = point.getY() + commands.getDirection().getY() * commands.getMiles();
    return new Point(x, y);
  }
}
