package com.CSC340SRE.crudAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    GamesRepo gamesRepo;
    public List<Games> getAllGames(){
        return gamesRepo.findAll();
    }
    public Games getAllGamesById(Integer id){
        return gamesRepo.findById(id).get();
    }

    public Games update(Games games){
        return gamesRepo.save(games);
    }

    public void delete(Integer id){
        gamesRepo.deleteById(id);
    }

    public Games create(Games games){
        return gamesRepo.save(games);
    }
}
