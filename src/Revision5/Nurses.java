package Revision5G;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM EXTENDS FROM HOSPITAL MEMBERS
 **/
public class Nurses extends HospitalMember
{
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("0,000.00");

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

   public Nurses(){
      noOfNurses++;
   }
   public Nurses(String nurseName, String nurseAddress, int nurseAge, String nurseGender, String nurseID, String nurseSpecialty, int nurseHierarchy, int nurseNoOfCourse){
      super(nurseName, nurseAddress, nurseAge, nurseGender);
      employmentID = nurseID;
      specialty = nurseSpecialty;
      hierarchyCode = nurseHierarchy;
      noOfCourse = nurseNoOfCourse;
      noOfNurses++;
   }
   public Nurses(String nurseName, int nurseAge, String nurseGender, String nurseID, int nurseHierarchy){
      super(nurseName, nurseAge, nurseGender);
      employmentID = nurseID;
      hierarchyCode = nurseHierarchy;
      specialty = "Unknown";
      noOfCourse = 0;
      noOfNurses++;
   }
   public Nurses(String nurseName, int nurseAge, String nurseID, String nurseSpecialty){
      super(nurseName, nurseAge);
      employmentID = nurseID;
      specialty = nurseSpecialty;
      hierarchyCode = 0;
      noOfCourse = 0;
      noOfNurses++;
   }
   protected void setEmploymentID(String nurseID){
      employmentID = nurseID;
   }
   protected String getEmploymentID(){
      return employmentID;
   }
   protected void setSpecialty(String nurseSpecialty){
      specialty = nurseSpecialty;
   }
   protected String getSpecialty(){
      return specialty;
   }
   protected void setHierarchy(int nurseHierarchy){
      hierarchyCode = nurseHierarchy;
   }
   protected int getHierarchy(){
      return hierarchyCode;
   }
   protected void setNoOfCourse(int nurseNoOfCourse){
      noOfCourse = nurseNoOfCourse;
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

   private double calAnnualSalary(){
      final int ZERO = 0;
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      final int FIVE = 5;

      double salaryRate, courseRate;
      int monthsInYear = 12;
      if (hierarchyCode == TWOHUNDREDONE){
         salaryRate = 175.50;
      }
      else if (hierarchyCode == TWOHUNDREDTWO){
               salaryRate = 225.50;
            }
            else if (hierarchyCode == TWOHUNDREDTHREE){
                     salaryRate = 278.20;
                  }
                  else if (hierarchyCode == TWOHUNDREDFOUR){
                           salaryRate = 325.80;
                        }
                        else if (hierarchyCode == TWOHUNDREDFIVE){
                                 salaryRate = 379.20;
                              }
                              else {
                                    salaryRate = 0;
                              }
      if (noOfCourse == ZERO){
         courseRate = 1;
      }
      else if (noOfCourse == ONE){
               courseRate = 1.3;
            }
            else if (noOfCourse == TWO){
                     courseRate = 1.8;
                  }
                  else if (noOfCourse == THREE){
                           courseRate = 2.3;
                        }
                        else if (noOfCourse == FOUR){
                                 courseRate = 2.8;
                              }
                              else if (noOfCourse == FIVE){
                                       courseRate = 3.3;
                                    }
                                    else {
                                          courseRate = 0;
                                          }
      return  (salaryRate * courseRate * getNumberOfDays()) * monthsInYear;
   }
   protected void calAnnualLeave(){
      int annualLeave, leaveInMonth, monthInYear = 12;
      if (hierarchyCode == TWOHUNDREDONE){
         leaveInMonth = 7;
      }
      else if (hierarchyCode == TWOHUNDREDTWO){
               leaveInMonth = 8;
            }
      else if (hierarchyCode == TWOHUNDREDTHREE){
               leaveInMonth = 9;
            }
            else if (hierarchyCode == TWOHUNDREDFOUR){
                     leaveInMonth = 10;
                  }
                  else if (hierarchyCode == TWOHUNDREDFIVE){
                           leaveInMonth = 13;
                        }
                        else {
                           leaveInMonth = 0;
                        }
      annualLeave = leaveInMonth * getNumberOfDays();
      System.out.println("\nThe Nurse " + employmentID + " annual leave is " + annualLeave + " days");
   }
   protected String getStatus(){
      return ("This member is a Nurse");
   }
   public String toString(){
      return ("\nEmployment ID: " + employmentID + "\n" + super.toString() + "\nSpecialty: " + specialty
            + "\nHierarchy Code: " + hierarchyCode + "\nNumber of courses completed: " + noOfCourse
               + "\nAnnual salary: £" + df.format(calAnnualSalary()));
   }
   protected static int numberOfNurses(){
      return noOfNurses;
   }
   protected void hasOfficialCar(boolean found){
      final double MAINTENANCEBONUS = 0.05;
      double carMaintenance;
      if (found==true){
         carMaintenance = calAnnualSalary() * MAINTENANCEBONUS;
         System.out.println("\nThe Doctor " + employmentID + " car maintenance fee is £" + df.format(carMaintenance));
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
      if (hierarchyCode == TWOHUNDREDFIVE){
         System.out.println("\nThe Doctor " + employmentID + " is entitles to " + diamondPackage);
      }
      else if (hierarchyCode == TWOHUNDREDFOUR){
               System.out.println("\nThe Doctor " + employmentID + " is entitle to " + platinumPackage);
            }
            else if (hierarchyCode == TWOHUNDREDTHREE){
                     System.out.println("\nThe Doctor " + employmentID + " is entitled to " + goldPackage);
                  }
                  else if (hierarchyCode == TWOHUNDREDTWO){
                           System.out.println("\nThe Doctor " + employmentID + " is entitled to " + silverPackage);
                        }
                        else if (hierarchyCode == TWOHUNDREDONE){
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
