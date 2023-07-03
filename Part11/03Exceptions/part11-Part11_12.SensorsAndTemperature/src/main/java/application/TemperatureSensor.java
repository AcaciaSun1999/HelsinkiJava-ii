


package application;
import java.util.Random;
public class TemperatureSensor implements Sensor{

    private boolean on;
    public TemperatureSensor(){
        this.on = false;
    }

    public boolean isOn(){
        return on;
    }
    public void setOff(){
        this.on = false;
    }
    public void setOn(){
        this.on = true;
    }
    public int read(){
        if(on){
            int num = new Random().nextInt(61);
            return num - 30;
        } else {
             throw new IllegalStateException("The sensor is close");
        }
    }

}