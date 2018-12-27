package interfaces.task14;

public class TestMain {
    static void swimImpl(Swimmer s) {
        s.openWaterSwim();
        s.swim();
    }

    static void runnerImpl(Runner r) {
        r.runLongWay();
        r.runShortWay();
    }

    static void jumperImpl(Jumper j) {
        j.highJumper();
        j.longJumper();
    }

    static void allRounderImpl(AllRounder a) {
        a.complexExercise();
    }

    public static void main(String[] args) {
        OneSportsman sportsman = new OneSportsman();
        swimImpl(sportsman);
        runnerImpl(sportsman);
        jumperImpl(sportsman);
        allRounderImpl(sportsman);
    }
}
