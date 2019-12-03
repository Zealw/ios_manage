package service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.LogDao;
import domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    @Autowired
    private LogDao logDao;

    public PageInfo<Log> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Log> logs = logDao.findAll();
        return new PageInfo<>(logs);
    }
    public void add(Log log){
        logDao.add(log);
    }
}
