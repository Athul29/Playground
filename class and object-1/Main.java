import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
        System.out.println("Registration");
    System.out.println("Enter your name");
    String Name=sc.next();
    System.out.println("Enter your address");   
    String Address=sc.next();
        System.out.println("Contact Number");
    String Contact=sc.next();
        System.out.println("E-Mail ID");
    String Email=sc.next();
      System.out.println("Enter proof type");
    String Prooftype=sc.next();
     System.out.println("Enter proof id");
    String proofId=sc.next();
        System.out.println("Customer Details");
    Customer cstr=new Customer();
    cstr.setName(Name);
    cstr.setAddress(Address);
    cstr.setContact(Contact);
    cstr.setEmail(Email);
    cstr.setProoftype(Prooftype);
    cstr.setProofid(proofId);
    String a=cstr.getName();
    String b=cstr.getAddress();
    String c=cstr.getContact();
    String d=cstr.getEmail();
    String e=cstr.getProoftype();
    String f=cstr.getProofid();
        System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
     System.out.println("Thank you for registering. Your id is 1...");
    
    //type your code here
  }
}
class Customer
{
    String Name;
    String Address;
    String Contact;
    String Email;
    String Prooftype;
    String proofId;
    public void setName(String person)
    {
		this.Name = person;
	}
     public String getName()
     {
		return Name;
	}
   public void setAddress(String addr)
    {
		this.Address = addr;
	}
     public String getAddress()
     {
		return Address;
	}
  public void setContact(String con)
    {
		this.Contact = con;
	}
     public String getContact()
     {
		return Contact;
	}
    public void setEmail(String mail)
    {
		this.Email = mail;
	}
     public String getEmail()
     {
		return Email;
	}
   public void setProoftype(String proof)
    {
		this.Prooftype = proof;
	}
     public String getProoftype()
     {
		return Prooftype;
	 }
  public void setProofid(String proofi)
    {
		this.proofId = proofi;
	}
     public String getProofid()
     {
		return proofId;
	 }
}