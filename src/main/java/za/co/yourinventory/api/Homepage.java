package za.co.yourinventory.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Rosie on 2016/08/25.
 */
public class Homepage {


    @RestController
    @RequestMapping("/Homepage/**")
    public class HomePage {
        @Autowired
        @RequestMapping(value = "home",method = RequestMethod.GET)
        public String Index(){
            return "This is my Home Page";
        }

    }

}
