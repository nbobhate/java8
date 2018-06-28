package io.github.nbobhate.patterns.structural.bridge;

public abstract class RemoteControl {

    protected TV tvImplementer;

    public RemoteControl(TV tvImplementer) {
        this.tvImplementer = tvImplementer;
    }

    public void on() {
        tvImplementer.on();
    }

    public void off() {
        tvImplementer.off();
    }

    public void setChannel(int channel) {
        tvImplementer.tuneChannel(channel);
    }
}
