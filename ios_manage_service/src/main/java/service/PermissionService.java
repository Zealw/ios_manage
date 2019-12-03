package service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.PermissionDao;
import domain.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PermissionService {
    @Autowired
    private PermissionDao permissionDao;
    public PageInfo<Permission> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Permission> permission = permissionDao.findAll();
        return new PageInfo<>(permission);
    }
    public void add(Permission permission){
        permission.setId(UUID.randomUUID().toString());
        permissionDao.add(permission);
    }
    public void update(Permission permission){
        permissionDao.update(permission);
    }
    public void del(String id){
        permissionDao.del(id);
    }
    public Permission findById(String id){
        return permissionDao.findById(id);
    }

    public PageInfo<Permission> findByPermissionName(int pageNum, int pageSize, String permissionName){
        PageHelper.startPage(pageNum,pageSize);
        permissionName = "%" +permissionName +"%";
        List<Permission> all = permissionDao.findByPermissionName(permissionName);
        return new PageInfo<>(all);
    }


}
