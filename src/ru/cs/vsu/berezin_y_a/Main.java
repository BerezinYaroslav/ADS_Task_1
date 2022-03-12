package ru.cs.vsu.berezin_y_a;

import ru.cs.vsu.berezin_y_a.TrafficLights.DefaultTrafficLight;
import ru.cs.vsu.berezin_y_a.Visual.DefaultVisualPainter;
import ru.cs.vsu.berezin_y_a.TrafficLights.PedestrianTrafficLight;
import ru.cs.vsu.berezin_y_a.Visual.PedestrianVisualPainter;
import ru.cs.vsu.berezin_y_a.TrafficLights.AdditionalTrafficLight;
import ru.cs.vsu.berezin_y_a.Visual.AdditionalVisualPainter;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();

        System.out.println("Choosing the type of Traffic Light:");
        System.out.println("1 - Default;");
        System.out.println("2 - For People;");
        System.out.println("3 - Additional.");
        System.out.print("Enter the number: ");

        int type = readNum();

        switch (type) {
            case 1: {
                DefaultTrafficLight defaultTrafficLight = new DefaultTrafficLight(TrafficLightState.RED);
                DefaultVisualPainter defaultVisualPainter = new DefaultVisualPainter(defaultTrafficLight);

                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        defaultTrafficLight.changeColor();
                        defaultVisualPainter.repaint();
                    }
                }, 2*1000, 2*1000);
                break;
            }

            case 2: {
                PedestrianTrafficLight pedestrianTrafficLight = new PedestrianTrafficLight(TrafficLightState.RED);
                PedestrianVisualPainter pedestrianVisualPainter = new PedestrianVisualPainter(pedestrianTrafficLight);

                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        pedestrianTrafficLight.changeColor();
                        pedestrianVisualPainter.repaint();
                    }
                }, 2*1000, 2*1000);
                break;
            }

            case 3: {
                AdditionalTrafficLight additionalTrafficLight = new AdditionalTrafficLight(TrafficLightState.RED);
                AdditionalVisualPainter additionalVisualPainter = new AdditionalVisualPainter(additionalTrafficLight);

                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        additionalTrafficLight.changeColor();
                        additionalVisualPainter.repaint();
                    }
                }, 2*1000, 2*1000);
                break;
            }

            default: System.out.println("Invalid number entered, try again.");
        }

    }

    private static int readNum() {
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt());
    }

}
