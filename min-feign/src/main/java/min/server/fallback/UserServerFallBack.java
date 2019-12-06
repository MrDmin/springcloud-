package min.server.fallback;

import com.min.to.User;
import min.server.UserServer;
import org.springframework.stereotype.Component;

@Component
public class UserServerFallBack implements UserServer {
    @Override
    public User getUser(String id) {
        return new User(id,"[min-feign]:cannot get value","[min-feign]:cannot get value");
    }
}
