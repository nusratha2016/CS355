import java.lang.Math;
import java.util.Scanner;


class Main {
public static void main(String[] args) {
  System.out.println("WELCOME");
  System.out.println("1 - Poem");
  System.out.println("2 - Fortune Teller");
  System.out.println("3 - Lottery");
  System.out.println("4 - MadLibs");
  System.out.println("");
  System.out.println("Choose a game: ");
       //continue your program here
    Scanner in = new Scanner(System.in);
    int choice = in.nextInt();
    System.out.println("");
switch(choice) {
  case 1: {
    System.out.println("Enter your name: ");
    String name = in.next();
    System.out.println(Games.AhmedPoem(name));
    break;
}

  case 2: {
    System.out.println("Enter your name:");
    String name = in.next();
    System.out.println(Games.AhmedFortuneTeller(name));
    break;
}

  case 3: {
    System.out.println("Enter your three numbers between 1-9 to play Lottery Pick 3: ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    System.out.println(Games.AhmedLottery(num1, num2, num3));
    break;
}

  case 4: {
    System.out.println("Please enter a Place: ");
    String A_Place = in.next();

    System.out.println("Please enter an Adjective: ");
    String Adjective = in.next();

    System.out.println("Please enter the Person in Room (female)");
    String Person_In_Room = in.next();

    System.out.println("Please enter another Place2: ");
    String A_Place2 = in.next();

    System.out.println("Please enter Plural Noun: ");
    String PluralNoun = in.next();

    System.out.println("Please enter a Noun: ");
    String Noun = in.next();

    System.out.println("Please enter a Noun2: ");
    String Noun2 = in.next();

    System.out.println("Please enter a Celebrity: ");
    String Celebrity = in.next();

    System.out.println("Please enter a Noun3: ");
    String Noun3 = in.next();

    System.out.println("Please enter a Part of the Body (Plural): ");
    String Part_Of_The_Body = in.next();

    System.out.println("Please enter an Adjective2: ");
    String Adjective2 = in.next();

    System.out.println("Please enter the Person in Room: ");
    String Person_In_Room2 = in.next();

    System.out.println("Please enter a Place3: ");
    String A_Place3 = in.next();

    System.out.println("Please enter a Part of the Body2: ");
    String Part_Of_The_Body2 = in.next();

    System.out.println("Please enter a Verb: ");
    String Verb = in.next();

    System.out.println("Please enter the Person in the Room (male): ");
    String Person_In_Room3 = in.next();

    System.out.println("Please enter a Noun4: ");
    String Noun4 = in.next();

    System.out.println(Games.AhmedMadLibs(A_Place, Adjective, Person_In_Room, A_Place2, PluralNoun, Noun, Noun2, Celebrity, Noun3, Part_Of_The_Body, Adjective2, Person_In_Room2, A_Place3, Part_Of_The_Body2, Verb, Person_In_Room3, Noun4));
  break;
  }
  default:
    System.out.println("Sorry, you don't win this time.");
  }
}
}
