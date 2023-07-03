package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    
    private List<Sensor>sensors;
    private List<Integer>readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor sensor){
        this.sensors.add(sensor);
    }

    public boolean isOn(){
        for(Sensor sensor : sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    public void setOn(){
        for(Sensor sensor : sensors){
            sensor.setOn();
        }
    }

    public void setOff(){
        for(Sensor sensor : sensors){
            sensor.setOff();
        }
    }

    public int read(){
        if(!this.isOn() || this.sensors.size() == 0){
            throw new IllegalStateException("Wrong");
        }
        int sum = 0;
        for(Sensor sensor : sensors){
            sum = sum + sensor.read();
        }
        int aveg = sum / this.sensors.size();
        this.readings.add(aveg);
        return aveg;
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}