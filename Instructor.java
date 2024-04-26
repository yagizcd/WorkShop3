package Kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private int id;
    private String name;

    private List<String> skillSet = new ArrayList<>();

    private List<String> classes;

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

    public List<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(List<String> skillSet) {
        this.skillSet = skillSet;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public Instructor(int id, String name, List<String> skillSet, List<String> classes) {
        this.id = id;
        this.name = name;
        this.skillSet = skillSet;
        this.classes = classes;
    }
}
