
class TechnicalJournals extends ReadingMaterial{
	String nameOfAuthor;
	public TechnicalJournals(){
		
	}
	public TechnicalJournals(String name, int numberOfPages, String nameOfAuthor){
		this.name=name;
		this.numberOfPages=numberOfPages;
		this.nameOfAuthor=nameOfAuthor;
	}
	public String toString() {
		return "Books [nameOfAuthor=" + nameOfAuthor + ", name=" + name
				+ ", numberOfPages=" + numberOfPages + "]";
	}
}
