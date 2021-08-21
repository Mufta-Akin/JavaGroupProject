package Revision9;

import java.util.Scanner;

/**
 * Created by ${Paul McGinley and group} on ${01/11/2020}
 * COMMENTS ABOUT PROGRAM HERE
 */
public class HospitalMemberInfo
{

   static String ID;
   static String name;
   static String address;
   static int age;
   static String sex;
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


   public static void getHospitalMemberInfo()
   {

      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      int doctorCounter=0;

      int userInput;

      System.out.println("Welcome!");
      System.out.println();

      do
      {
         System.out.println("Press 1 if it is Patient: ");
         System.out.println("Press 2 if it a Doctor: ");
         System.out.println("Press 3 if it is a Nurse or 4 to EXIT: ");
         System.out.println();
         userInput = keyboard.nextInt();

         if (userInput == ONE)
         {

            Patients firstPatient = new Patients("Lyon Shade", "29", "Y81", 2);

            System.out.println(firstPatient.getStatus());
            System.out.println();

            System.out.println("What is your employment ID: ");
            ID = keyboard.next();
            firstPatient.setPatientID(ID);
            keyboard.nextLine();

            System.out.println("Please enter your full name: ");
            name = readText();
            firstPatient.setName(name);

            System.out.println("Please enter your address: ");
            address = readText();
            firstPatient.setAddress(address);

            System.out.println("Please enter your age");
            age = readInteger();
            firstPatient.setAge(age);

            System.out.println("What gender are you: ");
            sex = keyboard.next();
            firstPatient.setSex(sex);


            System.out.println("Please enter the number of treatments you require: ");
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
            System.out.println();


         }

         else if (userInput == TWO)
         {
            Doctors firstDoctor = new Doctors();

            System.out.println(firstDoctor.getStatus());

            System.out.println("What is your employment ID: ");
            ID = keyboard.next();
            firstDoctor.setEmploymentID(ID);
            keyboard.nextLine();

            System.out.println("Please enter your full name");
            name = readText();
            firstDoctor.setName(name);

            System.out.println("Please enter your address:");
            address = readText();
            firstDoctor.setAddress(address);

            System.out.println("Please enter your age");
            age = readInteger();
            firstDoctor.setAge(age);

            System.out.println("What gender are you: ");
            sex = keyboard.next();
            firstDoctor.setSex(sex);

            System.out.println("What is your speciality: ");
            speciality = readText();
            keyboard.nextLine();
            firstDoctor.setSpecialty(speciality);

            System.out.println("Hierarchy code: ");
            hierarchyCode = readInteger();
            firstDoctor.setHierarchyCode(hierarchyCode);


            System.out.println("What is your year of appointment: ");
            yearOfEmployment = readInteger();
            firstDoctor.setYearOfAppointment(yearOfEmployment);

            System.out.println("Number coursed completed: ");
            noOfCourses = readInteger();
            firstDoctor.setNoOfCourse(noOfCourses);


            System.out.println(firstDoctor);
            System.out.println();
            //
            // may include update benefits. Maybe put in the benefits!
            //

         } else if (userInput == THREE)
         {
            Nurses firstNurse = new Nurses();

            System.out.println(firstNurse.getStatus());
            System.out.println();

            System.out.println("What is your employment ID: ");
            ID = keyboard.next();
            firstNurse.setEmploymentID(ID);
            keyboard.nextLine();

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
            sex = keyboard.next();
            firstNurse.setSex(sex);

            System.out.println("What is your speciality: ");
            speciality = readText();
            keyboard.nextLine();
            firstNurse.setSpecialty(speciality);

            System.out.println("Hierarchy code: ");
            hierarchyCode = readInteger();
            firstNurse.setHierarchy(hierarchyCode);

            System.out.println("Number coursed completed: ");
            noOfCourses = readInteger();
            firstNurse.setNoOfCourse(noOfCourses);

            System.out.println(firstNurse);
            System.out.println();
         }

         else if(userInput == FOUR)
         {
            break;
         }

         else
         {
            System.out.println("You value was invalid to the choices that was instructed");
            System.out.println();
         }

      }

      while (userInput != FOUR);
      {
         System.out.println("Thank you for using this system and have a good day! ");


      }


   }//class
}