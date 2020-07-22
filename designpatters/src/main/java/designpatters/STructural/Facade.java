package designpatters.STructural;

import java.util.Scanner;

interface Phone{  
		public void Model();  
		public void Phoneprice();  
	}  


	class Apple implements Phone {  
		//Override  
		public void Model() {  
			System.out.println("\n\nModel: iPhone 11 Pro");  
		}  
		//Override  
		public void Phoneprice() {  
			System.out.println("Price:  Rs 76000.00 \n\n");  
		}  
	}  

	class Samsung implements Phone {  
		//Override  
		public void Model() {  
			System.out.println("\n\nModel: C9 Pro");  
		}  
		//Override  
		public void Phoneprice() {  
			System.out.println("Price: Rs30000.00 \n\n");  
		}  
	}  

	class LG implements Phone {  
		//Override  
		public void Model() {  
			System.out.println("\n\nModel: LAVA 2G");  
		}  
		//Override  
		public void Phoneprice() {  
			System.out.println(" Rs 40000.00 \n\n");  
		}  
	}  


	class Store {  
		private Phone Samsung;  
		private Phone Apple; 
		private Phone LG ;  

		public Store(){  
			Samsung= new Samsung();  
			Apple=new Apple();  
			LG=new LG();  
		}  
		public void SamsungSale(){  
			Samsung.Model();  
			Samsung.Phoneprice();  
		}  
		public void LGSale(){  
			LG.Model();  
			LG.Phoneprice();  
		}  
		public void AppleSale(){  
			Apple.Model();  
			Apple.Phoneprice();  
		}  
	}  


	public class Facade {

		public static void main(String[] args)
		{
			int  c;
			Scanner Sn=new Scanner(System.in);
			do{    
				System.out.println("1:Apple");  
				System.out.println("2:Samsung");  
				System.out.println("3:LG");  
				System.out.println("4:Exit");  
				System.out.print("Enter your choice: ");  

				c=Sn.nextInt();
				Store buy = new Store();  

				switch (c) {  
				case 1:  
				{   
					buy.AppleSale();  
				}  
				break;  
				case 2:  
				{  
					buy.SamsungSale();        
				}  
				break;    
				case 3:  
				{  
					buy.LGSale();       
				}  
				break;     
				default:  
				{    
					System.out.println("No purchase");  
				}         
				return;  
				}  

			}while(c!=4);  
		}    

	}

