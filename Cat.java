//Cyrus Ramirez

// Cat.java
public class Cat extends Animal {
  @Override
  public void eat() {
    System.out.println("Cats love to eat fish");
  }
  @Override
  public void sleep() {
    System.out.println("and sleep for 12-14 hours a day.");
  }
  @Override
  public void makeSound() {
    System.out.println("Meow meow");
  }
}