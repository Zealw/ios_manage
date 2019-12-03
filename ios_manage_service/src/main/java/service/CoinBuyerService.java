package service;

import dao.CoinBuyerDao;
import dao.UserDao;
import domain.CoinBuyer;
import domain.Result;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CoinBuyerService {
    @Autowired
    private CoinBuyerDao coinBuyerDao;
    @Autowired
    private UserDao userDao;
    public List<CoinBuyer> findAll(){
        return coinBuyerDao.findAll();
    }
    public Result add(CoinBuyer coinBuyer){

        return null;
    }
    public List<CoinBuyer> findByUid(int uid){
        return coinBuyerDao.findByUid(uid);
    }
}
