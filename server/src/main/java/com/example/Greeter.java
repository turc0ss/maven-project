package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
* @param input a greeter name variable someone
* @return greeting string someone
*
**/

public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
