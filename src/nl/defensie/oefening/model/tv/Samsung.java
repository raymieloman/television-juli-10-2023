package nl.defensie.oefening.model.tv;

public class Samsung implements Television {

    boolean isOn;
    int currentChannel;

    public void on() {
        System.out.println("Samsung switching on");
        this.isOn = true;
        currentChannel = 1;
    }

    public void off() {
        this.isOn = false;
        System.out.println("Samsung switching off");
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
