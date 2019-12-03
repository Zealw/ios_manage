package service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.AdminDao;
import domain.Role;
import domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService implements UserDetailsService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public PageInfo<Admin> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Admin> admins = adminDao.findAll();
        return new PageInfo<>(admins);
    }
    public void add(Admin admin){
        admin.setPassword(encoder.encode(admin.getPassword()));
        adminDao.addAdmin(admin);
    }
    public void addRoleToAdmin(String adminId,String[] roleIds){
        for(String roleId:roleIds){
            adminDao.addRoleToAdmin(adminId,roleId);
        }
    }
    public Admin findById(String id){
        return adminDao.findById(id);
    }

    public PageInfo<Admin> findByAdminName(int pageNum, int pageSize, String adminName){
        PageHelper.startPage(pageNum,pageSize);
        adminName = "%" +adminName +"%";
        List<Admin> all = adminDao.findByAdminNameS(adminName);
        return new PageInfo<>(all);
    }


    @Override
    public UserDetails loadUserByUsername(String adminName) throws UsernameNotFoundException {
        Admin admin = adminDao.findByAdminName(adminName);
        List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
        for(Role role :admin.getRoles()){
            list.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        User admin1 = new User(
                admin.getAdminName(),
                admin.getPassword(),
                admin.getStatus() == 0 ? false:true,
                true,
                true,
                true,
                list);
        return admin1;
    }
}
