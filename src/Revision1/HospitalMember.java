package Revision1;
abstract public class HospitalMember
{
   private String name;
   private String address;
   private int age;
   private String Gender;

   public HospitalMember()
   {
      name = null;
      address = null;
      age = 0;
      Gender = null;

   }

   public HospitalMember(String memName, String memAddress, int memAge, String memGender)
   {
      name = memName;
      address = memAddress;
      age = memAge;
      Gender = memGender;
   }

   public HospitalMember(String memName, int memAge)
   {
      name = memName;
      age = memAge;
      address = null;
      Gender = null;
   }

   public HospitalMember(String memName, int memAge, String memGender)

   {
      name = memName;
      age = memAge;
      Gender = memGender;
      address = null;
   }

   public void setName(String memName)  { name = memName; }

   protected String getName()
   {
      return name;
   }

   public void setAddress(String memAddress)
   {
      address = memAddress;
   }

   protected String getAddress()
   {
      return address;
   }

   public void setAge(int memAge)
   {
      age = memAge;
   }

   protected int getAge()
   {
      return age;
   }

   public void setGender(String memGender)  { Gender = memGender; }

   protected String getGender()
   {
      return Gender;
   }

   protected abstract String getStatus();


   public String toString()
   {
      return ("Name: " + name + "\nAddress: " + address + "\nAge: " + age + " years old" + "\nGender: " + Gender);
   }

}//class
