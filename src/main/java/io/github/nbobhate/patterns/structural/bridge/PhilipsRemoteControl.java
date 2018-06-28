package io.github.nbobhate.patterns.structural.bridge;

public class PhilipsRemoteControl extends RemoteControl {

    public PhilipsRemoteControl(TV tvImplementer) {
        super(tvImplementer);
    }
}
