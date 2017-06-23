package monitor.agent;

import java.lang.instrument.Instrumentation;
// monitor.agent.MyAgent
public class MyAgent {
	
    public static void premain(String agentArgs, Instrumentation inst){  
        System.out.println("premain-1."+agentArgs);  
      inst.addTransformer(new MonitorTransformer());  
    }  
}
