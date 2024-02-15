package Aggregation;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Instructor> instructors = new ArrayList<>();
	private ArrayList<Textbook> textbooks = new ArrayList<>();

	public Course(String name, Instructor instructor, Textbook textbook) {
		this.name = name;
		this.instructors.add(instructor);
		this.textbooks.add(textbook);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(ArrayList<Instructor> instructors) {
		this.instructors = instructors;
	}

	public void addInstructor(Instructor instructor) {
		this.instructors.add(instructor);
	}

	public ArrayList<Textbook> getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(ArrayList<Textbook> textbooks) {
		this.textbooks = textbooks;
	}

	public void addTextbook(Textbook textbook) {
		this.textbooks.add(textbook);
	}

	public String toString(){
		String output = "Course Name: " + name;
		for (Instructor instructor : instructors) {
			output += "\nInstructor: " + instructor.getFirstName() + " " + instructor.getLastName();
		}
		for (Textbook textbook : textbooks) {
			output += "\nTexbook Title / Author: " + textbook.getTitle() + " / " + textbook.getAuthor();
		}
	
		return output;	
	}
	
}
