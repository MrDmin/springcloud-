package min.controller;

import com.min.to.User;
import com.netflix.discovery.converters.Auto;
import min.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private UserServer userServer;

    @RequestMapping(value = "/user/get/{id}" , method = RequestMethod.GET)
    private User getUserByID(@PathVariable("id") String id){
        return userServer.getUser(id);
    }
}
