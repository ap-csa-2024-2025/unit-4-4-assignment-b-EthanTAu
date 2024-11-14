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
    int count = 0;
    int N = target.length();
    for (int i = 0; i < word.length() - (N-1); i++) {
      String sub = word.substring(i, i+N);

      boolean endOrSpaceAfter;
      int endOfTarget = i + target.length();

      if (endOfTarget == word.length()) {
        endOrSpaceAfter = true;
      } else {
        String after = word.substring(endOfTarger, endOfTarget+1);
        if after.equals(" ") {
          endOrSpaceAfter = true;
        } else {
          endOrSpaceAfter = false;
        }
      }
      endOrSpaceAfter = (endOfTarget == word.length()) || word.substring(endOfTarget, endOfTarget+1).equals(" ");
      boolean beginOrSpaceBefore;
      int startOfTarget = i;

      if (startOfTarget == 0) {
        beginOrSpaceBefore = true;
      } else {
        String before = word.substring(i - 1);
        if before.equals(" ") {
          beginOrSpaceBefore = true;
        } else {
          beginOrSpaceBefore = false;
        }
      }

      beginOrSpaceBefore = (startOfTarget == 0) || word.substring(startOfTarget - 1, startOfTarget).equals(" ");
      boolean properlyContained = beginOrSpaceBefore && endOrSpaceAfter;
      if (sub.equals(target) && properlyContained) {
        count++;
      }
    }
    return count;
  }

  public static String deleteSub(String word, String target)
  {
    while (indexOf(target) != -1) {
      System.out.println(word.substring(0, indexOf(target) + word.substring(indexOf(target) + target.length)));
    } else {
      System.out.println("The word " + target + " does not appear in the word(s)");
    }
  }
}
