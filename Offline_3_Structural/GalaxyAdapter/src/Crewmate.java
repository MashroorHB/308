public class Crewmate implements iCrewmate{
    private String name;

    public Crewmate(String name){
        this.name = name;
        System.out.println("Welcome on board, "+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println("Studying intergalactic objects.");
    }

    @Override
    public void maintain() {
        System.out.println("Minor bugs in spaceships fixed.");
    }
}
