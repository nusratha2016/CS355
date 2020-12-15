class Dog {
  static final String UNDERWEIGHT = "underweight";
  static final String HEALTHY = "healthy";
  static final String OVERWEIGHT = "overweight";
  static final String OBESE = "obese";

  static final String PUPPY = "puppy";
  static final String ADOLESCENT = "puppy";
  static final String ADULT = "puppy";
  static final String SENIOR = "puppy";

  int age;
  String name;
  String breed;
  float weight;
  float height;

  public Dog (String n, int a, String b, float w, float h) {
    age = a;
    name = n;
    breed = b;
    weight = w;
    height = h;
  }

  public void bark(){
    System.out.println(name + ": Woof! Woof!!");
  }

  public void growl(){
    System.out.println(name + ": Grrr! Grrr!!");
  }

  public int ageinHumanYears() {
    //YOU MUST IMPLEMENT THIS METHOD
    if(age == 1) {
      return 15;
    }
    else if(age == 2) {
      return 24;
    }
    else {
      return 24 + ((age - 2) * 5);
    }
  }

  public String ageCategory() {
    //YOU MUST IMPLEMENT THIS METHOD
    if(age <= 1)
    {
      return "puppy";
    }
    else if(age > 1 && age < 4)
    {
      return "adolescent";
    }
    else if(age >= 4 && age <= 10)
    {
      return "adult";
    }
    else if (age > 10)
    {
      return "senior";
    }
    else
    {
      return "age not determine";
    }
  }

  public float wthRatio() {
    //YOU MUST IMPLEMENT THIS METHOD
    return weight / height;
  }

  public String wthCategory(){
    //YOU MUST IMPLEMENT THIS METHOD
    if(wthRatio() < 2 )
    {
      return "underweight";
    }
    else if(wthRatio() >= 2 && wthRatio() <=3)
    {
      return "healthy";
    }
    else if(wthRatio() > 3 && wthRatio() <= 4)
    {
      return "overweight";
    }
    else if(wthRatio() > 4)
    {
      return "obese";
    }
     else
    {
      return "weight not determine";
    }
  }

  public String toString()
  {
    //YOU MUST IMPLEMENT THIS METHOD
    return name +" is " + age + " years olds "+ breed +" "+ ageCategory() +" who is "+ ageinHumanYears() + " years old in human years. "+ name +"'s BMI or WTH is " + wthRatio() + " and he/she is considered " + wthCategory()+".";
  }
}
 
