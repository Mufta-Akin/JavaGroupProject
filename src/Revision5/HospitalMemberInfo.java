package Revision8;
import java.util.Scanner;
/**
 * Created by ${Paul McGinley and group} on ${01/11/2020}
 * COMMENTS ABOUT PROGRAM HERE
 */
public class HospitalMemberInfo
{
   static String name;
   static String address;
   static int age;
   static String gender;
   static String employmentID;
   static String speciality;
   static int hierarchyCode;
   static int noOfCourses;
   static int yearOfEmployment;
   static String patientID;
   static int numberOfTreatments;
   static int appointmentDay;
   static int appointmentMonth;
   static int appointmentYear;

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

      int userInput;

      System.out.println("Welcome!");
      System.out.println();
      do
      {
         System.out.println("Press 1 for a Patient: ");
         System.out.println("Press 2 for a Doctor: ");
         System.out.println("Press 3 for a Nurse: ");
         System.out.println("Press 4 if finished to EXIT: ");
         userInput = keyboard.nextInt();

         if (userInput == ONE)
         {

            Patients firstPatient = new Patients();

            System.out.println(firstPatient.getStatus());

            System.out.print("What is the patient ID: ");
            patientID = readText();
            firstPatient.setPatientID(patientID);
            keyboard.nextLine();

            System.out.print("Please enter full name: ");
            name = readText();
            firstPatient.setName(name);

            System.out.print("Please enter address: ");
            address = readText();
            firstPatient.setAddress(address);

            System.out.print("Please enter age: ");
            age = readInteger();
            firstPatient.setAge(age);

            System.out.print("Please enter gender : ");
            gender = readText();
            firstPatient.setGender(gender);
            keyboard.nextLine();

            System.out.print("Please enter the number of treatments required: ");
            numberOfTreatments = readInteger();
            firstPatient.setNoOfTreatment(numberOfTreatments);

            System.out.print("Please enter appointment day: ");
            appointmentDay = readInteger();
            firstPatient.setAppointmentDay(appointmentDay);

            System.out.print("Please enter appointment month: ");
            appointmentMonth = readInteger();
            firstPatient.setAppointmentMonth(appointmentMonth);

            System.out.print("Please enter appointment year: ");
            appointmentYear = readInteger();
            firstPatient.setAppointmentYear(appointmentYear);

            System.out.println(firstPatient);
            System.out.println();
         }
         else if (userInput == TWO)
               {
                  Doctors firstDoctor = new Doctors();

                  System.out.println(firstDoctor.getStatus());

                  System.out.print("Enter employment ID: ");
                  employmentID = readText();
                  firstDoctor.setEmploymentID(employmentID);
                  keyboard.nextLine();

                  System.out.print("Please enter full name: ");
                  name = readText();
                  firstDoctor.setName(name);

                  System.out.print("Please enter address: ");
                  address = readText();
                  firstDoctor.setAddress(address);

                  System.out.print("Please enter age: ");
                  age = readInteger();
                  firstDoctor.setAge(age);

                  System.out.print("Please enter gender: ");
                  gender = readText();
                  firstDoctor.setGender(gender);
                  keyboard.nextLine();

                  System.out.print("Enter area of speciality: ");
                  speciality = readText();
                  firstDoctor.setSpecialty(speciality);

                  System.out.print("Enter Hierarchy code: ");
                  hierarchyCode = readInteger();
                  firstDoctor.setHierarchyCode(hierarchyCode);

                  System.out.print("Enter year of appointment: ");
                  yearOfEmployment = readInteger();
                  firstDoctor.setYearOfAppointment(yearOfEmployment);

                  System.out.print("Number courses completed: ");
                  noOfCourses = readInteger();
                  firstDoctor.setNoOfCourse(noOfCourses);

                  System.out.println(firstDoctor);
                  System.out.println();
               }

               else if (userInput == THREE)
                     {
                        Nurses firstNurse = new Nurses();

                        System.out.println(firstNurse.getStatus());

                        System.out.print("Enter employment ID: ");
                        employmentID = readText();
                        firstNurse.setEmploymentID(employmentID);
                        keyboard.nextLine();

                        System.out.print("Enter full name: ");
                        name = readText();
                        firstNurse.setName(name);

                        System.out.print("Please enter address: ");
                        address = readText();
                        firstNurse.setAddress(address);

                        System.out.print("Please enter age: ");
                        age = readInteger();
                        firstNurse.setAge(age);

                        System.out.print("Enter gender : ");
                        gender = readText();
                        firstNurse.setGender(gender);
                        keyboard.nextLine();

                        System.out.print("Enter area of speciality: ");
                        speciality = readText();
                        firstNurse.setSpecialty(speciality);

                        System.out.print("Hierarchy code: ");
                        hierarchyCode = readInteger();
                        firstNurse.setHierarchy(hierarchyCode);

                        System.out.print("Number courses completed: ");
                        noOfCourses = readInteger();
                        firstNurse.setNoOfCourse(noOfCourses);

                        System.out.println(firstNurse);
                        System.out.println();
                     }else if (userInput == FOUR){
                              break;
                           }
                           else
                           {
                              System.out.println("Your value was invalid to the choices that was instructed");
                              System.out.println();
                           }

      }
      while (userInput != FOUR);
      {
         System.out.println("Thank you for using this system and have a good day! ");
      }
   }


}//class
