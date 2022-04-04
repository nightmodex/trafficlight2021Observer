import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MCPTest {

    TrafficLightCtrl trafficLightCtrl = TrafficLightCtrl.getInstance();
    //Singleton Test with Reflection
    @BeforeEach
    public void resetSingleton() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field instance = TrafficLightCtrl.class.getDeclaredField("trafficLightCtrl");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    @Test
    public void singletonResetTest() throws NoSuchFieldException, IllegalAccessException {
        resetSingleton();
    }

    @Test
    public void StateTestRed(){
        String actual = trafficLightCtrl.getRedState().getColor();
        String expected = "red";
        assertEquals(expected, actual);
    }

    @Test
    public void StateTestGreen(){
        String actual = trafficLightCtrl.getGreenState().getColor();
        String expected = "green";
        assertEquals(expected, actual);
    }

    @Test
    public void StateTestYellow(){
        String actual = trafficLightCtrl.getYellowState().getColor();
        String expected = "yellow";
        assertEquals(expected, actual);
    }
}