package controller;

import com.github.pagehelper.PageInfo;
import domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.ErrorLogService;

@Controller
@RequestMapping("/errorLog")
public class ErrorLogController {
    @Autowired
    private ErrorLogService logService;
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/all")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "6") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("errorLog_list");
        PageInfo<Log> logs = logService.findAll(pageNum,pageSize);
        modelAndView.getModelMap().addAttribute("logs",logs);
        return modelAndView;
    }

}
