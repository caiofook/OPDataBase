package com.example.ActualDataBaseAPI.dao;

import com.example.ActualDataBaseAPI.model.Pirate;

import java.util.UUID;

/*aqui implementamos as regras que deverão ser seguidas por aqueles que desejarem implementar a classe "pirate"
*/
public interface PirateDao {

    int insertPirate (UUID id, Pirate pirate);

    default int insertPirate(Pirate pirate) {
       UUID id = UUID.randomUUID();
       return insertPirate(id, pirate);
    }
}
