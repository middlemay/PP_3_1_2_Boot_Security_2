package security.service;

import org.springframework.stereotype.Service;
import security.dao.RoleDao;
import security.model.Role;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService{

    private final RoleDao roleDao;


    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    public Role getRole(String userRole) {
        return roleDao.getRole(userRole);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleDao.getRoleById(id);
    }

    @Override
    @Transactional
    public void addRole(Role role) {
        roleDao.addRole(role);
    }
}
