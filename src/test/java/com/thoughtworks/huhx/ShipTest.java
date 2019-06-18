package com.thoughtworks.huhx;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShipTest {

  @Test
  public void whenInstantiatedThenLocationIsSet() {
    Location location = new Location();
    Ship ship = new Ship(location);
    assertEquals(location, ship.getLocation());
  }
}
