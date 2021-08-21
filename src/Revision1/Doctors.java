package Revision1;

import java.text.DecimalFormat;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM EXTENDS FROM HOSPITAL MEMBERS
 **/
public class Doctors extends HospitalMember
{
   DecimalFormat df = new DecimalFormat("0,000.00");

   private String employmentID;
   private String specialty;
   private int hierarchyCode;
   private int noOfCourse;
   private int yearOfAppointment;
   static int noOfDoctors = 0;

   public Doctors(){
      noOfDoctors++;
   }//default constructor
   public Doctors(String memName, String memAddress, int memAge, String memSex, String memID, String memSpecialty, int memHierarchy, int memCourse, int memYear){
      super(memName, memAddress, memAge, memSex);

      employmentID = memID;
      specialty = memSpecialty;
      hierarchyCode = memHierarchy;
      noOfCourse = memCourse;
      yearOfAppointment = memYear;
      noOfDoctors++;
   }//alternative constructor
   public Doctors(String memName, String memAddress, int memAge, String memGender, String memID, String memSpecialty, int memHierarchy, int memCourse){
      super(memName, memAddress, memAge, memGender);
      employmentID = memID;
      specialty = memSpecialty;
      hierarchyCode = memHierarchy;
      noOfCourse = memCourse;
      noOfDoctors++;
   }//alternative constructor
   public Doctors(String memName, String memAddress, int memAge, String memGender, String memID, String memSpecialty, int memHierarchy){
      super(memName, memAddress, memAge, memGender);
      employmentID = memID;
      specialty = memSpecialty;
      hierarchyCode = memHierarchy;
      noOfDoctors++;
   }//alternative constructor

   public Doctors(String memName, String memAddress, int memAge, String memGender, String memID, String memSpecialty){
      super(memName, memAddress, memAge, memGender);
      employmentID = memID;
      specialty = memSpecialty;
      noOfDoctors++;
   }//Alternative constructor
   public Doctors(String memName, String memAddress, int memAge, String memGender, String memID){
      super(memName, memAddress, memAge, memGender);
      employmentID = memID;
      noOfDoctors++;
   }//alternative constructor
   public void setEmploymentID(String memID){
      employmentID = memID;
   }// setEmploymentID method

   public String getEmploymentID(){
      return employmentID;
   }//getEmploymentID

   protected void setSpecialty(String memSpecialty){
      specialty = memSpecialty;
   }//setSpecialty

   protected String getSpecialty(){
      return specialty;
   }//getSpecialty

   protected void setHierarchyCode(int memHierarchy){
      hierarchyCode = memHierarchy;
   }//setHierarchyCode

   protected int getHierarchyCode(){
      return hierarchyCode;
   }//getHierarchyCode

   protected void setNoOfCourse(int memCourse){
      noOfCourse = memCourse;
   }//setNoOfCourse

   protected int getNoOfCourse(){
      return noOfCourse;
   }//getNoOfCourse

   protected void setYearOfAppointment(int memYear){
      yearOfAppointment = memYear;
   }//setYearOfAppointment

   protected int getYearOfAppointment(){
      return yearOfAppointment;
   }//getYearOfAppointment

