//Cyrus Ramirez

// Dog.java
public class Dog extends Animal {
  @Override
  public void eat() {
    System.out.println("Dogs love to eat bones");
  }
  @Override
  public void sleep() {
    System.out.println("and sleep for 8-10 hours a day.");
  }
  @Override
  public void makeSound() {
    System.out.println("Woof woof");
  }
}