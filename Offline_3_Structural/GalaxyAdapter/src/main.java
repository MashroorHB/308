public class main {
    public static void main(String[] args) {
        iCrewmate a1 = new Crewmate("crew1");
        iCrewmate a2 = new CrewmateAdapter(new Imposter("crew2"));
        iCrewmate a3 = new Crewmate("crew3");
        iCrewmate a4 = new CrewmateAdapter(new Imposter("crew4"));
        iCrewmate a5 = new CrewmateAdapter(new Imposter("crew5"));

        a1.study();
        a1.maintain();

        a2.study();
        a2.maintain();
        ((CrewmateAdapter) a2).damage();
        ((CrewmateAdapter) a2).poison((Crewmate) a1);

        a3.study();
        a3.maintain();

        a4.study();
        a4.maintain();
        ((CrewmateAdapter) a4).damage();

        a5.study();
        a5.maintain();
        ((CrewmateAdapter) a5).poison((Crewmate) a3);

    }
}
