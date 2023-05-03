package DriveTrain;

public class AllWheel implements DriveTrain{
    private String driveTrain;
    @Override
    public String getDriveTrain() {
        driveTrain = "All wheel";
        return driveTrain;
    }
}
