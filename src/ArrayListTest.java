import java.util.Scanner;

public class ArrayListTest {


	public static void main(String[] args) {
		System.out.println("How many operations would you like to perform?");
		ArrayListLab arraylist = new ArrayListLab();
		Scanner in =new Scanner(System.in);
		int input=in.nextInt();
		int counter=0;
		while (counter<input) {
			System.out.println("Which operation would you like to perform, press (\"1 for adding to the list, 2 for removing certain item and 3 for printing\"\n" + 
					"					\"the size of the ArrayList\")");
					
			Scanner sc1=new Scanner(System.in);
			int operation1 = sc1.nextInt();
			if (operation1==1) {
				System.out.println("What element would you like to add?");
				Scanner sc2=new Scanner(System.in);
				int operation2 = sc2.nextInt();
				arraylist.add(sc2);
				counter++;
				
			}
			 if (operation1==2) {
				System.out.println("What element would you like to remove?");
				Scanner sc3=new Scanner(System.in);
				int operation2 = sc3.nextInt();
				arraylist.removeAll(sc3);;
				counter++;
				
			}
			if (operation1==3) {
				arraylist.printSize();
				counter++;
				
			}
			
		}
		System.out.println("You are done!");
		
		// TODO Auto-generated method stub

	}

}
