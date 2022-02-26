package ru.cs.vsu.berezin_y_a.TrafficLights;

import ru.cs.vsu.berezin_y_a.TrafficLightState;

public class AdditionalTrafficLight {

    private TrafficLightState state;

    public AdditionalTrafficLight(TrafficLightState state) {
        this.state = state;
    }

    public void changeColor() {
        switch (this.state) {
            case RED -> this.state = TrafficLightState.YELLOW_BEFORE_GREEN;
            case YELLOW_BEFORE_RED -> this.state = TrafficLightState.RED;
            case YELLOW_BEFORE_GREEN -> this.state = TrafficLightState.GREEN;
            case GREEN -> this.state = TrafficLightState.YELLOW_BEFORE_RED;
        }
    }

    public TrafficLightState getState() {
        return state;
    }

}
