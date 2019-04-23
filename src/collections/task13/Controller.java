package collections.task13;

import java.util.*;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new LinkedList<>();
//    private ListIterator<Event> iterator = eventList.listIterator();
//    private Event e = new Event(1000) {
//        @Override
//        public void action() {
//
//        }
//    };

    public void addEvent(Event c) {
        eventList.add(c);
    }

//    public Iterator iterator() {
//        return eventList.iterator();
//    }

    public void run() {
//        while (iterator.hasNext())
//
//            iterator.next();
//        if (e.ready()) {
//            System.out.println(e);
//            e.action();
//            eventList.remove(e);
//        }

        LinkedList<Event> eventListCopy = new LinkedList<>(eventList);
        ListIterator<Event> it = eventListCopy.listIterator();
        while (it.hasNext()){
            it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }
}
