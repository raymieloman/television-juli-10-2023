package nl.defensie.oefening.model.tv;

public class Philips implements Television {

    boolean isOn;
    int currentChannel;


    public void on() {
        System.out.println("Philips switching on");
        this.isOn = true;
        currentChannel = 1;
    }

    public void off() {
        System.out.println("Philips switching off");
        this.isOn = false;
        this.currentChannel = 0;
    }

    public boolean switchChannel(int newChannel) {
        int oldChannel = currentChannel;
        this.currentChannel = newChannel;

        return oldChannel != newChannel;
    }

    public int getCurrentChannel() {
       return this.currentChannel;
    }
}
