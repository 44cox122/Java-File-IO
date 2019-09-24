
public class Student implements Comparable<Student>{
	
	private String name;
	private int score;
	
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public String toString(){
		return name + " " + score;		
	}
	

	@Override
	public int compareTo(Student o) {
		if(this.score >  o.getScore()) {
			return 1;
			}
		else if(this.score == o.getScore()) {
			return 0;
		}
		else {
			return -1;
		}
	}

}
