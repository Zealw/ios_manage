package service;

import dao.CommodityDao;
import domain.Commodity;
import domain.QueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommodityService {
    @Autowired
    private CommodityDao commodityDao;
    public  List<Commodity> showAllCommodities(){
        List<Commodity> commodities = commodityDao.showAllCommodities();
        return commodities;
    }
    public Commodity findCommodityById(String id){
        Commodity commodity = commodityDao.findCommodityById(id);
        return commodity;
    }

}
