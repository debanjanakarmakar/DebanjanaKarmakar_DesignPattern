package Creational;

class SingletonClass {
	  private static SingletonClass obj; 
	  
	    // private constructor to force use of 
	    // getInstance() to create Singleton object 
	    private SingletonClass() {} 
	  
	    public static SingletonClass getInstance() 
	    { 
	        if (obj==null) 
	            obj = new SingletonClass(); 
	        return obj; 
	    } 
	} 

class Singleton{
	public static void main(String args[])
	{
		SingletonClass s=SingletonClass.getInstance();
	}
}