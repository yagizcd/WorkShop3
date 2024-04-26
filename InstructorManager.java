package Kodlamaio;

import java.util.*;

public class InstructorManager {
    private List<Instructor> instructors;

    public InstructorManager(){
        instructors = new ArrayList<Instructor>();

        instructors.add(new Instructor(1,"Engin Demirog", new ArrayList<>(Arrays.asList("C#","Java","Python")),
                new ArrayList<>(Arrays.asList("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",
                        "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)","(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",
                        "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","2024 Yazılım Geliştirici Yetiştirme Kampı (C#)",
                        "Programlamaya Giriş için Temel Kurs"))));
        instructors.add(new Instructor(2,"Halit Enes Kalaycı",new ArrayList<>(Arrays.asList("Python","Selenium")),
                new ArrayList<>(Arrays.asList("(2023) Yazılım Geliştirici Yetiştirme Kampı - Python & Selenium"))));
    }

    public List<Instructor> getAll(){
        return instructors;
    }
    public Instructor getById(int id){
        for (Instructor instructor: instructors){
            if(instructor.getId()==id) {
                return instructor;
            }
        }
        return null;
    }

    public Instructor getByName(String name){
        for (Instructor instructor: instructors){
            if(instructor.getName()==name){
                return instructor;
            }
        }
        return null;
    }
    public void update(Instructor instructor) {
        Iterator<Instructor> iterator = instructors.iterator();
        while (iterator.hasNext()) {
            Instructor updateInstructor = iterator.next();
            if (updateInstructor.getId() == instructor.getId()) {
                updateInstructor.setName(instructor.getName());
                updateInstructor.setSkillSet(instructor.getSkillSet());
            }
        }
    }
    public void delete(int id){
        Iterator<Instructor> iterator = instructors.iterator();
        while(iterator.hasNext()){
            Instructor instructor = iterator.next();
            if (instructor.getId()==id){
                iterator.remove();
            }
        }
    }


}
