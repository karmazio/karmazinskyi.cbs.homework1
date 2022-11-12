package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.Quest;
import org.example.quests.Dungeon;

@Getter
@Setter
@AllArgsConstructor
public class Knight {
    private String name;
    private Quest quest;

    public Knight() {
    }

    public void doQuest() {
        System.out.println("Knight named " + name + quest.accomplish() + "\n------------");
    }

}
