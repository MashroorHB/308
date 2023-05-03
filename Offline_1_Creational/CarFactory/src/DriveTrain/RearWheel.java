package DriveTrain;

public class RearWheel implements DriveTrain{
    private String driveTrain;
    @Override
    public String getDriveTrain() {
        driveTrain = "Rear wheel";
        return driveTrain;
    }
}
