package ru.cs.vsu.berezin_y_a;

public class TrafficLight {

    public TrafficLightState state;
    public TrafficLightType type;
    public int delay;

    public TrafficLight(TrafficLightState state, TrafficLightType type, int delay) {
        this.state = state;
        this.type = type;
        this.delay = delay;
    }

    public void changeColor(TrafficLight trafficLight, int delay) throws InterruptedException {
        Thread.sleep(delay);
        switch (trafficLight.state) {
            case RED -> trafficLight.state = TrafficLightState.YELLOW_BEFORE_GREEN;
            case YELLOW_BEFORE_GREEN -> trafficLight.state = TrafficLightState.GREEN;
            case GREEN -> trafficLight.state = TrafficLightState.YELLOW_BEFORE_RED;
            case YELLOW_BEFORE_RED -> trafficLight.state = TrafficLightState.RED;
        }
    }

}
