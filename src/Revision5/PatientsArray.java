package FinalRevision;

/*******
 *   COM809:FinalRevision
 *   File: PatientsArray
 *   Created by: Muyiwa Akin-Fatoki
 *   Created on: 19/12/2020
 *   Updated on: 19/12/2020
 *   Project Description: //TODO
 *******/
public class PatientsArray extends Patients
{
   Patients[] awaitingResult;

   protected PatientsArray(String patientGroup, int numberOfPatients)
   {
      String name, sex, id;
      String address;
      int age, noOfTreat, appDay, appMonth, appYear;

      awaitingResult = new Patients[numberOfPatients];

      System.out.println("\n" + patientGroup);

      for (int index = 0; index < patientGroup.length(); index++)
      {
         System.out.print("*");
      }

      System.out.println();

      for (int index = 0; index < numberOfPatients; index++)
      {
         System.out.print("\nEnter patient " + (index+1) + " name: ");
         name = keyboard.nextLine();

         System.out.print("Enter patients " + (index+1) + " address: ");
         address = keyboard.nextLine();

         System.out.print("Enter patient " + (index+1) + " age: ");
         age = keyboard.nextInt();

         System.out.print("Enter patient " + (index+1) + " gender: ");
         sex = keyboard.next();
         keyboard.nextLine();

         System.out.print("Enter patient " + (index+1) + " ID: ");
         id = keyboard.nextLine();

         System.out.print("Enter patient " + (index+1) + " number of treatment: ");
         noOfTreat = keyboard.nextInt();

         System.out.print("Enter patient " + (index+1) + " appointment day: ");
         appDay = keyboard.nextInt();

         System.out.print("Enter patient " + (index+1) + " appointment month: ");
         appMonth = keyboard.nextInt();

         System.out.print("Enter patient " + (index+1) + " appointment year: ");
         appYear = keyboard.nextInt();
         keyboard.nextLine();

         awaitingResult[index] = new Patients(name, address, age, sex, id, noOfTreat, appDay, appMonth, appYear);
      }

      System.out.println();
      System.out.println("Details of patients awaiting scan and xray result\n*************************");

      for (int index = 0; index < numberOfPatients; index++)
      {
         System.out.println(awaitingResult[index]);

      }

   }

}//class