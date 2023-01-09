package security;

import org.springframework.stereotype.Component;
import security.model.Role;
import security.model.User;
import security.service.RoleService;
import security.service.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;
@Component
public class UtilCreateUsers {

    private final UserService userService;
    private final RoleService roleService;

    public UtilCreateUsers(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @PostConstruct
    public void startDataBase() {
        Role roleAdmin = new Role("ROLE_ADMIN");
        Role roleUser = new Role("ROLE_USER");
        Set<Role> adminSet = new HashSet<>();
        Set<Role> userSet = new HashSet<>();

        roleService.addRole(roleAdmin);
        roleService.addRole(roleUser);

        adminSet.add(roleAdmin);
        adminSet.add(roleUser);
        userSet.add(roleUser);

        User admin = new User("Admin", "Admin", 30, "admin@mail.ru", "admin", "admin", adminSet);
        User user = new User("User", "User", 30, "user@mail.ru", "user", "user", userSet);

        userService.saveUser(admin);
        userService.saveUser(user);
    }
}
