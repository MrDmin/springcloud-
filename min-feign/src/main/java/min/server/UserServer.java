package min.server;

import com.min.to.User;
import min.server.fallback.UserServerFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(value = "min-user-api" , fallback = UserServerFallBack.class)
@FeignClient(value = "min-user-api")
public interface UserServer {

    @RequestMapping(value = "/user/get/{id}" , method = RequestMethod.GET)
    User getUser(@PathVariable("id") String id);
}
