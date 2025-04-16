package Collection;

import java.util.Scanner;

public class employeeDriver {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    while(true) {
		System.out.println("----Welcome to employee management system----");
		System.out.println("1 - Add emoployee\n2 - Print all employee\n3 - Search employee\n4 - Search employee by Id\n5 - Delete employee\n6 - Delete employee by id\n7 - Update employee\n8 - Sort employee based on id");


		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			 employee emp=createEmployeeObject(sc);
			 employee_Utility.addemployee(emp);
			 break;
		}
		case 2:{
			employee_Utility.print();
			break;
		}
		case 3:{
			employee emp=createEmployeeObject(sc);
			boolean result=employee_Utility.searchObject(emp);
			if(result) {
				System.out.println("Employee found");
			}else {
				System.out.println("Employee not found");
			}
			break;
		}
		case 4:{
			System.out.println("Enter Id to search");
			int idd=sc.nextInt();
			boolean result=employee_Utility.searchbyid(idd);
			
			if(result) {
				System.out.println("found");
			}else {
				System.out.println("not found");
			}
			break;
		}
		
		case 5:{
			employee emp=createEmployeeObject(sc);
			employee_Utility.removeObject(emp);
			break;}
		
		case 6:{
			System.out.println("Enter id");
			int id=sc.nextInt();
			employee_Utility.removebyid(id);
			break;
			}
		case 7:{
			System.out.println("Enter the id to be updated");
			int id=sc.nextInt();
			employee_Utility.updatebyId(id, sc);
			break;
			}
		case 8:{
			 employee_Utility.sort();
			 break;
		}
			

		default:
			System.exit(0);
		}
	    }
	}
		private static employee createEmployeeObject(Scanner sc) {
			System.out.println("Enter name, id, salary");
			employee emp=new employee(sc.next(),sc.nextInt(),sc.nextDouble());
			return emp;
		}
			// TODO Auto-generated method stub

		}
	
