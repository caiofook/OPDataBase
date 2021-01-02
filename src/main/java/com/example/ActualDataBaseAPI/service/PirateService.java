package com.example.ActualDataBaseAPI.service;

import com.example.ActualDataBaseAPI.dao.PirateDao;
import com.example.ActualDataBaseAPI.model.Pirate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PirateService {

    private final PirateDao pirateDao;

    @Autowired
    public PirateService(@Qualifier("fakeDao") PirateDao pirateDao) {
        this.pirateDao = pirateDao;
    }

    public int addPirate(Pirate pirate){
        return pirateDao.insertPirate( pirate);
    }
}
