import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Put your solutions below
    countSub("gida gade geda gedi ooo ive been here a long time ago", "da");
    

  public static int countSub(String sentence, String target)
  {
    int count = 0;

    for (int i = 0; i < sentence.length()-(target.length() -1); i++) {
      String L = sentence.substring(i, i+(target.length()));
      if (L.equals(target)) {
        count++;
      }
    }
    return System.out.println("The word " + target + " appeared " + count + " times.");
  }

  public static int countProperContains(String word, String target)
  {
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
