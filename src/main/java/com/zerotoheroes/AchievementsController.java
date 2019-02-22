package com.zerotoheroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class AchievementsController {

    @Autowired
    AchievementStatService service;

    @RequestMapping(path = "/achievementstats",
            value = "/achievementstats",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            method = RequestMethod.POST)
    @ResponseBody
    public AchievementStat addAchievementStat(@RequestBody AchievementStat achievementStat) {
        service.createAchievementStat(achievementStat);
        return achievementStat;
    }
}
