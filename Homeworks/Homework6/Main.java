import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;


class Main {
  public static void main(String[] args) {
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    try
    {
      Scanner inFile = new Scanner(new FileReader("dogs.txt"));
      String name, breed;
      int age;
      float weight, height;
      while (inFile.hasNext( ) )
      {
          name = inFile.next();
          age = inFile.nextInt();

          //HERE: continue reading the rest of the data about the dog
          //HERE: create a dog object with all the values just read
          //HERE: add the object to the ArrayList "dogs"
          breed = inFile.next();
          weight = inFile.nextFloat();
          height = inFile.nextFloat();
          Dog d = new Dog(name, age, breed, weight, height);
          dogs.add(d);

      }
    }
    catch (java.io.FileNotFoundException e)
    {
      System.out.println("File Not Found");
    }

    //HERE: display the dogs by WTH category
    //Code for displaying the underweight dogs is provided already
    System.out.println("\n======> UNDERWEIGHT DOGS IN FILE <======");
    for (Dog d: dogs){
      if (d.wthCategory().equals(Dog.UNDERWEIGHT)){
        System.out.println("\n"+d);
      }
    }

    System.out.println("\n======> HEALTHY DOGS IN FILE <======");
    for(Dog d: dogs) {
      if(d.wthCategory().equals(Dog.HEALTHY)) {
        System.out.println("\n"+d);
      }
    }

    System.out.println("\n======> OVERWEIGHT DOGS IN FILE <======");
    for(Dog d: dogs) {
      if(d.wthCategory().equals(Dog.OVERWEIGHT)) {
        System.out.println("\n"+d);
      }
    }

    System.out.println("\n======> OBESE DOGS IN FILE <======");
    for(Dog d: dogs) {
      if(d.wthCategory().equals(Dog.OBESE)) {
        System.out.println(d+"\n");
      }
    }

    System.out.println("\n======> LETS MAKE SOME NOISE: <======");
    //HERE: Choose 5 dogs at random from "dogs" and call the "bark" method on them
    for(int i = 0; i < 5; i++) {
      int rand1 = (int) (Math.random() * 4) + 10;
      dogs.get(rand1).bark();
    }

    //HERE: Choose 5 dogs at random from "dogs" and call the "growl" method on them
    for(int i = 0; i < 5; i++) {
      int rand2 = (int) (Math.random() * 4) + 10;
      dogs.get(rand2).growl();
    }
  }
}
