package my.learning.model;

public class Spotrebic {

    private boolean isOn;

    public Spotrebic(){
        this.isOn= false;
    }

    public Spotrebic(boolean isOn){
        this.isOn= isOn;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public void setIsOn(boolean isOn){
        this.isOn= isOn;
    }
}
