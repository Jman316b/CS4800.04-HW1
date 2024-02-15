package Composition;

public class File {
	private String name;

	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return ("File: " + name + "\n");
	}

	public String toString(int indentLevel) {
		String output = "";
		for(int i = 0; i < indentLevel; i++){
			output += ("+");
		}
		output += ("File: " + name + "\n");
		return output;
	}
}
