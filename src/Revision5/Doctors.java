package Revision8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM EXTENDS FROM HOSPITAL MEMBERS
 **/
public class Doctors extends HospitalMember
{
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("0,000.00");

   static final int ONEHUNDREDFIVE = 105;
   static final int ONEHUNDREDFOUR = 104;
   static final int ONEHUNDREDTHREE = 103;
   static final int ONEHUNDREDTWO = 102;
   static final int ONEHUNDREDONE = 101;

   static int noOfDoctors = 0;
   private String employmentID;
   private String specialty;
   private int hierarchyCode;
   private int noOfCourse;
   private int yearOfAppointment;

   public Doctors(){

      noOfDoctors++;

   }
   public Doctors(String docName, int docAge, String docID, String docSpecialty, int docHierarchy, int docYear){
      super(docName, docAge);
      employmentID = docID;
      specialty = docSpecialty;
      hierarchyCode = docHierarchy;
      yearOfAppointment = docYear;
      noOfCourse = 0;
      noOfDoctors++;
   }
   public Doctors(String docName, int docAge, String docGender, int docHierarchy, int docYear){
      super(docName, docAge, docGender);
      hierarchyCode = docHierarchy;
      yearOfAppointment = docYear;
      employmentID = "Unknown";
      specialty = "Unknown";
      noOfCourse = 0;
      noOfDoctors++;
   }
   protected void setEmploymentID(String docID){
      employmentID = docID;
   }
   protected String getEmploymentID(){
      return employmentID;
   }
   protected void setSpecialty(String docSpecialty){
      specialty = docSpecialty;
   }
   protected String getSpecialty(){
      return specialty;
   }
   protected void setHierarchyCode(int docHierarchy){
      hierarchyCode = docHierarchy;
   }
   protected int getHierarchyCode(){
      return hierarchyCode;
   }
   protected void setNoOfCourse(int docCourse){
      noOfCourse = docCourse;
   }
   protected int getNoOfCourse(){
      return noOfCourse;
   }
   protected void setYearOfAppointment(int memYear){
      yearOfAppointment = memYear;
   }
   protected int getYearOfAppointment(){
      return yearOfAppointment;
   }
   protected int getNumberOfDays(){
      //tried to fix static DaysInMonth from previous code of team member
      int numberOfDaysInMonth = 0;
      String MonthOfName = "Unknown";

      System.out.print("Input a month number: ");
      int month = keyboard.nextInt();

      System.out.print("Input a year: ");
      int year = keyboard.nextInt();

      switch (month) {
         case 1:
            MonthOfName = "January";
            numberOfDaysInMonth = 31;
            break;
         case 2:
            MonthOfName = "February";
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
               numberOfDaysInMonth = 29;
            } else {
               numberOfDaysInMonth = 28;
            }
            break;
         case 3:
            MonthOfName = "March";
            numberOfDaysInMonth = 31;
            break;
         case 4:
            MonthOfName = "April";
            numberOfDaysInMonth = 30;
            break;
         case 5:
            MonthOfName = "May";
            numberOfDaysInMonth = 31;
            break;
         case 6:
            MonthOfName = "June";
            numberOfDaysInMonth = 30;
            break;
         case 7:
            MonthOfName = "July";
            numberOfDaysInMonth = 31;
            break;
         case 8:
            MonthOfName = "August";
            numberOfDaysInMonth = 31;
            break;
         case 9:
            MonthOfName = "September";
            numberOfDaysInMonth = 30;
            break;
         case 10:
            MonthOfName = "October";
            numberOfDaysInMonth = 31;
            break;
         case 11:
            MonthOfName = "November";
            numberOfDaysInMonth = 30;
            break;
         case 12:
            MonthOfName = "December";
            numberOfDaysInMonth = 31;
      }

