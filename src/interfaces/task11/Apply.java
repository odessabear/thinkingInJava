package interfaces.task11;

import interfaces.subinterface.Processor;

class Apply {
    static void process(Processor processor, Object o) {
        System.out.println("Using processor " + processor.name());
        System.out.println(processor.process(o));
    }
}
