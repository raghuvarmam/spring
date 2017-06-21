package spring_core.spring.demo;

public class Movie {
	private String hero;
	private String director;
	private double budget;
	
		
	public Movie() {
		System.out.println("movie object created");
	}
	
	public Movie(String hero, String director, double budget) {
		this.hero = hero;
		this.director = director;
		this.budget = budget;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Movie [hero=" + hero + ", director=" + director + ", budget=" + budget + "]";
	}
	
	
}
