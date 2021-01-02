package com.example.ActualDataBaseAPI.dao;

import com.example.ActualDataBaseAPI.model.Pirate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePirateDataAccessService implements PirateDao {

    private static List<Pirate> DB = new ArrayList<>();

    @Override
    public int insertPirate(UUID id, Pirate pirate) {
        DB.add(new Pirate(id, pirate.getName(), pirate.getCrew(), pirate.getReward()));
        return 1;
    }
}
