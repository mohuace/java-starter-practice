package org.mohit.inheritanceVsAgg;

public class AggManager implements Role {

    @Override
    public String performDuties() {
        return "Performing role of a manager";
    }
}
