package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;


    public String getCatchPhrase() {
        return String.format("Hey, my name is %s!", this.name());
    }

    public boolean isAlice() {
        return this.equals(ALICE);
    }
    public boolean isBob() {
        return this.equals(BOB);
    }

}
