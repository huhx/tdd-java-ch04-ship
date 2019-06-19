package com.thoughtworks.huhx;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.thoughtworks.huhx.Direction.EAST;
import static com.thoughtworks.huhx.Direction.NORTH;
import static com.thoughtworks.huhx.Direction.SOUTH;
import static com.thoughtworks.huhx.Direction.WEST;
import static org.testng.AssertJUnit.assertEquals;

public class ShipTest {

  private Ship ship;
  private Location location;
  private Plant plant;

  @BeforeClass
  public void before() {
    location = new Location(new Point(5, 7));
    plant = new Plant(10, 10);
    ship = new Ship(location, plant);
  }

  @Test
  public void whenInstantiatedThenLocationIsSet() {
    assertEquals(location, ship.getLocation());
  }

  @Test
  public void whenShipMoveForward() {
    Point point = ship.receiveCommand(new Command(NORTH, 1));
    assertEquals(point.getX(), 5);
    assertEquals(point.getY(), 8);
  }

  @Test
  public void whenShipMoveBackward() {
    Point point = ship.receiveCommand(new Command(SOUTH, 1));
    assertEquals(point.getX(), 5);
    assertEquals(point.getY(), 6);
  }

  @Test
  public void whenShipMoveLeft() {
    Point point = ship.receiveCommand(new Command(WEST, 1));
    assertEquals(point.getX(), 4);
    assertEquals(point.getY(), 7);
  }

  @Test
  public void whenShipMoveRight() {
    Point point = ship.receiveCommand(new Command(EAST, 1));
    assertEquals(point.getX(), 6);
    assertEquals(point.getY(), 7);
  }

  @Test
  public void whenInitShipGetPlant() {
    assertEquals(plant, ship.getPlant());
  }
}