   private double callSalary()
   {
      int zero = 0;
      final int DAYSINAMONTH = 30;
      double salaryRate = 0;
      double courseLevel = 0;

      //Setting hierarchy level
      final int ONEHUNDREDONE = 101;
      final int ONEHUNDREDTWO = 102;
      final int ONEHUNDREDTHREE = 103;
      final int ONEHUNDREDFOUR = 104;
      final int ONEHUNDREDFIVE = 105;

      //Setting course attainment status
      final double MIN1 = 1.0;
      final double MIN2 = 1.5;
      final double MIN3 = 1.9;
      final double MIN4 = 2.3;
      final double MIN5 = 2.7;
      final double MIN6 = 3.1;

      //Setting pay rate
      final double RATE1 = 195.50;
      final double RATE2 = 245.50;
      final double RATE3 = 298.50;
      final double RATE4 = 345.80;
      final double RATE5 = 399.2;

      if (hierarchyCode == ONEHUNDREDONE )
         salaryRate = RATE1;
      else if (hierarchyCode == ONEHUNDREDTWO)
         salaryRate = RATE2;
      else if (hierarchyCode == ONEHUNDREDTHREE)
         salaryRate = RATE3;
      else if (hierarchyCode == ONEHUNDREDFOUR)
         salaryRate = RATE4;
      else if (hierarchyCode == ONEHUNDREDFIVE)
         salaryRate = RATE5;
      else   salaryRate = zero;
      if (noOfCourse == zero)
         courseLevel = MIN1;
      else if (noOfCourse == MIN1)
         courseLevel = MIN2;
      else if (noOfCourse == MIN2)
         courseLevel = MIN3;
      else if (noOfCourse == MIN3)
         courseLevel = MIN4;
      else if (noOfCourse == MIN4)
         courseLevel = MIN5;
      else if (noOfCourse == MIN5)
         courseLevel = MIN6;
      else   courseLevel = zero;

      return salaryRate * courseLevel * DAYSINAMONTH;
   }

   public void getRetirement(){
      final int SERVICEYEARS = 35;
      int retirementYear;
      retirementYear = yearOfAppointment + SERVICEYEARS;
      System.out.println("\nThe Doctor " + employmentID + " will retire in the year " + retirementYear);
   }
   public String getStatus(){
      return ("This member is a Doctor");
   }
   public String toString(){
      return ("\nEmployment ID: " +employmentID + "\n" + super.toString() + "\nSpecialty: " + specialty + "\nHierarchy code: "
            + hierarchyCode + "\nNumber of courses completed: " + noOfCourse + "\nYear of employment: " + yearOfAppointment
            + "\nMonthly salary: £" + df.format(callSalary()));
   }
   public static int numberOfDoctors(){
      return noOfDoctors;
   }
   public void haveOfficialCar(boolean found){
      double carMaintenance, maintenanceBonus = 0.05;
      if (found == true){
         carMaintenance = callSalary() * maintenanceBonus;
         System.out.println("\nThe Doctor " + employmentID + " car maintenance fee is £" + df.format(carMaintenance));
      }
      else{
         System.out.println("\nThe Doctor " + employmentID + " do not have a car");
      }
   }
   public void updateBenefits(){
      String diamondPackage = "Pension, Healthcare, Company car, 30 days of Annual vacation & Travel allowance";
      String platinumPackage = "Pension, Healthcare, Company car, 25 days of Annual vacation & Travel allowance";
      String goldPackage = "Pension, Healthcare, Company car, 20 days of Annual vacation & Travel allowance";
      String silverPackage = "Pension, Healthcare, 15 days of Annual vacation & Travel allowance";
      String bronzePackage = "Pension, Healthcare, 10 days of Annual vacation & Travel allowance";
      if (hierarchyCode == 105){
         System.out.println("\nThe Doctor " + employmentID + " is entitles to " + diamondPackage);
      }
      else if (hierarchyCode == 104){
         System.out.println("\nThe Doctor " + employmentID + " is entitle to " + platinumPackage);
      }
      else if (hierarchyCode == 103){
         System.out.println("\nThe Doctor " + employmentID + " is entitled to " + goldPackage);
      }
      else if (hierarchyCode == 102){
         System.out.println("\nThe Doctor " + employmentID + " is entitled to " + silverPackage);
      }
      else if (hierarchyCode == 101){
         System.out.println("\nThe Doctor " + employmentID + " is entitled to " + bronzePackage);
      }
      else {
         System.out.println("\nA wrong hierarchy code was entered");
      }
   }
   public static void main(String[] args)
   {
   }//main
}//class