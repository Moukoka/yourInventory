package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Categories;

/**
 * Created by Rosie on 2016/08/21.
 */
public class CategoryFactory {
    public static Categories createCategory(String name){
        Categories categories = new Categories.Builder().name(name).build();
        return categories;
    }
}
