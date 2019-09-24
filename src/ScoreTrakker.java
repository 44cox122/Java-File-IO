import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {

	private ArrayList<Student> my_list = new ArrayList<Student>();
	

	ScoreTrakker(){}
	
	
	public void loadDataFromFile(String fileName) {
		
		// this try catch will throw and print error if 
		try {
			FileReader reader = new FileReader(fileName);
			Scanner in = new Scanner(reader);
			
			while(in.hasNextLine()) {
				String name = in.nextLine();
				int score = Integer.parseInt(in.nextLine());
				Student tempStudent = new Student(name, score);
				
				my_list.add(tempStudent);
			}
			
		} catch (Exception e) {
			if()
			System.out.println("Error: "  + e);
			System.exit(-1);
		}
		
		
	
	}
	
	
	public void printInOrder(ArrayList<Student> list) {
		Collections.sort(my_list);
		System.out.println("Student Score List");
		for(Student student : my_list) {
			System.out.println(student.toString());
		}
	}
	
	
	public void processFiles(String path, ArrayList<Student> list) {
		loadDataFromFile(path);
		printInOrder(list);
	}
	
	
	public static void main(String[] args) {
		ScoreTrakker my_trakker = new ScoreTrakker();
		my_trakker.processFiles("scores.txt", my_trakker.my_list);
	}
}
