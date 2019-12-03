package controller;

import com.github.pagehelper.PageInfo;
import domain.Admin;
import domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.AdminService;
import service.RoleService;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private RoleService roleService;

    @RequestMapping("/all")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Admin> admins = adminService.findAll(pageNum,pageSize);
        modelAndView.setViewName("admin_list");
        modelAndView.getModelMap().addAttribute("admins",admins);
        return modelAndView;
    }
    @RequestMapping("/findOthersById")
    public ModelAndView findOthersById(String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin_role_add");
        List<Role> roles = roleService.findOthersById(id);
        modelAndView.getModelMap().addAttribute("roles",roles);
        modelAndView.getModelMap().addAttribute("id",id);
        return modelAndView;
    }
    @RequestMapping("/add")
    public String add(Admin adminInfo){
        adminService.add(adminInfo);
        return "redirect:/admin/all";
    }

    @RequestMapping("/info")
    public ModelAndView info(String id){
        ModelAndView modelAndView = new ModelAndView();
        Admin admin = adminService.findById(id);
        modelAndView.getModelMap().addAttribute("admin",admin);
        modelAndView.setViewName("admin_info");
        return modelAndView;
    }
    @RequestMapping("/addRoleToUser")
    public String addRoleToUser(String adminId,String[] roleIds){
        adminService.addRoleToAdmin(adminId,roleIds);
        return "redirect:/admin/all";
    }
    @RequestMapping("/findByUsername")
    public ModelAndView findByProductName(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize,String adminname){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Admin> all = adminService.findByAdminName(pageNum, pageSize,adminname);
        modelAndView.setViewName("admin_list");
        modelAndView.getModelMap().addAttribute("admins",all);
        return modelAndView;
    }

    

}
