package service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.RoleDao;
import domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    public List<Role> findAll(){
        return roleDao.findAll();
    }

    public PageInfo<Role> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Role> roles = roleDao.findAll();
        return new PageInfo<>(roles);
    }

    public void add(Role role){
        role.setId(UUID.randomUUID().toString());
        roleDao.add(role);
    }
    public void update(Role role){
        roleDao.update(role);
    }
    public Role findById(String id){
        return roleDao.findById(id);
    }
    public List<Role> findOthersById(String id){
        return roleDao.findOthersById(id);
    }
    public PageInfo<Role> findByRoleName(int pageNum, int pageSize, String roleName){
        PageHelper.startPage(pageNum,pageSize);
        roleName = "%" +roleName +"%";
        List<Role> all = roleDao.findByRoleName(roleName);
        return new PageInfo<>(all);
    }
}
