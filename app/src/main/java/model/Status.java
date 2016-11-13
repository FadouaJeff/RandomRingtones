package model;

/**
 * Created by obinn on 11/12/2016.
 */

public enum Status {
    DEFAULT("Default"), RANDOM("Random"), CUSTOM("Static");

    private final String state;

    private Status(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String toString() {
        return state;
    }
}
