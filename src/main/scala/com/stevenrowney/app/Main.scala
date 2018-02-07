package com.stevenrowney.app

object Main extends App {
  
  def sayHello(): String = {
    "Hello!"  
  }
  
  def sayHelloTo(name: String): String = {
    s"Hello $name!"  
  }
}
