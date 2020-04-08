package com.stan.delegete;

import java.util.HashMap;
import java.util.Map;

/**
 * 委派者
 */
public class Leader {
    Map<String, ITarget> targets = new HashMap<>();

    Leader(){
        targets.put("encrypt", new TargetA());
        targets.put("sell", new TargetB());
    }

    void dispatch(String command){
        this.targets.get(command).doWork();
    }
}
