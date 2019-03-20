package com.zipcodewilmington.preassessment2;

class AliceBobEvaluator {
    private String name;

    public AliceBobEvaluator(String name) {
        this.name = name;
    }

    public boolean isAlice() {
        return name.equalsIgnoreCase("Alice");
    }

    public boolean isBob() {
        return name.equalsIgnoreCase("Bob");
    }

}
