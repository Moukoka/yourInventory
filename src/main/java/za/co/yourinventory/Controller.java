package za.co.yourinventory;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rosie on 2016/08/23.
 */
@RestController
@EnableAutoConfiguration
public class Controller {
    @RequestMapping("/")
    String message(){
        return "Welcome!";
    }
}
