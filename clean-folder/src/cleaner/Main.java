package cleaner;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0)
			deleteRecursive(new File(args[0]));
		else
			System.out.println("Your must add path to folder {ex: clean_folder.jar D:\\\\Downloads}");
	}

	public static void deleteRecursive(File path) {
		File[] c = path.listFiles();

		System.out.println("Cleaning out folder:" + path.toString());

		for (File file : c) {
			if (file.isDirectory()) {
				System.out.println("Deleting file:" + file.toString());

				deleteRecursive(file);

				file.delete();
			} else {
				file.delete();
			}
		}
	}

}
