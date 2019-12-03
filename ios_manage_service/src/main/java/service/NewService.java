package service;

import dao.NewDao;
import domain.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewService {
    @Autowired
    private NewDao newDao;
    public  List<New> findAllNews() {
        List<New> news = newDao.findAllNews();
        return news;
    }
    public void addNews(){
        New n = new New();
        New n1 = new New();
        n.setTitle("root");
        n.setTitle("root111");
    newDao.add(n);
    //int i = 1/0;
    newDao.add(n1);
    }
}