      return numberOfDaysInMonth;
   }
   private double calSalary(){
      final int ZERO = 0;
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      final int FIVE = 5;
      final double RATE1 = 195.50;
      final double RATE2 = 245.50;
      final double RATE3 = 298.20;
      final double RATE4 = 345.80;
      final double RATE5 = 399.20;
      final double RATE6 = 1.50;
      final double RATE7 = 1.90;
      final double RATE8 = 2.30;
      final double RATE9 = 2.70;
      final double RATE10 = 3.10;
      double salaryRate, courseRate;
      if (hierarchyCode == ONEHUNDREDONE ){
         salaryRate = RATE1;
      }
      else if (hierarchyCode == ONEHUNDREDTWO){
               salaryRate = RATE2;
            }
            else if (hierarchyCode == ONEHUNDREDTHREE){
                     salaryRate = RATE3;
                  }
                  else if (hierarchyCode == ONEHUNDREDFOUR){
                           salaryRate = RATE4;
                        }
                        else if (hierarchyCode == ONEHUNDREDFIVE){
                                 salaryRate = RATE5;
                              }
                              else {
                                    salaryRate = ZERO;
                              }
      if (noOfCourse == ZERO){
         courseRate = ONE;
      }
      else if (noOfCourse == ONE){
               courseRate = RATE6;
            }
            else if (noOfCourse == TWO){
                     courseRate = RATE7;
                  }
                  else if (noOfCourse == THREE){
                           courseRate = RATE8;
                        }
                        else if (noOfCourse == FOUR){
                                 courseRate = RATE9;
                              }
                              else if (noOfCourse == FIVE){
                                       courseRate = RATE10;
                                    }
                                    else {
                                          courseRate = ZERO;
                                    }
      return salaryRate * courseRate * getNumberOfDays();
   }
   protected int getRetirement(){
      final int yearOfService = 35;
       return yearOfAppointment + yearOfService;
   }
   protected String getStatus(){
      return ("This member is a Doctor");
   }
   public String toString(){
      return ("\nEmployment ID: " +employmentID + "\n" + super.toString() + "\nSpecialty: " + specialty + "\nHierarchy code: "
      + hierarchyCode + "\nNumber of courses completed: " + noOfCourse + "\nYear of employment: " + yearOfAppointment
            + "\nMonthly salary: £" + df.format(calSalary())) + "\nThe Doctor " + employmentID + " will retire in the year " + getRetirement();
   }
   protected static int numberOfDoctors(){
      return noOfDoctors;
   }
   protected void haveOfficialCar(boolean found){
      final double MAINTENANCEBONUS= 0.05;
      double carMaintenance;
      if (found){
         carMaintenance = calSalary() * MAINTENANCEBONUS;
         System.out.println("\nThe Doctor " + employmentID + " car maintenance allowance is £" + df.format(carMaintenance));
      }
      else{
         System.out.println("\nThe Doctor " + employmentID + " do not have a car");
      }
   }
   protected void updateBenefits(){
      String diamondPackage = "Pension, Healthcare, Company car, 30 days of Annual vacation & Travel allowance";
      String platinumPackage = "Pension, Healthcare, Company car, 25 days of Annual vacation & Travel allowance";
      String goldPackage = "Pension, Healthcare, Company car, 20 days of Annual vacation & Travel allowance";
      String silverPackage = "Pension, Healthcare, 15 days of Annual vacation & Travel allowance";
      String bronzePackage = "Pension, Healthcare, 10 days of Annual vacation & Travel allowance";
      if (hierarchyCode == ONEHUNDREDFIVE){
         System.out.println("\nThe Doctor " + employmentID + " is entitles to " + diamondPackage);
      }
      else if (hierarchyCode == ONEHUNDREDFOUR){
               System.out.println("\nThe Doctor " + employmentID + " is entitle to " + platinumPackage);
            }
            else if (hierarchyCode == ONEHUNDREDTHREE){
                     System.out.println("\nThe Doctor " + employmentID + " is entitled to " + goldPackage);
                  }
                  else if (hierarchyCode == ONEHUNDREDTWO){
                           System.out.println("\nThe Doctor " + employmentID + " is entitled to " + silverPackage);
                        }
                        else if (hierarchyCode == ONEHUNDREDONE){
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
