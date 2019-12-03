package controller;

import com.github.pagehelper.PageInfo;
import domain.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.PermissionService;

@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;
    @RequestMapping("/all")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Permission> permissions = permissionService.findAll(pageNum,pageSize);
        modelAndView.setViewName("permission_list");
        modelAndView.getModelMap().addAttribute("permissions",permissions);
        return modelAndView;
    }
    @RequestMapping("/add")
    public String  add(Permission permission){
        permissionService.add(permission);
        return "redirect:/permission/all";
    }

    @RequestMapping("/findById")
    public ModelAndView findById(String id){
        ModelAndView modelAndView = new ModelAndView();
        Permission permission = permissionService.findById(id);
        modelAndView.setViewName("permission_update");
        modelAndView.getModelMap().addAttribute("permission",permission);
        return modelAndView;
    }
    @RequestMapping("/update")
    public String update(Permission permission){
        permissionService.update(permission);
        return "redirect:/permission/all";
    }
    @RequestMapping("/del")
    public String del(String id){
        permissionService.del(id);
        return "redirect:/permission/all";
    }
    @RequestMapping("/findByPermissionName")
    public ModelAndView findByRoleName(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize,String permissionName){
        ModelAndView modelAndView = new ModelAndView();
        PageInfo<Permission> all = permissionService.findByPermissionName(pageNum, pageSize,permissionName);
        modelAndView.setViewName("permission_list");
        modelAndView.getModelMap().addAttribute("permissions",all);
        return modelAndView;
    }


}

