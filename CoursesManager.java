package Kodlamaio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoursesManager {
    private List<Course> courses;

    public void courseManager(){
        courses = new ArrayList<Course>();
        courses.add(new Course(1,
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın|\n|takip, döküman ve duyurularını buradan yapacağız.",
                "Engin Demirog",0,"course-box-image",1,1));
        courses.add(new Course(2,
                "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",
                "1,5 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın|\n|takip, döküman ve duyurularını buradan yapacağız.",
                "Engin Demirog",0,"course-box-image",1,1));
        courses.add(new Course(3,
                "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)",
                "Java Yazılım Geliştirici Yetiştirme Kampımızın|\n|takip, döküman ve duyurularını buradan yapacağız.",
                "Engin Demirog",0,"course-box-image",
        1,1));
        courses.add(new Course(4,
                "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın|\n|takip, döküman ve duyurularını buradan yapacağız.",
                "Engin Demirog",0,"course-box-image",1,1));
        courses.add(new Course(5,
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "Python & Selenium Yazılım Geliştirici Yetiştirme Kampımızın|\n|takip, döküman ve duyurularını buradan yapacağız.",
                "Engin Demirog",0,"course-box-image",1,1));
        courses.add(new Course(6,
                "(2023) Yazılım Geliştirici Yetiştirme Kampı - Python & Selenium",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın|\n|takip, döküman ve duyurularını buradan yapacağız.",
                "Halit Enes Kalaycı",0,"course-box-image",2,1));
        courses.add(new Course(7,
                "2024 Yazılım Geliştirici Yetiştirme Kampı (C#)",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın|\n|takip, döküman ve duyurularını buradan yapacağız.",
                "Engin Demirog",0,"course-box-image",1,1));
        courses.add(new Course(8,
                "Programlamaya Giriş için Temel Kurs",
                "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel\n|programlama mantığını anlaşılır örneklerle öğrenin.",
                "Engin Demirog",0,"course-box-image",1,1));


    }
    public void add(Course course){
        courses.add(course);
    }
    public List<Course> getAll(){
        return courses;
    }

    public Course getById(int id){
        for(Course course:courses){
            if (course.getId()==id){
                return course;
            }
        }
        return null;
    }

    public void update(Course course){
        for(Course updateCourses: courses){
            if (course.getId()==updateCourses.getId()){
                updateCourses.setCourseName(course.getCourseName());
                updateCourses.setId(course.getId());
            }
        }
    }

    public void delete(int id){
        Iterator<Course> iterator =courses.iterator();
        while(iterator.hasNext()){
            Course course = iterator.next();
            if (course.getId() ==id)
                iterator.remove();
        }
    }




}
