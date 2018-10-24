package patterns;

public abstract class AbstractFactory {
    public abstract Mage createMage();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
 interface Mage {
    public void cast();
}
 interface Archer {
    public void shoot();
}
 interface Warrior {
    public void attack();
}
class ElfSquadronFactory extends AbstractFactory {
    public Mage createMage() {
        return new ElfMage();
    }
    public Archer createArcher() {
        return new ElfArcher();
    }
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
 class ElfMage implements Mage {
    public void cast() {
        // использовать магию эльфов
    }
}
 class ElfArcher implements Archer {
    public void shoot() {
        // использовать лук эльфов
    }
}
 class ElfWarrior implements Warrior {
    public void attack() {
        // использовать меч эльфов
    }
}
class main{
    public void createSquadron (AbstractFactory factory){
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
    }
}

