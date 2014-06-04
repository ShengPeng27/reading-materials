
class Books extends ReadingMaterial{
	String nameOfAuthor;
	public Books(){
		
	}
	public Books(String name, int numberOfPages, String nameOfAuthor){
		this.name=name;
		this.numberOfPages=numberOfPages;
		this.nameOfAuthor=nameOfAuthor;
	}
	@Override
	public String toString() {
		return "Books [nameOfAuthor=" + nameOfAuthor + ", name=" + name
				+ ", numberOfPages=" + numberOfPages + "]";
	}
	

}
