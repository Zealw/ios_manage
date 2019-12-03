package controller;

import com.github.pagehelper.PageInfo;
import domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.LogService;

@Controller
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;

    @RequestMapping("/all")
    public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("log_list");
        PageInfo<Log> logs = logService.findAll(pageNum,pageSize);
        modelAndView.getModelMap().addAttribute("logs",logs);
        return modelAndView;
    }

}
