package collections.task13;

public class GreenhouseController {
    public static void main(String[] args) {
        //GreenhouseControls gc = new GreenhouseControls();
        WettingClass wc = new WettingClass();
// Instead of hard-wiring, you could parse
// configuration information from a text file here:
        wc.addEvent(wc.new Bell(900));
        Event[] eventList = {
                wc.new ThermostatNight(0),
                wc.new LightOn(200),
                wc.new LightOff(400),
                wc.new WaterOn(600),
                wc.new WaterOff(800),
                wc.new AiringOn(1000),
                wc.new AiringOff(1200),
                wc.new ThermostatDay(1400),
                wc.new WettingOn(1500),
                wc.new WettingOn(1600)

        };
        wc.addEvent(wc.new Restart(2000, eventList));
        if (args.length == 1)
            wc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        wc.run();
    }
}
