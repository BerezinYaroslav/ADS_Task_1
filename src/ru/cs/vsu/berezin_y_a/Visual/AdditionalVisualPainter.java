package ru.cs.vsu.berezin_y_a.Visual;

import ru.cs.vsu.berezin_y_a.TrafficLights.AdditionalTrafficLight;

import javax.swing.*;
import java.awt.*;

public class AdditionalVisualPainter extends JFrame {

    AdditionalTrafficLight additionalTrafficLight;

    public AdditionalVisualPainter(AdditionalTrafficLight additionalTrafficLight) {
        this.additionalTrafficLight = additionalTrafficLight;
        setTitle("Traffic Light");
        setSize(600, 700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.gray);
        g2d.fillRoundRect(100, 100, 200, 500, 20, 20);
        g2d.fillRoundRect(300, 400, 200, 200, 20, 20);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(150, 150, 100, 100);
        g2d.fillOval(150, 300, 100, 100);
        g2d.fillOval(150, 450, 100, 100);
        g2d.fillOval(350, 450, 100, 100);

        changeVisualColor(g2d, additionalTrafficLight);

    }

    public void changeVisualColor(Graphics2D g2d, AdditionalTrafficLight additionalTrafficLight) {
        switch (additionalTrafficLight.getState()){
            case GREEN -> {
                g2d.setColor(Color.GREEN);
                g2d.fillOval(150, 450, 100, 100);
            }
            case RED -> {
                g2d.setColor(Color.RED);
                g2d.fillOval(150, 150, 100, 100);
                g2d.setColor(Color.GREEN);
                g2d.fillOval(350, 450, 100, 100);
            }
            default -> {
                g2d.setColor(Color.YELLOW);
                g2d.fillOval(150, 300, 100, 100);
            }
        }
    }

}
