package ru.cs.vsu.berezin_y_a.Visual;

import ru.cs.vsu.berezin_y_a.TrafficLights.PedestrianTrafficLight;

import javax.swing.*;
import java.awt.*;

public class PedestrianVisualPainter extends JFrame {

    PedestrianTrafficLight pedestrianTrafficLight;

    public PedestrianVisualPainter(PedestrianTrafficLight pedestrianTrafficLight) {
        this.pedestrianTrafficLight = pedestrianTrafficLight;
        setTitle("Traffic Light");
        setSize(400, 550);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.gray);
        g2d.fillRoundRect(100, 100, 200, 350, 20, 20);
        g2d.drawRoundRect(100, 100, 200, 350, 20, 20);
        g2d.drawOval(100, 100, 150, 150);
        g2d.drawOval(100, 300, 150, 150);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(150, 150, 100, 100);
        g2d.fillOval(150, 300, 100, 100);

        changeVisualColor(g2d, pedestrianTrafficLight);

    }

    public void changeVisualColor(Graphics2D g2d, PedestrianTrafficLight pedestrianTrafficLight) {
        switch (pedestrianTrafficLight.getState()){
            case GREEN -> {
                g2d.setColor(Color.GREEN);
                g2d.fillOval(150, 300, 100, 100);
            }
            case RED -> {
                g2d.setColor(Color.RED);
                g2d.fillOval(150, 150, 100, 100);
            }
        }
    }

}
