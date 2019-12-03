package service;

import dao.CoinDao;
import domain.Coin;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoinService {
    @Autowired
    private CoinDao coinDao;
    public Coin findCoinByUid(User user) {
        Coin coin = coinDao.findCoinByUid(user.getId());
        return coin;
    }
    public User release(User user){
        Coin coin = findCoinByUid(user);
        double addCoin = coin.getEvrValue() * 0.02;
        coin.setCoinNum(coin.getCoinNum() + addCoin);
        coinDao.updateCoinNum(coin);
        return user;
    }
}
