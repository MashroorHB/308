public class Imposter implements iImposter{
    private String name;

    public Imposter(String name){
        this.name = name;
        System.out.println("There's an imposter among us.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void poison(Crewmate crewmate) {
        System.out.println(crewmate.getName()+" has been poisoned.");
    }

    @Override
    public void damage() {
        System.out.println("Damage caused by unknown living body.");
    }

    @Override
    public void study() {
        System.out.println("I'm obviously not pretending to study intergalactic objects.");
    }

    @Override
    public void maintain() {
        System.out.println("I'm obviously trying to maintain this spaceship.");
    }
}
