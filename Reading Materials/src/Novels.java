
 class Novels extends ReadingMaterial {
	 String nameOfAuthor;
	 String nameOfPrimaryCharacter;
	 public Novels(){
		 
	 }
	 public Novels(String name, int numberOfPages, String nameOfAuthor, String nameOfPrimaryCharacter){
		 this.name=name;
		 this.numberOfPages=numberOfPages;
		 this.nameOfAuthor=nameOfAuthor;
		 this.nameOfPrimaryCharacter=nameOfPrimaryCharacter;
	 }
	@Override
	public String toString() {
		return "Novels [nameOfAuthor=" + nameOfAuthor
				+ ", nameOfPrimaryCharacter=" + nameOfPrimaryCharacter
				+ ", name=" + name + ", numberOfPages=" + numberOfPages + "]";
	}
	 
}
