//final lesson
//static and final keywords demonstrated through assigned main statements

class bike9 {
	final int speedlimit=90;//final variable
	void run() {
		speedlimit = 400; //wont let me change var bc its final
	}
	public static void main(String args[]) {
		bike9 obj = new bike9();
		obj.run();
	}

}
