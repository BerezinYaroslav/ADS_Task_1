package ru.cs.vsu.berezin_y_a;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TrafficLight trafficLight = new TrafficLight(TrafficLightState.RED, TrafficLightType.DEFAULT, 2000);
        VisualPainter visualPainter = new VisualPainter(trafficLight);

        while (true) {
            trafficLight.changeColor(trafficLight, trafficLight.delay);
            visualPainter.repaint();
        }

    }

}
