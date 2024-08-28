package org.mohit.composition;

public class Car {
    public Engine engine;

//    TODO: ASK - Can you implement composition using a constructor like this? Because if engine is passed to the constructor, it is getting
    //TODO: created somewhere right and the engine is existing separately
    //You can do this but there needs to be some tight coupling of Car and Engine involved, like you can add some methods which are specific to
    //engine over here.
//    public Car(Engine engine) {
//        this.engine = engine;
//    }

    //In composition, the part ceases to exist (or becomes useless) once we remove the whole.
    //So if we remove the Car, the Engine won't exist independently.
    //The other way round don't bother much but can help understand the relationship.
    //For eg we can create Engine obj on our own in main or anywhere else, but it won't make
    //much sense to do that.
    //TODO: But ask about this
    public Car(String engineType, String engineName, int horsePower) {
        engine = new Engine(engineType, engineName, horsePower);
    }

    public String getEngineType() {
        return engine.engineType;
    }

}
