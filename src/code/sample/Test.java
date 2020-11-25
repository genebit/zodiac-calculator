package code.sample;

public class Test {
     
     public static void main(String[] args) {
          
          String[] listOfMembers = {"Danny", "John", "Philips" };

          String checker = "John";
          boolean isAMember = false;
          
          for (int i = 0; i < listOfMembers.length; i++) {
               
               if (checker.equals(listOfMembers[i])) {
                    isAMember = true;
                    break;
               }
               else {
                    isAMember = false;
               }
          }

          if (isAMember) { System.out.println(checker + " Is a Member."); }
          else { System.out.println(checker + " Is NOT a Member."); }
     }
}
