
import java.util.ArrayList;
import java.io.*;

public class EmployeesManager {
	int id;
	String name;
	String desig;
	static ArrayList al = new ArrayList();
	static int count = 0; // to track the no. of employees

	EmployeesManager() {
	}



	EmployeesManager(int id, String name, String desig) {
		this.id = id;
		this.name = name;
		this.desig = desig;
		count++;
	}



	public void putDetails(EmployeesManager e1) {
		al.add(e1);
	}

//method to retreive employee objects

	public EmployeesManager getDetails(int id) {
		EmployeesManager es = (EmployeesManager) al.get(id);
		return es;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		EmployeesManager e = new EmployeesManager();
		EmployeesManager e1 = new EmployeesManager(1, "SaiRam", "Project Owner");
		EmployeesManager e2 = new EmployeesManager(2, "Anu", "GL");
		EmployeesManager e3 = new EmployeesManager(3, "Vasu", "PM");
		EmployeesManager e4 = new EmployeesManager(4, "Shillu", "PL");
		EmployeesManager e5 = new EmployeesManager(5, "Madhu", "TL");
		EmployeesManager e6 = new EmployeesManager(6, "Volga", "TM");

		e.putDetails(e1);
		e.putDetails(e2);
		e.putDetails(e3);
		e.putDetails(e4);
		e.putDetails(e5);
		e.putDetails(e6);

		System.out.println("The total number of employees are: " + count);
		System.out.println(" ");

		while (true) {
			System.out.println("Enter employee id to get the employee details: ");
			int id = Integer.parseInt(br.readLine());
			boolean flag = false;

			for (int i = 0;; i++) {
				EmployeesManager es = e1.getDetails(i);
				if (id == es.id) {
					System.out.println("The details of the employee with id " + id + " is: ");
					System.out.print(es.id + " " + es.name + " " + es.desig);
					flag = true;
					break;
				}
			}

			System.out.println(" ");

			if (!flag) {
				System.out.println("Sorry, no data exists with the id " + id);
			}
			System.out.println(" ");
			String ch = null;

			while (true) {
				System.out.println("Want to Continue(y/n)?)");
				System.out.println(" ");
				ch = br.readLine();
				if (ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n"))
					break;
				if (!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n"))) {
					System.out.println("Invalid option : please type y/n");
					System.out.println(" ");
				}
			}

			if (ch.equalsIgnoreCase("n")) {
				System.out.println(" ");
				System.out.println("Thank you");
				break;
			}
		}
	}
}
