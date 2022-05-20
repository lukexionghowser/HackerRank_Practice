package One;

public class TestArray5 {
	public static void main(String[] args) {
		//declare a string array with initial size
		String[] schoolbag = new String[4];
		
		//add elements to the array
		schoolbag[0]="Books";
		schoolbag[1]="Pens";
		schoolbag[2]="Pencils";
		schoolbag[3]="Crayons";

		String[] schoolbag2 = {"Books", "Pens", "Pencils", "Notebooks"};
		int size = schoolbag2.length;
		System.out.println("The size of array is "  + size);
		for (int i=0; i < size; i++) {
			System.out.print("Index ["+i+"] = " + schoolbag2[i]);
			System.out.print("\n");
		}
		}
		//System.out.print(schoolbag[0]);
	}
	


