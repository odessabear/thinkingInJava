package collections.task13;

public class WettingClass extends GreenhouseControls {
    private boolean wetting = false;

    public class WettingOn extends Event {
        public WettingOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            wetting = true;
        }

        public String toString() {
            return "Wetting is on";
        }
    }

    public class WettingOff extends Event {
        public WettingOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            wetting = false;
        }

        public String toString(){
            return "Wetting is off";
        }
    }

}
