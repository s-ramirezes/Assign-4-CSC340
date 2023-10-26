package com.CSC340SRE.crudAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GamesContoller {
    @Autowired
    GamesService gamesService;

    @GetMapping("/all")
    public String getAllGames(Model model){
        model.addAttribute("gameList",
                gamesService.getAllGames());
        return ""
    }
}
