package Session3.Assignment1;
// To differentiate instance variable and class variable
public class employee {
	String name;
	int empid;
	static String company="XYZ";//Class variable

	public employee(String empname,int empnum){
		name = empname;//Instance variable
		empid = empnum;

	}
	public void display()
	{
		
		System.out.println("Instance variable -Empname : " +name);
		System.out.println("Class variable -Companyname: " +company);
		System.out.println("Instance Variable -Empid :" +empid);
	}
	public static void main(String[] args)
	{

		employee e1 =new employee("kamath",1);
		employee e2 = new employee("Sastry",2);
		System.out.println("For both the empid, the companyname(static) is same");
		e1.display();
		e2.display();

	}

}
