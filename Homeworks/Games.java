import java.lang.Math;
import java.util.Random;

class Games {
public static String AhmedPoem(String name) {
      return "My student " + name + ", standing proud, is a fine example for the crowd.";
}

//continue your class here, add all other functions }
public static String AhmedFortuneTeller(String name) {
    String[] fortunes = {
  "Study hard for CS355.",
  "You will have fun today.",
  "There is always something you will have to remember.",
  "A good way to be healther is to eat healthy food.",
  "Easy to to gain, and hard to lose.",
  "Truth hurts, but it leads a path to something better.",
  "Don't change yourself for someone is not worthy.",
  "Be careful what comes today?",
  "Quiz are coming, study for the quiz",
  "Do all the work and, you will get A",
  "Life is not hard, we make life hard"
  };

  int randomIndex = (int) (Math.random() * 5);
      String FortuneTeller = "Here is your fortune " + name + ": " + " Fortune: " + fortunes[randomIndex];
    return FortuneTeller;
}

public static String AhmedLottery(int number1, int number2, int number3) {

		Random random = new Random();
    int RandomInt1 = (int) (Math.random() * 9 + 1);
    int RandomInt2 = (int) (Math.random() * 9 + 1);
    int RandomInt3 = (int) (Math.random() * 9 + 1);
    if(number1 == RandomInt1 && number2 == RandomInt2 && number3 == RandomInt3){
      return "Congratulations. You are a winner!";

    }
    else
    return "The winning numbers are: " + RandomInt1 + " " + RandomInt2 + " " + RandomInt3 + " Sorry, you don't win this time.";

}
public static String AhmedMadLibs(String A_Place, String Adjective, String Person_In_Room, String A_Place2, String PluralNoun, String Noun, String Noun2, String Celebrity, String Noun3, String Part_Of_The_Body, String Adjective2, String Person_In_Room2, String A_Place3, String Part_Of_The_Body2, String Verb, String Person_In_Room3, String Noun4) {

  String MadLibsText = "This is roving reporter Perry Winkle, and I'm here in (the) " + A_Place + "to ask folks today's random question: What is the first thing you should so if you ruled the World? Responses ranged from intelligent to downright " + Adjective + ". Here's a sampling: " + Person_In_Room + "from (the) " + A_Place2 + "said, I'd make sure everyone had plenty of healthy " + PluralNoun + "to eat and a warm, safe" + Noun + "to live in. An up-and-coming" + Noun2 + "by the name of " + Celebrity + "said , “I would give each man, woman, and " + Noun3 + "a job. It's important to use your mind or your " + Part_Of_The_Body + "to work and make the world a/an " + Adjective2 + "place. " + Person_In_Room2 + "from (the) " + A_Place3 + "said, There'd be no wars. People would only be allowed to " + Part_Of_The_Body2 + "wrestle one another, but then they's " + Verb + "and make up. Local comedian " + Person_In_Room3 + "said, I would require every citizen to address me by my superhero name" + Noun + "man!";

 return MadLibsText;
 }
}
