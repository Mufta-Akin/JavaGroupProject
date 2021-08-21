package Revision1;

      /**
      * Created by UGIAGBE JOSEPH on 11/26/2020
      * PROGRAM TO TEST HOSPITAL MEMBERS
      **/
public class TestHospitalMember extends StaffANDPatients
{

   public static void main(String[] args)
   {
      getPatientsInformation();


 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      System.out.println("Showing use of contructors and other ways this could of worked");

      Doctors aDoctor = new Doctors();
      Doctors bDoctor = new Doctors("Bob William", "34 Oak Street", 45, "male", "HK215");
      Doctors cDoctor = new Doctors("Jane Bill", "4 Waterloo Street", 47, "Female", "R574", "Psychiatric", 104, 3, 1997);

      System.out.println(aDoctor);
      System.out.println( aDoctor.getStatus());
      System.out.println(bDoctor);
      System.out.println(bDoctor.getStatus());
      System.out.println(cDoctor);
      System.out.println(cDoctor.getStatus());

      bDoctor.setEmploymentID("TS73");
      bDoctor.getEmploymentID();
      bDoctor.haveOfficialCar(false);
      cDoctor.haveOfficialCar(true);
      cDoctor.getRetirement();

      bDoctor.updateBenefits();
      aDoctor.updateBenefits();
      cDoctor.updateBenefits();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      Nurses aNurse = new Nurses();
      Nurses bNurse = new Nurses("Bridget Payne", "90 Casio Road", 42, "female", "NT32", "Pediatric", 203, 4);
      Nurses cNurse =  new Nurses("Naomi Parker", 25, "PT87", "N76", 201);
      Nurses dNurse = new Nurses("James Piper", 54, "male", "HB95", 205);

      System.out.println(aNurse);
      System.out.println(aNurse.getStatus());
      System.out.println(bNurse);
      System.out.println(bNurse.getStatus());
      System.out.println(cNurse);
      System.out.println(cNurse.getStatus());
      System.out.println(dNurse);
      System.out.println(dNurse.getStatus());

      bNurse.calAnnualLeave();
      cNurse.haveOfficialCar(true);
      dNurse.haveOfficialCar(false);
      bNurse.updateBenefits();
      cNurse.updateBenefits();
      dNurse.updateBenefits();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      Patients aPatient = new Patients("Susan Batt", "46 Jim Cresent", 62, "female", "P32", 3);
      Patients bPatient = new Patients();
      Patients cPatient = new Patients("Walter Preach", 97, "male", "T20");
      Patients dPatient = new Patients("Lyon Shade", 29, "Y81", 2);

      System.out.println(aPatient);
      //Patient.getNextAppointment();
      System.out.println(aPatient.getStatus());
      System.out.println(bPatient);
      System.out.println(bPatient.getStatus());
      System.out.println(cPatient);
      System.out.println(cPatient.getStatus());
      System.out.println(dPatient);
      System.out.println(dPatient.getStatus());

      dPatient.setNoOfTreatment(6);
      dPatient.getNoOfTreatment();

      System.out.println(dPatient.toString());
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      System.out.println("\nThe number of Doctors entered is " + Doctors.numberOfDoctors());
      System.out.println("\nThe number of Nurses entered is " + Nurses.numberOfNurses());
      System.out.println("\nThe number of Patient entered is " + Patients.numberOfPatients());
   }//main
}//class
