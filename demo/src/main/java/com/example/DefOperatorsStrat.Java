package com.example;

import java.util.Arrays;
import java.util.List;

public class DefOperatorsStrat {
    private List<String> operators;
    private List<String> strats;

    public void DefOperators() {
        operators = Arrays.asList(
            "Sentry", "Tubarao", "Fenrir", "Solis", "Azami", "Thorn",
            "Thunderbird", "Aruni", "Melusi", "Oryx", "Wamai", "Goyo", "Warden",
            "Mozzie", "Kaid", "Clash", "Maestro", "Alibi", "Vigil", "Ela",
            "Lesion", "Mira", "Echo", "Caveira", "Valkyrie", "Frost", "Mute",
            "Smoke", "Castle", "Pulse", "Doc", "Rook", "Jager", "Bandit", "Tachanka",
            "Kapkan"
        );
    }

    public void DefStrat() {
        strats = Arrays.asList(
            "Anchor - Stay on site and defend", "Roam - Move around the map to flank attackers",
            "Spawn Peek - Peek at attackers from spawn points", "Trade Kills - Ensure a teammate is ready to trade kills",
            "Use Utilities - Properly use gadgets and abilities", "Hold Angles - Stay in a position and wait for attackers"
        );
    }

    public List<String> getDefOperators() {
        return operators;
    }

    public List<String> getDefStrat() {
        return strats;
    }
}
