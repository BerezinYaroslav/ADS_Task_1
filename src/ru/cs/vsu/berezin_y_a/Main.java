package ru.cs.vsu.berezin_y_a;

import ru.cs.vsu.berezin_y_a.TrafficLights.DefaultTrafficLight;
import ru.cs.vsu.berezin_y_a.Visual.DefaultVisualPainter;
import ru.cs.vsu.berezin_y_a.TrafficLights.PedestrianTrafficLight;
import ru.cs.vsu.berezin_y_a.Visual.PedestrianVisualPainter;
import ru.cs.vsu.berezin_y_a.TrafficLights.AdditionalTrafficLight;
import ru.cs.vsu.berezin_y_a.Visual.AdditionalVisualPainter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();

//        DefaultTrafficLight defaultTrafficLight = new DefaultTrafficLight(TrafficLightState.RED);
//        DefaultVisualPainter defaultVisualPainter = new DefaultVisualPainter(defaultTrafficLight);

//        PedestrianTrafficLight pedestrianTrafficLight = new PedestrianTrafficLight(TrafficLightState.RED);
//        PedestrianVisualPainter pedestrianVisualPainter = new PedestrianVisualPainter(pedestrianTrafficLight);

//        AdditionalTrafficLight additionalTrafficLight = new AdditionalTrafficLight(TrafficLightState.RED);
//        AdditionalVisualPainter additionalVisualPainter = new AdditionalVisualPainter(additionalTrafficLight);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

//                defaultTrafficLight.changeColor();
//                defaultVisualPainter.repaint();

//                pedestrianTrafficLight.changeColor();
//                pedestrianVisualPainter.repaint();

//                additionalTrafficLight.changeColor();
//                additionalVisualPainter.repaint();

            }
        }, 2*1000, 2*1000);

    }

    // TODO: 26.02.2022: timer, different types (classes, not enum)

}
