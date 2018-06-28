package io.github.nbobhate.patterns.structural.bridge;

public class SonyRemoteControl extends RemoteControl {

    private int currentChannel;

    public SonyRemoteControl(TV tvImplementer) {
        super(tvImplementer);
    }

    public void nextChannel() {
        currentChannel++;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }
}
