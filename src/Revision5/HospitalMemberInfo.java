package Revision6;
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

   public HospitalMemberInfo()
   {

   }

   public HospitalMemberInfo(String docName, int docAge, String docGender)
   {
   }

   public HospitalMemberInfo(String docName, int docAge)
   {

   }


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
         System.out.println("Press 1 if you are a Patient: ");
         System.out.println("Press 2 if you are a Doctor: ");
         System.out.println("Press 3 if you are Nurse: ");
         System.out.println("Press 4 if finished to EXIT: ");
         userInput = keyboard.nextInt();

         if (userInput == ONE)
         {

            Patients firstPatient = new Patients();

            System.out.println(firstPatient.getStatus());

            System.out.print("What is your patient ID: ");
            patientID = readText();
            firstPatient.setPatientID(patientID);
            keyboard.nextLine();

            System.out.print("Please enter your full name: ");
            name = readText();
            firstPatient.setName(name);



            System.out.print("Please enter your address: ");
            address = readText();
            firstPatient.setAddress(address);

            System.out.print("Please enter your age: ");
            age = readInteger();
            firstPatient.setAge(age);

            System.out.print("What gender are you: ");
            gender = readText();
            firstPatient.setGender(gender);
            keyboard.nextLine();

            System.out.print("Please enter the number of treatments you require: ");
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
                  String docName = new String();
                  String docAddress = new String();
                  int docAge = 0;
                  String docGender = new String();
                  Doctors firstDoctor = new Doctors(docName, docAddress, docAge, docGender);

                  System.out.println(firstDoctor.getStatus());

                  System.out.print("What is your employment ID: ");
                  employmentID = readText();
                  firstDoctor.setEmploymentID(employmentID);
                  keyboard.nextLine();

                  System.out.print("Please enter your full name: ");
                  name = readText();
                  firstDoctor.setName(name);

                  System.out.print("Please enter your address: ");
                  address = readText();
                  firstDoctor.setAddress(address);

                  System.out.print("Please enter your age: ");
                  age = readInteger();
                  firstDoctor.setAge(age);

                  System.out.print("What gender are you: ");
                  gender = readText();
                  firstDoctor.setGender(gender);
                  keyboard.nextLine();

                  System.out.print("What is your speciality: ");
                  speciality = readText();
                  firstDoctor.setSpecialty(speciality);

                  System.out.print("Hierarchy code: ");
                  hierarchyCode = readInteger();
                  firstDoctor.setHierarchyCode(hierarchyCode);

                  System.out.print("What is your year of appointment: ");
                  yearOfEmployment = readInteger();
                  firstDoctor.setYearOfAppointment(yearOfEmployment);

                  System.out.print("Number coursed completed: ");
                  noOfCourses = readInteger();
                  firstDoctor.setNoOfCourse(noOfCourses);

                  System.out.println(firstDoctor);
                  System.out.println();
               }
               else if (userInput == THREE)
                     {
                        Nurses firstNurse = new Nurses();

                        System.out.println(firstNurse.getStatus());

                        System.out.print("What is your employment ID: ");
                        employmentID = readText();
                        firstNurse.setEmploymentID(employmentID);
                        keyboard.nextLine();

                        System.out.print("Please enter your full name: ");
                        name = readText();
                        firstNurse.setName(name);

                        System.out.print("Please enter your address: ");
                        address = readText();
                        firstNurse.setAddress(address);

                        System.out.print("Please enter your age: ");
                        age = readInteger();
                        firstNurse.setAge(age);

                        System.out.print("What gender are you: ");
                        gender = readText();
                        firstNurse.setGender(gender);
                        keyboard.nextLine();

                        System.out.print("What is your speciality: ");
                        speciality = readText();
                        firstNurse.setSpecialty(speciality);

                        System.out.print("Hierarchy code: ");
                        hierarchyCode = readInteger();
                        firstNurse.setHierarchy(hierarchyCode);

                        System.out.print("Number coursed completed: ");
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

   public static void main(String[] args)
      {

   }//main

   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public String getAddress()
   {
      return address;
   }

   public void setGender(String gender)
   {
      this.gender = gender;
   }

   public String getGender()
   {
      return gender;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public int getAge()
   {
      return age;
   }
}//class
