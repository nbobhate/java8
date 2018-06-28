package io.github.nbobhate.patterns.structural.bridge;

import org.junit.Test;

public class BridgeTest {

    @Test
    public void test() {
        TV sonyTV = new SonyTV();
        TV philipsTV = new PhilipsTV();

        RemoteControl sonyRemote = new SonyRemoteControl(new SonyTV());
        RemoteControl philipsRemote = new PhilipsRemoteControl(new PhilipsTV());

        // todo
    }
}
