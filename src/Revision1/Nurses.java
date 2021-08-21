package Revision1;
import java.text.DecimalFormat;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM EXTENDS FROM HOSPITAL MEMBERS
 **/
public class Nurses extends HospitalMember
{
   DecimalFormat df = new DecimalFormat("0,000.00");

   //removed the int 205,204 etc as they are withing 3 sections, I made them static to make it look better and efficent;

   static final int TWOHUNDREDFIVE = 205;
   static final int TWOHUNDREDFOUR = 204;
   static final int TWOHUNDREDTHREE = 203;
   static final int TWOHUNDREDTWO = 202;
   static final int TWOHUNDREDONE = 201;

   static int noOfNurses = 0;
   private String employmentID;
   private String specialty;
   private int hierarchyCode;
   private int noOfCourse;

   public Nurses()
   {
      noOfNurses++;
   }

   public Nurses(String memName, String memAddress, int memAge, String memGender, String memID, String memSpecialty, int memHierarchy, int memCourse){
      super(memName, memAddress, memAge, memGender);
      employmentID = memID;
      specialty = memSpecialty;
      hierarchyCode = memHierarchy;
      noOfCourse = memCourse;
      noOfNurses++;
   }

   public Nurses(String memName, int memAge, String memGender, String memID, int memHierarchy){
      super(memName, memAge, memGender);
      employmentID = memID;
      hierarchyCode = memHierarchy;
      specialty = null;
      noOfCourse = 0;
      noOfNurses++;
   }

   public Nurses(String memName, int memAge, String memID, String memSpecialty)
   {
      super(memName, memAge);
      employmentID = memID;
      specialty = memSpecialty;
      noOfNurses++;
   }

   protected void setEmploymentID(String memID)
   {
      employmentID = memID;
   }

   protected String getEmploymentID()
   {
      return employmentID;
   }

   protected void setSpecialty(String memSpecialty)
   {
      specialty = memSpecialty;
   }

   protected String getSpecialty()
   {
      return specialty;
   }

   protected void setHierarchy(int memHierarchy)
   {
      hierarchyCode = memHierarchy;
   }

   protected int getHierarchy()
   {
      return hierarchyCode;
   }

   protected void setNoOfCourse(int memCourse)
   {
      noOfCourse = memCourse;
   }

   private double calAnnualSalary()
   {
      //Used the FINAL INTS WITHIN THE IF STATEMENTS
      final int ZERO = 0;
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      final int FIVE = 5;
      //Added more final int statements to make the code more effiecent
      //Removed pay variable as it was never used

      double salaryRate = 0, courseRate = 0;
      int monthsInYear = 12, daysInMonth = 30;

      if (hierarchyCode == TWOHUNDREDONE)
      {
         salaryRate = 175.50;
      }

      else if (hierarchyCode == TWOHUNDREDTWO)

      {
         salaryRate = 225.50;
      }

      else if (hierarchyCode == TWOHUNDREDTHREE)
      {
         salaryRate = 278.20;
      }

      else if (hierarchyCode == TWOHUNDREDFOUR)
      {
         salaryRate = 325.80;
      }

      else if (hierarchyCode == TWOHUNDREDFIVE)
      {
         salaryRate = 379.20;
      }

      else
      {
         salaryRate = 0;
      }

      if (noOfCourse == ZERO)
      {
         courseRate = 1;
      }

      else if (noOfCourse == ONE)
      {
         courseRate = 1.3;
      }

      else if (noOfCourse == TWO)
      {
         courseRate = 1.8;
      }

      else if (noOfCourse == THREE)
      {
         courseRate = 2.3;
      }

      else if (noOfCourse == FOUR)
      {
         courseRate = 2.8;
      }

      else if (noOfCourse == FIVE)
      {
         courseRate = 3.3;
      }
      else

      {
         courseRate = 0;
      }
      return  (salaryRate * courseRate * daysInMonth) * monthsInYear;
   }

   public void calAnnualLeave()
   {
      //removed the leaveInMonth = 0 just the variable as you have changed it throughout the if statements
      //Used the FINAL INTS WITHIN THE IF STATEMENTS

      int annualLeave, leaveInMonth, monthInYear = 12;
      //removed leave as it is never used;

      if (hierarchyCode == TWOHUNDREDONE)
      {
         leaveInMonth = 7;
      }

      else if (hierarchyCode == TWOHUNDREDTWO)
      {
         leaveInMonth = 8;
      }

      else if (hierarchyCode == TWOHUNDREDTHREE)
      {
         leaveInMonth = 9;
      }

      else if (hierarchyCode == TWOHUNDREDFOUR)
      {
         leaveInMonth = 10;
      }

      else if (hierarchyCode == TWOHUNDREDFIVE)
      {
         leaveInMonth = 13;

         //leave in month 13?

      }

      else
      {
         leaveInMonth =0;
      }
      annualLeave = leaveInMonth * monthInYear;
      System.out.println("\nThe Nurse " + employmentID + " annual leave is " + annualLeave + " days");
   }

   public String getStatus()

   {
      return ("This member is a Nurse");
   }
   public String toString()

   {
      return ("\nEmployment ID: " + employmentID + "\n" + super.toString() + "\nSpecialty: " + specialty
            + "\nHierarchy Code: " + hierarchyCode + "\nNumber of courses completed: " + noOfCourse
            + "\nAnnual salary: £" + df.format(calAnnualSalary()));
   }

   public static int numberOfNurses()

   {
      return noOfNurses;
   }

   public void haveOfficialCar(boolean found)

   {
      final double MAINTENANCEBONUS = 0.05;
      //added final double!

      double carMaintenance;

      if (found) //removed the found ==True  to found because if found is true!

      {
         carMaintenance = calAnnualSalary() * MAINTENANCEBONUS;
         System.out.println("\nThe Doctor " + employmentID + " car maintenance fee is £" + df.format(carMaintenance));
      }

      else

      {
         System.out.println("\nThe Doctor " + employmentID + " do not have a car");
      }

   }

   public void updateBenefits()

   {

      String diamondPackage = "Pension, Healthcare, Company car, 30 days of Annual vacation & Travel allowance";
      String platinumPackage = "Pension, Healthcare, Company car, 25 days of Annual vacation & Travel allowance";
      String goldPackage = "Pension, Healthcare, Company car, 20 days of Annual vacation & Travel allowance";
      String silverPackage = "Pension, Healthcare, 15 days of Annual vacation & Travel allowance";
      String bronzePackage = "Pension, Healthcare, 10 days of Annual vacation & Travel allowance";

      if (hierarchyCode == TWOHUNDREDFIVE)
      {
         System.out.println("\nThe Doctor " + employmentID + " is entitles to " + diamondPackage);
      }

      else if (hierarchyCode == TWOHUNDREDFOUR)

      {
         System.out.println("\nThe Doctor " + employmentID + " is entitle to " + platinumPackage);
      }

      else if (hierarchyCode == TWOHUNDREDTHREE)

      {
         System.out.println("\nThe Doctor " + employmentID + " is entitled to " + goldPackage);
      }

      else if (hierarchyCode == TWOHUNDREDTWO)

      {
         System.out.println("\nThe Doctor " + employmentID + " is entitled to " + silverPackage);
      }

      else if (hierarchyCode == TWOHUNDREDONE)

      {
         System.out.println("\nThe Doctor " + employmentID + " is entitled to " + bronzePackage);
      }

      else
      {
         System.out.println("\nA wrong hierarchy code was entered");
      }

   }

   //Removed the publix static void main(String[] args)/ It does not need to be here!


}//class