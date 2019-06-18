package com.thoughtworks.huhx;

import org.testng.annotations.Test;

import static com.thoughtworks.huhx.Direction.WEST;
import static org.testng.AssertJUnit.assertEquals;

public class ShipTest {

  @Test
  public void whenInstantiatedThenLocationIsSet() {
    Location location = new Location(new Point(5, 7));
    Ship ship = new Ship(location, WEST);
    assertEquals(location, ship.getLocation());
  }
}
