package controller;

import com.github.pagehelper.PageInfo;
import domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/all")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Role> roles = roleService.findAll(pageNum,pageSize);
        modelAndView.setViewName("role_list");
        modelAndView.getModelMap().addAttribute("roles",roles);
        return modelAndView;
    }
    @RequestMapping("/findById")
    public ModelAndView findById(String id){
        ModelAndView modelAndView = new ModelAndView();
        Role role = roleService.findById(id);
        modelAndView.setViewName("role_update");
        modelAndView.getModelMap().addAttribute("role",role);
        return modelAndView;
    }
    @RequestMapping("/update")
    public String update(Role role){
        roleService.update(role);
        return "redirect:/role/all";
    }
    @RequestMapping("/add")
    public String  add(Role role){
        roleService.add(role);
        return "redirect:/role/all";
    }



    @RequestMapping("/info")
    public ModelAndView info(String id){
        ModelAndView modelAndView = new ModelAndView();
        Role role = roleService.findById(id);
        modelAndView.getModelMap().addAttribute("role",role);
        modelAndView.setViewName("role_info");
        return modelAndView;
    }
    @RequestMapping("/findByRoleName")
    public ModelAndView findByRoleName(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize,String roleName){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Role> all = roleService.findByRoleName(pageNum, pageSize,roleName);
        modelAndView.setViewName("role_list");
        modelAndView.getModelMap().addAttribute("roles",all);
        return modelAndView;
    }


}

