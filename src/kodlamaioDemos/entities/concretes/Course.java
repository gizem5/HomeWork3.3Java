package kodlamaioDemos.entities.concretes;

import kodlamaioDemos.entities.abstracts.Entity;

public class Course implements Entity {

	private int id;
	private String name;
	private int categoryID;
	private String categoryName;
	private int ınstructorID;
	private String ınstructorName;
	private double price;
	private int studentPiece;

	public Course() {
	}

	public Course(int id, String name, int categoryID, String categoryName, int instructorID, String instructorName,
			double price, int studentPiece) {
		super();
		this.id = id;
		this.name = name;
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.ınstructorID = instructorID;
		this.ınstructorName = instructorName;
		this.price = price;
		this.studentPiece = studentPiece;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getInstructorID() {
		return ınstructorID;
	}

	public void setInstructorID(int instructorID) {
		ınstructorID = instructorID;
	}

	public String getInstructorName() {
		return ınstructorName;
	}

	public void setInstructorName(String instructorName) {
		ınstructorName = instructorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStudentPiece() {
		return studentPiece;
	}

	public void setStudentPiece(int studentPiece) {
		this.studentPiece = studentPiece;
	}

}
