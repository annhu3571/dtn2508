package com.vti.dtn2508.bt10;

public class Car {

    private String name;
    private String property;

    public Car(String name, String property) {
        this.name = name;
        this.property = property;
    }

    public class Engine {
        private String engineType;

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }
}
