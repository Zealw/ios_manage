package controller;

import domain.CoinBuyer;
import domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CoinBuyerService;

import java.util.List;

@Controller
@RequestMapping("/coinBuyer")
public class CoinBuyerController {
    @Autowired
    private CoinBuyerService coinBuyerService;
    @RequestMapping("/all")
    public ModelAndView findAll(){
        List<CoinBuyer> buyers = coinBuyerService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModelMap().addAttribute("buyers",buyers);
        modelAndView.setViewName("market");
        return modelAndView;
    }
    @RequestMapping("/add")
    public String add(CoinBuyer coinBuyer, ModelMap modelMap){
        Result result = coinBuyerService.add(coinBuyer);
        if(result.isResult()){
            return "redirect:/coinBuyer/all";
        }else{
            modelMap.addAttribute("result",result);
            return "result";
        }
    }
    @RequestMapping("/findByUid")
    public ModelAndView findByUid(int id){
        List<CoinBuyer> buyers = coinBuyerService.findByUid(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModelMap().addAttribute("buyers",buyers);
        modelAndView.setViewName("order");
        return modelAndView;
    }

}
