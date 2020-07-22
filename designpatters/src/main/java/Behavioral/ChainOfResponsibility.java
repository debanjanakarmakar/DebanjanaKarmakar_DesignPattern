package Behavioral;

class Manager{
	static int employeenumber;
	Manager()
	{
		employeenumber=0;
	}
	
	void addemployee()
	{
		employeenumber++;
	}
	
	static void removeemployee()

	{
		employeenumber--;
	}
}

class Employee
{
	int jobnumber;
	
	Employee(int x)
	{
		jobnumber=-1;
	}
	
	public void  addjob(int g)
	{
		System.out.println("Employee Adding job");
		jobnumber=g;
	}
	
	public void addemployee()
	{
		Manager obj=new Manager();
		System.out.println("Calling manager to add an employee");
		obj.addemployee();
	}
	public void removeemployee()
	{
		System.out.println("Calling manager to remove another employee");
		Manager.removeemployee();
	}
	
	
	
}
public class ChainOfResponsibility {
	
	
	public static void main(String args[])
	{
		Employee e=new Employee(3);
	Manager m=new Manager();
	m.addemployee();
	
	Manager.removeemployee();
	e.addjob(3);
	e.addemployee();
	}
	

}
