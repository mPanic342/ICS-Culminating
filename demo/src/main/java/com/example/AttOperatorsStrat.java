package com.example;

import java.util.Arrays;
import java.util.List;

public class AttOperatorsStrat {
    private List<String> operators;

    public void AttOperators() {
        operators = Arrays.asList(
            "Striker", "Deimos", "Ram", "Brava", "Grim", "Sens",
            "Osa", "Flores", "Zero", "Ace", "Iana", "Kali", "Amaur",
            "Nokk", "Gridlock", "Nomad", "Maverick", "Lion", "Finka", "Dokkaebi",
            "Zofia", "Ying", "Jackal", "Hibana", "Capitao", "Blackbeard", "Buck",
            "Sledge", "Thatcher", "Ash", "Thermite", "Montange", "Twitch", "Blitz", "Iq",
            "Fuze", "Glaz"

        );
    }
    private List<String> strats;

    public void AttStrat() {
        strats = Arrays.asList(
            "Breach - Use breach charges to open walls", "Rush - Quickly move to the objective",
            "Use Drones - Scout areas with drones before moving", "Trade Kills - Ensure a teammate is ready to trade kills",
            "Use Utilities - Properly use gadgets and abilities"
        );
    }

    public List<String> getAttOperators() {
        return operators;
    }

    public void printAttOperators() {
        operators.forEach(System.out::println);
    }

    public List<String> getAttStrat() {
        return strats;
    }

    public void printAttStrat() {
        operators.forEach(System.out::println);
    }
}
