package Revision5G;

/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM TO MANAGE HOSPITAL MEMBERS
 **/
abstract public class HospitalMember
{
   private String name;
   private String address;
   private int age;
   private String gender;

   public HospitalMember(){
   }//default constructor
   public HospitalMember(String memName, String memAddress, int memAge, String memGender){
      name = memName;
      address = memAddress;
      age = memAge;
      gender = memGender;
   }
   public HospitalMember(String memName, int memAge){
      name = memName;
      age = memAge;
      address = "Unknown";
      gender = "Unknown";
   }
   public HospitalMember(String memName, int memAge, String memGender){
      name = memName;
      age = memAge;
      gender = memGender;
      address = "Unknown";
   }
   protected void setName(String memName){
      name = memName;
   }
   protected String getName(){
      return name;
   }
   protected void setAddress(String memAddress){
      address = memAddress;
   }
   protected String getAddress(){
      return address;
   }
   protected void setAge(int memAge){
      age = memAge;
   }
   protected int getAge(){
      return age;
   }
   protected void setGender(String memGender){
      gender = memGender;
   }
   protected String getGender(){
      return gender;
   }
   protected abstract String getStatus();

   public String toString(){
      return ("Name: " + name + "\nAddress: " + address + "\nAge: " + age + " years old" + "\nGender: " + gender);
   }//returns the information that is generic to all classes


   public static void main(String[] args)
   {

   }//main
}//class
