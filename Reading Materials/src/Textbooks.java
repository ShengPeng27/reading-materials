
class Textbooks extends ReadingMaterial{
	String nameOfCourse;
	public Textbooks(){
		
	}
	public Textbooks(String name,int numberOfPages,String nameOfCourse){
		this.name=name;
		this.numberOfPages=numberOfPages;
		this.nameOfCourse=nameOfCourse;		
	}
	@Override
	public String toString() {
		return "Textbooks [nameOfCourse=" + nameOfCourse + ", name=" + name
				+ ", numberOfPages=" + numberOfPages + "]";
	}
	
}
