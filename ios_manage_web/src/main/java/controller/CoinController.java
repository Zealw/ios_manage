package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CoinService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/coin")
public class CoinController {
    @Autowired
    private CoinService coinService;
    @RequestMapping("/release")
    public ModelAndView release(HttpServletRequest request, User user){
        double theCoin = user.getCoin().getCoinNum();
        ModelAndView modelAndView = new ModelAndView();
        user = coinService.release(user);
        double theChangeCoin = user.getCoin().getCoinNum();
        modelAndView.setViewName("release");
        modelAndView.getModelMap().addAttribute("theCoin");
        modelAndView.getModelMap().addAttribute("theChangeCoin");
        return modelAndView;
    }
}
