package za.co.yourinventory.factories;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.co.yourinventory.domain.Categories;

/**
 * Created by Rosie on 2016/08/21.
 */
public class CategoryFactoryTest extends TestCase {

    public void testCreateCategory() throws Exception {

        Categories cat = CategoryFactory.createCategory("Coffee");
        Assert.assertEquals("Coffee", cat.getCat_name());
    }
}