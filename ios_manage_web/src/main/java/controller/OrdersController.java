package controller;

import com.github.pagehelper.PageInfo;

import domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.OrderService;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    private OrderService orderService;


//    @RequestMapping("/all")
//    public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "3") int pageSize){
//        ModelAndView modelAndView = new ModelAndView();
//        PageInfo<Order> orders = orderService.findAll(pageNum,pageSize);
//        modelAndView.setViewName("order_list");
//        modelAndView.getModelMap().addAttribute("orders",orders);
//        return modelAndView;
//    }
//    @RequestMapping("/info")
//    public ModelAndView info(String id){
//        ModelAndView modelAndView = new ModelAndView();
//        Orders order = ordersService.findById(id);
//        modelAndView.setViewName("order_info");
//        modelAndView.getModelMap().addAttribute("order",order);
//        return modelAndView;
//    }
//    @RequestMapping("/add")
//    public String add(OrderAndTraveller ot){
//        Orders orders =new Orders();
//        orders.setMemberId(ot.getMemberId());
//        orders.setProductId(ot.getProductId());
//        String[] strings = ot.getTravellerId();
//        orders.setPeopleCount(strings.length);
//        Traveller traveller = new Traveller();
//        List<Traveller> travellers = new ArrayList<>();
//        for(int i = 0; i < strings.length;i++){
//             traveller = travellerService.findById(strings[i]);
//             travellers.add(traveller);
//        }
//
//        orders.setTravellers(travellers);
//        ordersService.addOrder(orders);
//            return "redirect:/order/all";
//    }
//    @RequestMapping("/findQueryVo")
//    public ModelAndView findQueryVo(){
//        QueryVo query = ordersService.findQuery();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.getModelMap().addAttribute("query",query);
//        modelAndView.setViewName("order_add");
//        return modelAndView;
//    }
//    @RequestMapping("/updateStatus")
//    public String updateStatus(String id){
//        orderService.updateStatus(id);
//        return "redirect:/order/all";
//    }
//
//
//    @RequestMapping("/findByOrderNum")
//    public ModelAndView findByProductName(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "3") int pageSize,String orderNum){
//        ModelAndView modelAndView = new ModelAndView();
//        PageInfo<Order> all = orderService.findByOrderNum(pageNum, pageSize,orderNum);
//        modelAndView.setViewName("order_list");
//        modelAndView.getModelMap().addAttribute("orders",all);
//        return modelAndView;
//    }




}
