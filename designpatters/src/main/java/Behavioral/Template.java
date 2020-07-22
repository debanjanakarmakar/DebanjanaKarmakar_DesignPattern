package Behavioral;

abstract class Institution
{
	
	public abstract String getname();
	public abstract void setname(String s);
	
}

class School extends Institution
{
	String school;
	public String getname()
	{
		return school;
	}

	@Override
	public void setname(String s) {
		
		school=s;
		
	}
}

class College extends Institution
{
	String college;
	public String getname()
	{
		return college;
	}

	@Override
	public void setname(String s) {
		
		
		college=s;
	}
}
public class Template {
	
	public static void main(String args[])
	{
	
		School so=new School();

		so.setname("School1");
		System.out.println("School Name: "+so.getname());
		
		College c=new College();
		c.setname("College1");
		System.out.println("College Name: "+c.getname());
	}
	

}
