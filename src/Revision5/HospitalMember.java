package Revision9;


/**
 * Created by UGIAGBE JOSEPH on 11/25/2020
 * PROGRAM TO MANAGE HOSPITAL MEMBERS
 **/
abstract public class HospitalMember
{
   private String name;
   private String address;
   private int age;
   private String sex;

   public HospitalMember()
   {
      //default constructior
   }

   public HospitalMember(String memName, String memAddress, int memAge, String memSex)
   {
      name = memName;
      address = memAddress;
      age = memAge;
      sex = memSex;
   }

   public HospitalMember(String memName, int memAge)
   {
      name = memName;
      age = memAge;
      address = null;
      sex = "";
   }

   public HospitalMember(String memName, int memAge, String memSex)
   {
      name = memName;
      age = memAge;
      sex = memSex;
      address = " ";
   }

   protected void setName(String memName)
   {

      name = memName;
   }

   protected String getName()
   {
      return name;
   }

   protected void setAddress(String memAddress)
   {
      address = memAddress;
   }

   protected String getAddress()
   {
      return address;
   }

   protected void setAge(int memAge)
   {
      age = memAge;
   }

   protected int getAge()
   {
      return age;
   }

   protected void setSex(String memSex)
   {
      //removed memSex.toUpperCase(); & just included in the statement below:
      sex = memSex;
   }

   protected String getSex()
   {
      return sex;
   }

   protected abstract String getStatus();


   public String toString()
   {
      return ("Name: " + name + "\nAddress: " + address + "\nAge: " + age + " years old" + "\nGender: " + sex);
   }

   //Removed the publix static void main(String[] args)/ It does not need to be here!

}//class
