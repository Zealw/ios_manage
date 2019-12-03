package service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.CoinBuyerDao;
import dao.CoinDao;
import dao.OrderDao;
import domain.*;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.*;
//import java.util.Random;

//ctrl + alt + o 整理导包
//ctrl + shift + inter 光标下一行
// alt + 方向键 跳转方法
//ctrl + m 光标居中
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private CoinDao coinDao;
    @Autowired
    private CoinBuyerDao coinBuyerDao;
    @Autowired
    private OrderDao orderDao;
    public PageInfo<User> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userDao.findAll();
        return new PageInfo<>(users);
    }
    public void add(User user){
        userDao.add(user);
    }
    public void update(User user){
        userDao.update(user);
    }
    public PageInfo<User> findByUsername(int pageNum,int pageSize,String username){
            return null;
    }
    public User findById(int id){
        return null;

    }


}
