package Kodlamaio;

import java.util.*;

public class CoursesMain {
    public static void main(String[] args) {
        CoursesManager coursesManager = new CoursesManager();
        coursesManager.courseManager();
        List<Course> courses = coursesManager.getAll();
        //Course Yazdirma
        for (Course cour: courses){
            System.out.println("|----------------------------------------------------------------|");
            System.out.println("|Course Name:"+cour.getCourseName()+"\t|\n"
            +"|Title:"+cour.getTitle()+"\t\t\t   |\n|Instructor:\t"+cour.getInstructor()+
                    "\t\tPrice:"+cour.getPrice()+" TL\t\t\t\t |");
        }
        System.out.println("|----------------------------------------------------------------|");

        //Instructor Yazdirma
        InstructorManager instructorManager = new InstructorManager();
        List<Instructor> instructors = instructorManager.getAll();
        for (Instructor ins: instructors){
            System.out.println("Id:"+ins.getId()+"  Name:"+ins.getName()+"\nCourses:"+ins.getSkillSet());
        }
        //----------------------------------

        //Inst Guncelleme
        Instructor inst1 = new Instructor(2,"Yagiz Delibas",new ArrayList<>(Arrays.asList("Python","C++","Java")),
                new ArrayList<>(Arrays.asList("Alistirmalar")));
        instructorManager.update(inst1);
        for (Instructor ins: instructors){
            System.out.println("Id:"+ins.getId()+"  Name:"+ins.getName()+"\nCourses:"+ins.getSkillSet());
        }

        //Inst Silme
        instructorManager.delete(2);
        //Category list
        CategoryManager categoryManager = new CategoryManager();
        List<Category> categories = categoryManager.getAll();
        for(Category category: categories){
            System.out.println("Category Name: "+category.getName()+"  Course Id: "+category.getCourseId());
        }
        System.out.println("Updated Categories");
        categoryManager.update(new Category(1,"Soft Skill",5));
        for(Category category: categories){
            System.out.println("Category Name: "+category.getName()+"  Course Id: "+category.getCourseId());
        }

    }
}
