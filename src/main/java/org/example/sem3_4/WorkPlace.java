package org.example.sem3_4;

public class WorkPlace <T extends Person>{
    private T[] community;

    public WorkPlace(T[] community) {
        this.community = community;
    }

    public void workForAll() {
        for (T person: community) {
            person.doWork();
        }
    }
}
