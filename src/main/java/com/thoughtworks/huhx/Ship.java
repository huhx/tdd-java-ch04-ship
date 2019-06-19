package com.thoughtworks.huhx;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Ship {

  private Point point;
  private Plant plant;

  public Point receiveCommand(Command command) {
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
    int axisY = point.getY() + command.getMiles();
    if (axisY > plant.getHeight()) {
      throw new RuntimeException("up to max");
    }
    return new Point(point.getX(), axisY);
  }

  private Point moveLeft(Command command, Point point) {
    int axisX = point.getX() - command.getMiles();
    if (axisX < 0) {
      throw new RuntimeException("left to max");
    }
    return new Point(axisX, point.getY());
  }

  private Point moveDown(Command command, Point point) {
    int axisY = point.getY() - command.getMiles();
    if (axisY < 0) {
      throw new RuntimeException("down to max");
    }
    return new Point(point.getX(), axisY);
  }

  private Point moveRight(Command command, Point point) {
    int axisX = point.getX() + command.getMiles();
    if (axisX > plant.getWidth()) {
      throw new RuntimeException("right to max");
    }
    return new Point(axisX, point.getY());
  }
}
