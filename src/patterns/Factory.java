package patterns;
import org.w3c.dom.Document;

import java.io.File;

public class Factory {
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (object instanceof Document) {
            writer = new ConcreteXmlWriter();
        }
        return writer;
    }
}
abstract class AbstractWriter {
    public abstract void write(Object context);
}

class ConcreteFileWriter extends AbstractWriter {
    public void write (Object context) {
        // method body
    }
}
class ConcreteXmlWriter extends AbstractWriter {
    public void write (Object context) {
        // method body
    }
}