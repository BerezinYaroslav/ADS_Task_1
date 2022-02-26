package ru.cs.vsu.berezin_y_a.TrafficLights;

import ru.cs.vsu.berezin_y_a.TrafficLightState;

public class PedestrianTrafficLight {

    private TrafficLightState state;

    public PedestrianTrafficLight(TrafficLightState state) {
        this.state = state;
    }

    public void changeColor() {
        switch (this.state) {
            case RED -> this.state = TrafficLightState.GREEN;
            case GREEN -> this.state = TrafficLightState.RED;
        }
    }

    public TrafficLightState getState() {
        return state;
    }

}
