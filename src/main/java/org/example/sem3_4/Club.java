package org.example.sem3_4;

public class Club <T extends Person>{
    private T[] community;

    public Club(T[] community) {
        this.community = community;
    }

    public void partyForAll() {
        for (T person: community) {
            person.haveRest();
        }
    }
}
