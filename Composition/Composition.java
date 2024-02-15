package Composition;

class Main {
	public static void main(String[] args) {
		Folder phpdemo1 = new Folder("php demo1");
		phpdemo1.addSubFolder("Source Files");
		phpdemo1.addSubFolder("Source Files", ".phalcon");
		phpdemo1.addSubFolder("Source Files", "app");
		phpdemo1.addSubFolder("app", "config");
		phpdemo1.addSubFolder("app", "controllers");
		phpdemo1.addSubFolder("app", "library");
		phpdemo1.addSubFolder("app", "migrations");
		phpdemo1.addSubFolder("app", "models");
		phpdemo1.addSubFolder("app", "views");
		phpdemo1.addSubFolder("Source Files", "cache");
		phpdemo1.addSubFolder("Source Files", "public");
		phpdemo1.addSubFile("public", ".htaccess");
		phpdemo1.addSubFile("public", ".htrouter.php");
		phpdemo1.addSubFile("public", "index.html");
		phpdemo1.addSubFolder("Include Path");
		phpdemo1.addSubFolder("Remote Files");

		System.out.println(phpdemo1.toString());

		phpdemo1.deleteSubFolder("app");
		System.out.println(phpdemo1.toString());

		phpdemo1.deleteSubFolder("public");
		System.out.println(phpdemo1.toString());
	}
}
