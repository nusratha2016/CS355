import java.util.Locale.Category;

class Dog {
  int age;
  String name;
  String breed;

public Dog (String dogName, int dogAge, String dogBreed){
  age = dogAge;
  name = dogName;
  breed = dogBreed;
  }

public void bark(){
    System.out.println("Woof! Woof!");
  }

public int getAge() {
    return age;
}

public String getName() {
    return name;
  }

public int getAgeinHumanYears(){
    return age*7;
  }

public String getAgeCategory() {
  if(age <= 1)
  {
    return "puppy";
}
else if (age > 1 && age < 4)
{
  return "young dog";
}
else if (age >= 4 && age <= 10)
{
  return "adult";
}
else if (age > 10)
{
  return "again dog";
}
else {
  return "age not determine";
    }
  }
  public String toString() {
    return name + " is a " + age + " year(s) old " + breed + " " + getAgeCategory() + " who is " + getAgeinHumanYears() + " years old in human years\n";
  }
}
