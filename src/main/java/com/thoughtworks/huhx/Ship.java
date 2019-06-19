package com.thoughtworks.huhx;

public class Ship {

  private Location location;

  public Location getLocation() {
    return location;
  }

  public Ship(Location location) {
    this.location = location;
  }

  public Point receiveCommand(Command command) {
    Point point = location.getPoint();
    switch (command.getDirection()) {
      case EAST:
        point.setX(point.getX() + command.getMiles());
        break;
      case SOUTH:
        point.setY(point.getY() - command.getMiles());
        break;
      case WEST:
        point.setX(point.getX() - command.getMiles());
        break;
      case NORTH:
        point.setY(point.getY() + command.getMiles());
        break;
      default:
        break;
    }
    return point;
  }
}
