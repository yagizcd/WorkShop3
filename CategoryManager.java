package Kodlamaio;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryManager {
    private List<Category> categories;

    public CategoryManager(){
        categories = new ArrayList<Category>();

        categories.add(new Category(1,"Programlama",1));
        categories.add(new Category(1,"Programlama",2));
        categories.add(new Category(1,"Programlama",3));
        categories.add(new Category(1,"Programlama",4));
        categories.add(new Category(1,"Programlama",5));
        categories.add(new Category(1,"Programlama",6));
        categories.add(new Category(1,"Programlama",7));
        categories.add(new Category(1,"Programlama",8));

    }
    public void add(Category category){
        categories.add(category);
    }
    public List<Category> getAll(){
        return categories;
    }

    public Category getById(int id) {
        for(Category category:categories){
            if (category.getId()==id){
                return category;
            }
        }
        return null;
    }

    public Category getByName(String name){
        for(Category category:categories){
            if (category.getName()==name){
                return category;
            }
        }
        return null;
    }

    public void delete(int id){
        Iterator<Category> iterator =categories.iterator();
        while(iterator.hasNext()){
            Category category = iterator.next();
            if (category.getId() ==id)
                iterator.remove();
        }
    }
    public void update(Category category){
        for(Category updateCategory: categories){
            if (category.getId()==updateCategory.getId()&&category.getCourseId()== updateCategory.getCourseId()){
                updateCategory.setName(category.getName());
                updateCategory.setId(category.getId());
                updateCategory.setCourseId(category.getCourseId());
            }
        }
    }

}
