
public class ReadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadingMaterial a1=new Novels("Harry Potter",805,"J.K Rowling","Harry Potter");
		ReadingMaterial a2=new Textbooks("Introduction to Java", 950,"Computer Science");
		display(a1);
		display(a2);
	}
	public static void display(ReadingMaterial x){
		System.out.println(x);
	}
}
