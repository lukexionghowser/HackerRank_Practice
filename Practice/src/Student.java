//static lesson
//static and final keywords demonstrated through assigned main statements


//remove public and leave as class Student{}
class Student {
	int rollno;
	String name;
	static String college = "UWM";
	
	Student(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" " +name+" "+college);
	}
	public static void main(String args[]) {
		Student s1 = new Student(111, "John");
		Student s2 = new Student(222,"Jane");
		
		s1.display();
		s2.display();
	}
}


