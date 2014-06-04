
class Magazines extends ReadingMaterial {
	public Magazines(){
		
	}
	public Magazines(String name, int numberOfPages){
		this.name=name;
		this.numberOfPages=numberOfPages;
	}
	@Override
	public String toString() {
		return "Magazines [name=" + name + ", numberOfPages=" + numberOfPages
				+ "]";
	}
	
}
