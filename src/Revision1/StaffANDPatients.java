package Revision1;

import java.util.Scanner;

/**
 * Created by ${Paul McGinley and group} on ${01/11/2020}
 * COMMENTS ABOUT PROGRAM HERE
 */
public class StaffANDPatients
{

   static String ID;
   static String name;
   static String address;
   static int age;
   static String Gender;
   static String speciality;
   static int numberOfTreatments;
   static int appointmentDay;
   static int appointmentMonth;
   static int appointmentYear;
   static int hierarchyCode;
   static int yearOfEmployment;
   static int noOfCourses;
   static Scanner keyboard = new Scanner(System.in);


   public static int readInteger()
   {
      return keyboard.nextInt();
   }

   public static String readText()
   {
      return keyboard.nextLine();
   }


   public static void getPatientsInformation()
   {
      System.out.println();
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;

      int userInput;

      System.out.println("Welcome!");

      do
      {
         System.out.println("Press 1 if the employee is a Patient: ");
         System.out.println("Press 2 if the employee is a Doctor: ");
         System.out.println("Press 3 if the employee is a Nurse: ");
         System.out.println("Press 4 if finished to EXIT: ");
         userInput = keyboard.nextInt();

         if (userInput == ONE)
         {

            Patients firstPatient = new Patients();

            System.out.println(firstPatient.getStatus());

            System.out.println("Please enter full name: ");
            name = readText();
            firstPatient.setName(name);

            System.out.println("Please enter address:");
            address = readText();
            firstPatient.setAddress(address);

            System.out.println("Please enter age");
            age = readInteger();
            firstPatient.setAge(age);

            System.out.println("What is the gender: ");
            Gender = readText();
            firstPatient.setGender(Gender);

            System.out.println("Please enter the number of treatments required: ");
            numberOfTreatments = readInteger();
            firstPatient.setNoOfTreatment(numberOfTreatments);

            System.out.println("Please enter appointment day: ");
            appointmentDay = readInteger();
            firstPatient.setAppointmentDay(appointmentDay);

            System.out.println("Please enter appointment month: ");
            appointmentMonth = readInteger();
            firstPatient.setAppointmentMonth(appointmentMonth);

            System.out.println("Please enter appointment year: ");
            appointmentYear = readInteger();
            firstPatient.setAppointmentYear(appointmentYear);

            System.out.println(firstPatient);


         }

         else if (userInput == TWO)
         {
            Doctors firstDoctor = new Doctors();

            System.out.println(firstDoctor.getStatus());

            System.out.println("Enter employment ID: ");
            ID = readText();

            System.out.println("Enter full name");
            name = readText();

            System.out.println("Enter address:");
            address = readText();

            System.out.println("Enter age");
            age = readInteger();

            System.out.println("Enter gender: ");
            Gender = readText();

            System.out.println("Enter speciality: ");
            speciality = readText();

            System.out.println("Enter hierarchy code, (101-105):  ");
            hierarchyCode = readInteger();

            System.out.println("What is year of appointment: ");
            yearOfEmployment = readInteger();

            System.out.println("Number of courses completed: ");
            noOfCourses = readInteger();

            System.out.println(firstDoctor);

         } else if (userInput == THREE)
         {
            Nurses firstNurse = new Nurses();

            System.out.println(firstNurse.getStatus());

            System.out.println("What is your employment ID: ");
            ID = readText();
            firstNurse.setEmploymentID(ID);

            System.out.println("Please enter your full name");
            name = readText();
            firstNurse.setName(name);

            System.out.println("Please enter your address:");
            address = readText();
            firstNurse.setAddress(address);

            System.out.println("Please enter your age");
            age = readInteger();
            firstNurse.setAge(age);

            System.out.println("What gender are you: ");
            Gender = readText();
            firstNurse.setGender(Gender);

            System.out.println("What is your speciality: ");
            speciality = readText();
            firstNurse.setSpecialty(speciality);

            System.out.println("Hierarchy code: ");
            hierarchyCode = readInteger();
            firstNurse.setHierarchy(hierarchyCode);

            System.out.println("Number coursed completed: ");
            noOfCourses = readInteger();
            firstNurse.setNoOfCourse(noOfCourses);

            System.out.println(firstNurse);
         } else
         {
            System.out.println("You value was invalid to the choices that was instructed");

         }

      }

      while (userInput != FOUR);
      {
         System.out.println("Thank you for using this system and have a good day! ");
      }

   }//class
}
