package com.thoughtworks.huhx;

import org.testng.annotations.Test;

import static com.thoughtworks.huhx.Direction.EAST;
import static com.thoughtworks.huhx.Direction.NORTH;
import static com.thoughtworks.huhx.Direction.SOUTH;
import static com.thoughtworks.huhx.Direction.WEST;
import static org.testng.AssertJUnit.assertEquals;

public class ShipTest {

  @Test
  public void whenInstantiatedThenLocationIsSet() {
    Location location = new Location(new Point(5, 7));
    Ship ship = new Ship(location);
    assertEquals(location, ship.getLocation());
  }

  @Test
  public void whenShipMoveForward() {
    Ship ship = new Ship(new Location(new Point(5, 7)));
    Location location = ship.move(NORTH, 1);
    assertEquals(location.getPoint().getX(), 5);
    assertEquals(location.getPoint().getY(), 8);
  }

  @Test
  public void whenShipMoveBackward() {
    Ship ship = new Ship(new Location(new Point(5, 7)));
    Location location = ship.move(SOUTH, 1);
    assertEquals(location.getPoint().getX(), 5);
    assertEquals(location.getPoint().getY(), 6);
  }

  @Test
  public void whenShipMoveLeft() {
    Ship ship = new Ship(new Location(new Point(5, 7)));
    Location location = ship.move(WEST, 1);
    assertEquals(location.getPoint().getX(), 4);
    assertEquals(location.getPoint().getY(), 7);
  }

  @Test
  public void whenShipMoveRight() {
    Ship ship = new Ship(new Location(new Point(5, 7)));
    Location location = ship.move(EAST, 1);
    assertEquals(location.getPoint().getX(), 6);
    assertEquals(location.getPoint().getY(), 7);
  }
}
