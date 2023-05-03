public class CrewmateAdapter implements iCrewmate{
    Imposter imposter;

    public CrewmateAdapter(Imposter imposter){
        this.imposter = imposter;
    }

    public void poison(Crewmate crewmate){
        imposter.poison(crewmate);
    }

    public void damage(){
        imposter.damage();
    }

    @Override
    public void study() {
        imposter.study();
    }

    @Override
    public void maintain() {
        imposter.maintain();
    }


}
