import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
  public static void main(String [] args)
  {
    System.out.println("How old are you?");
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();
    System.out.println("How long have you been a citizen?");
    int citizen = in.nextInt();

    if(age >= 30 && age >= 9)
    {
      System.out.println("You are eligible to become a US Senator and US representative");
    }
    else if(age >= 25 && citizen >= 7)
    {
      System.out.println("You are eligible to become a US representative");
    }
    else
    {
      System.out.println("You are not eligible");
    }
    }
  }
