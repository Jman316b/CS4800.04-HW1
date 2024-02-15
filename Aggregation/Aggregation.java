package Aggregation;

class Main{
	public static void main(String[] args) {
		System.out.println("One of Each");
		Instructor Nima = new Instructor("Nima", "Davarpanah", "3-2636");
		Textbook CleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentince Hall");
		Course SoftwareEngeneering = new Course("Software Engeneering", Nima, CleanCode);
		System.out.println(SoftwareEngeneering.toString());
		
		System.out.println("\nTwo of Each");
		Instructor Joe = new Instructor("Joe", "Shmoe", "5-9237");
		Textbook FastCoding = new Textbook("Fast Coding", "George McClarin", "Penguin");
		SoftwareEngeneering.addInstructor(Joe);
		SoftwareEngeneering.addTextbook(FastCoding);
		System.out.println(SoftwareEngeneering.toString());
	}
}