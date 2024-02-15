package Composition;

import java.util.ArrayList;

public class Folder {
	private String name;
	private ArrayList<Folder> subFolders = new ArrayList<>();
	private ArrayList<File> subFiles = new ArrayList<>();
	
	public Folder(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Folder> getSubFolders() {
		return subFolders;
	}

	public void addSubFolder(String name) {
		Folder subFolder = new Folder(name);
		this.subFolders.add(subFolder);
	}
	
	public void addSubFolder(String subFolder, String name) {
		for (Folder folder : subFolders) {
			if(!folder.subFolders.isEmpty())
				folder.addSubFolder(subFolder, name);
			if(folder.getName() == subFolder){
				folder.subFolders.add(new Folder(name));
			}
		}
	}

	public void deleteSubFolder(String subFolder) {
		for (int i = 0; i < this.subFolders.size(); i++) {
			if(!subFolders.get(i).subFolders.isEmpty())
				subFolders.get(i).deleteSubFolder(subFolder);
			if(subFolders.get(i).getName() == subFolder){
				subFolders.remove(i);
			}
		}
	}

	public ArrayList<File> getSubFiles() {
		return subFiles;
	}

	public void addSubFile(String name) {
		File subFile = new File(name);
		this.subFiles.add(subFile);
	}

	public void addSubFile(String subFolder, String name) {
		for (Folder folder : subFolders) {
			if(!folder.subFolders.isEmpty())
				folder.addSubFile(subFolder, name);
			if(folder.getName() == subFolder){
				folder.subFiles.add(new File(name));
			}
		}
	}
	
	public String toString() {
		String output = ("Folder: " + name + "\n");
		for (Folder folder : subFolders) {
			output += folder.toString(1);
		}
		for (File file : subFiles) {
			output += file.toString();
		}
		return output;
	}

	public String toString(int indentLevel) {
		String output = "";
		for(int i = 0; i < indentLevel; i++){
			output += (">");
		}
		indentLevel++;
		output += ("Folder: " + name + "\n");
		for (Folder folder : subFolders) {
			output += folder.toString(indentLevel);
		}
		for (File file : subFiles) {
			output += file.toString(indentLevel);
		}
		return output;
	}
}
