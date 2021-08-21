package Revision9;


import Revision8.Doctors;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by UGIAGBE JOSEPH on 12/09/2020
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class DoctorsArray extends Revision8.Doctors
{
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("0,000.00");

   private String nameOfAssociation;
   private int numberOfMembers;
   Revision8.Doctors[] associationMember;
   double [] contribution;

   DoctorsArray(String associationName, int noOfMembers){
      String name, id, specialty;
      int age, hierarchy, year;
      double amount, profit = 0;
      nameOfAssociation = associationName;
      numberOfMembers = noOfMembers;
      associationMember = new Revision8.Doctors[numberOfMembers];
      contribution = new double[numberOfMembers];

      System.out.println();
      System.out.println(nameOfAssociation);
      for (int index = 0; index < nameOfAssociation.length(); index++){
         System.out.print("*");
      }
      System.out.println();
      for (int index = 0; index < numberOfMembers; index++){
         System.out.print("\nEnter member " + (index+1) + " name: ");
         name = keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " age: ");
         age = keyboard.nextInt();
         System.out.print("Enter member " + (index+1) + " employment ID: ");
         id = keyboard.nextLine();
         keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " specialty: ");
         specialty = keyboard.nextLine();
         System.out.print("Enter member " + (index+1) + " hierarchy: ");
         hierarchy = keyboard.nextInt();
         System.out.print("Enter member " + (index+1) + " year of employment: ");
         year = keyboard.nextInt();
         keyboard.nextLine();

         associationMember[index] = new Doctors(name, age, id, specialty, hierarchy, year);
      }
      for (int index = 0; index < numberOfMembers; index++){
         final double PROFITPERCENTAGE = 0.30;
         System.out.print("\nEnter member " + (index+1) + " contribution amount £: ");
         amount = keyboard.nextDouble();

         contribution[index] = amount;
         profit = amount + (amount * PROFITPERCENTAGE);
         contribution[index] = profit;
      }
      System.out.println();
      System.out.println(associationName.toUpperCase() + "\n");
      for (int index = 0; index < numberOfMembers; index++){
         System.out.println( associationMember[index] + "\n" + "This member got a profit of £" + df.format(contribution[index]));
      }
   }

}//class
