package controller;

import domain.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.NewService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NewController {
    @Autowired
    private NewService newService;
    @RequestMapping("/findAll")
    public ModelAndView findAllNews(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("life");

        List<New> news = newService.findAllNews();
        modelAndView.getModelMap().addAttribute("news",news);
        return modelAndView;
    }




}
