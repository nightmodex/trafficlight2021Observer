import trafficlight.ctrl.TrafficLightCtrl;

//https://github.com/nightmodex/trafficlight2021Observer.git

public class MCP {
    public static void main(String[] args) {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.run();
    }
}