package com.thoughtworks.huhx;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Ship {

  private Location location;
  private Plant plant;

  public Point receiveCommand(Command command) {
    Point point = location.getPoint();
    switch (command.getDirection()) {
      case EAST:
        return moveRight(command, point);
      case SOUTH:
        return moveDown(command, point);
      case WEST:
        return moveLeft(command, point);
      case NORTH:
        return moveUp(command, point);
      default:
        return point;
    }
  }

  private Point moveUp(Command command, Point point) {
    return new Point(point.getX(), point.getY() + command.getMiles());
  }

  private Point moveLeft(Command command, Point point) {
    return new Point(point.getX() - command.getMiles(), point.getY());
  }

  private Point moveDown(Command command, Point point) {
    return new Point(point.getX(), point.getY() - command.getMiles());
  }

  private Point moveRight(Command command, Point point) {
    return new Point(point.getX() + command.getMiles(), point.getY());
  }
}
