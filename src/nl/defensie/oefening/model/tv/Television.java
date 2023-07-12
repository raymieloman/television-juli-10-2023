package nl.defensie.oefening.model.tv;

public interface Television {
    // interface methods are always 'public abstract'

    void on();
    void off();
    boolean switchChannel(int newChannel);
    int getCurrentChannel();
}
