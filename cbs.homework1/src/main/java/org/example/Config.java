package org.example;

import org.example.entity.Knight;
import org.example.interfaces.Quest;
import org.example.quests.Dungeon;
import org.example.quests.Escort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Dungeon dungeon() {
        return new Dungeon();
    }

    @Bean
    public Escort escort() {
        return new Escort();
    }

    @Bean
    public Knight pablo(Dungeon dungeon) {
        return new Knight("Pablo", dungeon);
    }

    @Bean
    public Knight juan(Escort escort) {
        return new Knight("Juan", escort);
    }
}
