package trafficlight.gui;

import trafficlight.Observer;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //DONE

    @Override
    public void update(){
        turnOn(!isOn());
    }
}
