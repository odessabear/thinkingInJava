package interfaces.task11;

import interfaces.subinterface.Processor;

public class ProcessorImpl implements Processor {
    private ChangePosition changer;

     ProcessorImpl(ChangePosition changer) {
        this.changer = changer;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return changer.process(input);
    }
}
