import java.util.Scanner;

class Student{
    private String name;
    private float grade;
    
    public Student(String name, float grade){
        
        this.name = name;
        this.grade = grade;
    }
    
    public void printGrade(){
        
        if(grade >= 90){
            System.out.println(name+", Your Grade is an A");
        }
        
        else if(grade >= 80){
            System.out.println(name+", Your Grades is an B");
        }
        
        else if(grade >= 70){
            System.out.print(name+", Your Grades is an C");
        }
        
        else if(grade >= 60){
            System.out.print(name+", Your Grades is an D");
        }
        
        else{
            System.out.println(name+", Your Grade is an E");
        }
    }
}
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Grades: ");
		float grade = sc.nextFloat();
		
		Student st = new Student(name, grade);
		st.printGrade();
	}
}