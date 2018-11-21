package polymorphism;

class Switch{
    public void switcher(){}
}

class MoveForward extends Switch{
    @Override
    public void switcher() {
        System.out.println("Starship moves forward!");
    }
}

class MoveBack extends Switch{
    @Override
    public void switcher() {
        System.out.println("Starship moves back!");
    }
}

class Stoped extends Switch{
    @Override
    public void switcher() {
        System.out.println("Starship is stoped");
    }
}

class AlertStatus{
    private Switch aSwitch = new Stoped();
    public void moveForward(){
        aSwitch = new MoveForward();
    }
    public void moveBack(){
        aSwitch = new MoveBack();
    }

    public void stopping(){
        aSwitch = new Stoped();
    }

    public void alertStatus(){
        aSwitch.switcher();
    }
}
public class Starship {
    public static void main(String[] args) {

        AlertStatus status = new AlertStatus();
        status.alertStatus();
        status.moveBack();
        status.alertStatus();
        status.moveForward();
        status.alertStatus();
        status.stopping();
        status.alertStatus();

    }
}
