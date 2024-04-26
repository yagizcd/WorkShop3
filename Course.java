package Kodlamaio;

public class Course {

    private int id;
    private String courseName;
    private String title;
    private String instructor;
    private double price;

    private String image;

    private int categoryId;

    private int instructorId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Course(int id,String courses, String title, String instructor, double price,String image,int instructorId,int categoryId) {
        this.id =id;
        this.courseName = courses;
        this.title = title;
        this.instructor = instructor;
        this.price = price;
        this.image = image;
        this.categoryId = categoryId;
        this.instructorId = instructorId;
    }

    public Course() {
    }
}
