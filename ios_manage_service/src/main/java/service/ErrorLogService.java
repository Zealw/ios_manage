package service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.ErrorLogDao;
import domain.ErrorLog;
import domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErrorLogService {
    @Autowired
    private ErrorLogDao logDao;

    public PageInfo<Log> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Log> logs = logDao.findAll();
        return new PageInfo<>(logs);
    }
    public void add(ErrorLog errorLog){
        logDao.add(errorLog);
    }
}
