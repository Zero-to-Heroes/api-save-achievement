package com.zerotoheroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchievementStatService {

    private AchievementStatRepository repository;

    @Autowired
    public AchievementStatService(AchievementStatRepository repository) {
        this.repository = repository;
    }

    public void createAchievementStat(AchievementStat achievementStat) {
//        context.getLogger().log("Doing stuff in service");
        System.out.println("Doing stuff in service");
        repository.saveStat(achievementStat);
    }
}
