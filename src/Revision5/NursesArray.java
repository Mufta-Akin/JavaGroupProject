package Revision9;

/**
 * Created by UGIAGBE JOSEPH on 12/09/2020
 * PROGRAM EXTENDS FROM NURSES
 **/
public class NursesArray extends Nurses
{
   private String nameOfGroup;
   private int numberOfMembers;
   Nurses[] groupMember;
   double[] donation;

   protected NursesArray(String groupName, int noOfMembers){
      String name, sex, id;
      int age, hierarchy;
      double amount, average, sum = 0;
      double largestDonation, lowestDonation;
      int largePosition = 0, lowPosition= 0;

      nameOfGroup = groupName;
      numberOfMembers = noOfMembers;
      groupMember = new Nurses [numberOfMembers];
      donation = new double[numberOfMembers];

      largestDonation = donation[0];
      lowestDonation = donation[0];

      System.out.println(nameOfGroup);
      for (int index = 0; index < nameOfGroup.length(); index++){
         System.out.print("=");
      }
      System.out.println();
      for (int index = 0; index < numberOfMembers; index++){
         System.out.print("\nEnter group member " + (index+1) + " name: ");
         name = keyboard.nextLine();
         System.out.print("Enter group member " + (index+1) + " age: ");
         age = keyboard.nextInt();
         System.out.print("Enter group member " + (index+1) + " gender: ");
         sex = keyboard.nextLine();
         keyboard.nextLine();
         System.out.print("Enter group member " + (index+1) + " employment ID: ");
         id = keyboard.nextLine();
         System.out.print("Enter group member " + (index+1) + " hierarchy: ");
         hierarchy = keyboard.nextInt();
         keyboard.nextLine();

         groupMember[index] = new Nurses(name, age, sex, id, hierarchy);
      }
      System.out.println();
      for (int index = 0; index < numberOfMembers; index++){
         System.out.print("Enter group member " + (index+1) + " donation amount £");
         amount = keyboard.nextDouble();

         donation[index] = amount;
         sum = sum + amount;

      }
      for (int index = 0; index < numberOfMembers; index++){

         if (donation[index] > largestDonation){
            largestDonation = donation[index];
            largePosition = index;
         }
         else {
            if (lowestDonation < donation[index]){
               lowestDonation = donation[index];
               lowPosition = index;
            }
         }
      }
      average = sum / numberOfMembers;

      System.out.println();
      System.out.println(groupName.toUpperCase() + "\n" + "The average donation is £" + df.format(average)
            + "\nThe highest donation is £" + df.format(largestDonation) + "\nThe lowest donation is £" + df.format(lowestDonation) + "\n");

      System.out.println("The details of the highest donor is \n********************" );
      System.out.println(groupMember[largePosition]);
      System.out.println("\nThe details of the lowest donor is \n********************");
      System.out.println(groupMember[lowPosition]);


   }


}//class
