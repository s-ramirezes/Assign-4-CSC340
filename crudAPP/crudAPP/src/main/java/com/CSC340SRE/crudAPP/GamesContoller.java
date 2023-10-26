package com.CSC340SRE.crudAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesContoller {
    @Autowired
    GamesService gamesService;
    @GetMapping("/all")
    public List<Games> getGames(){

        return gamesService.getAllGames();
    }
    @GetMapping("/{id}")
    public Games getGames(@PathVariable Integer id){

        return gamesService.getAllGamesById(id);
    }

    @PostMapping("/store")
    public Games saveGames(@RequestBody Games games){
        return gamesService.create(games);
    }

    @PutMapping("/update")
    public Games updateGames(@RequestBody Games games){
        return gamesService.update(games);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id){
        gamesService.delete(id);
        return("deleted");
    }
}
