package Revision9;



import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Created by UGIAGBE JOSEPH on 11/26/2020
 * PROGRAM EXTENDS FROM HOSPITAL MEMEBERS
 **/

public class Patients extends HospitalMember
{
   DecimalFormat df = new DecimalFormat("0,000.00");
   DecimalFormat df1 = new DecimalFormat("00");
   Scanner keyboard = new Scanner(System.in);

   static int noOfPatients = 0;
   private String patientID;
   private int noOfTreatment;
   private int appointmentDay;
   private int appointmentMonth;
   private int appointmentYear;

   public Patients(String lyon_shade, String s, String y81, int i)
   {
      noOfPatients++;
   }


   public Patients(String patientName, String patientAddress, int patientAge, String patientGender, String patientId, int patientNoOfTreatment, int enterAppointmentDay, int enterAppointmentMonth, int enterAppointmentYear)

   {
      super(patientName, patientAddress, patientAge, patientGender);
      patientID = patientId;
      noOfTreatment = patientNoOfTreatment;
      appointmentDay = enterAppointmentDay;
      appointmentMonth = enterAppointmentMonth;
      appointmentYear = enterAppointmentYear;
      noOfPatients++;
   }

   public Patients(String patientName, String patientAddress, int patientAge, String patientGender, String patientId, int patientNoOfTreatment)

   {
      super(patientName, patientAddress, patientAge, patientGender);
      patientID = patientId;
      noOfTreatment = patientNoOfTreatment;
      appointmentDay = 0;
      appointmentMonth = 0;
      appointmentYear = 0;
      noOfPatients++;
   }

   public Patients(String patientName, String patientAddress, int patientAge, String patientGender, String patientId, int enterAppointDay, int enterAppointmentMonth, int enterAppointmentYear)

   {
      super(patientName, patientAddress, patientAge, patientGender);
      patientID = patientId;
      noOfTreatment = 0;
      appointmentDay = enterAppointDay;
      appointmentMonth = enterAppointmentMonth;
      appointmentYear = enterAppointmentYear;
      noOfPatients++;
   }

   protected void setPatientID(String patientId){
      patientID = patientId;
   }
   protected String getPatientID(){
      return patientID;
   }
   protected void setNoOfTreatment(int patientNoOfTreatment){
      noOfTreatment = patientNoOfTreatment;
   }
   protected int getNoOfTreatment(){
      return noOfTreatment;
   }
   protected void setAppointmentDay(int enterAppointmentDay){
      appointmentDay = enterAppointmentDay;
   }
   protected int getAppointmentDay(){
      return appointmentDay;
   }
   protected void setAppointmentMonth(int enterAppointmentMonth){
      appointmentMonth = enterAppointmentMonth;
   }
   protected int getAppointmentMonth(){
      return appointmentMonth;
   }
   protected void setAppointmentYear(int enterAppointmentYear){
      appointmentYear = enterAppointmentYear;
   }
   protected int getAppointmentYear(){
      return appointmentYear;
   }
   private double calTreatmentCost(){
      final double TREATMENTRATE = 375.80;
      return noOfTreatment * TREATMENTRATE;
   }
   protected String getStatus()
   {
      return ("This member is a patient");
   }

   public String toString()
   {
      return ("\nPatient ID: " + patientID + "\n" + super.toString() + "\nNumber of treatment received: " + noOfTreatment
            + "\nAppointment date: " + df1.format(appointmentDay) + "-" + df1.format(appointmentMonth) + "-" + appointmentYear +
            "\nTreatment cost: £" + df.format(calTreatmentCost()));
   }

   protected static int numberOfPatients()
   {
      return noOfPatients;
   }

   protected void nextAppointmentDate()

   {
      int nextAppointmentDay, nextAppointmentMonth, nextAppointmentYear;
      int initialAppDay, initialAppMonth, initialAppYear;
      int monthInYear = 12, dayInMonth, appointmentDuration = 14;

      if (appointmentMonth == 1 || appointmentMonth == 3 || appointmentMonth == 5 || appointmentMonth == 7 || appointmentMonth == 8 || appointmentMonth == 10 || appointmentMonth == 12){
         dayInMonth = 31;
      }

      else if (appointmentMonth == 4 || appointmentMonth == 6 || appointmentMonth == 9 || appointmentMonth == 11)
      {
         dayInMonth = 30;
      }

      else if (appointmentMonth == 2)
      {
         dayInMonth = 28;
      }

      else

      {
         dayInMonth = 0;
      }

      if ((appointmentYear % 400 == 0 || appointmentYear % 100 == 0 || appointmentYear % 4 == 0) && (appointmentMonth == 2))
      {
         dayInMonth = 29;
      }

      initialAppDay = appointmentDay + appointmentDuration;
      initialAppMonth = initialAppDay / dayInMonth;
      nextAppointmentDay = initialAppDay % dayInMonth;
      initialAppYear = (initialAppMonth + appointmentMonth) / monthInYear;
      nextAppointmentMonth = (initialAppMonth + appointmentMonth) % monthInYear;
      nextAppointmentYear = initialAppYear + appointmentYear;
      System.out.println("\nThe Patient " + patientID + " next appointment date is " + df1.format(nextAppointmentDay) + "-" + df1.format(nextAppointmentMonth) + "-" + nextAppointmentYear );
   }

   protected void getDiscount(int number)
   {

      final double DISCOUNTRATE = 75.16;
      double discount, calDiscount;

      if (number == 99)

      {
         discount = noOfTreatment * DISCOUNTRATE;
         calDiscount = calTreatmentCost() - discount;
         System.out.println("\nYou guessed right! \nYour current treatment cost is £" + df.format(calDiscount));
      }
      else

      {
         System.out.println("\nYour guess was wrong! try again next time");
      }
   }

}//class