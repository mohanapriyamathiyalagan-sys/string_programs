package speedDistanceTime;

public class DistanceSpeed {

    public int Time(int Speed) {
        SpeedDistanceTime objDistance = new SpeedDistanceTime();
        int Distance = objDistance.Distance(Speed);
        int Time = Speed * Distance;
        return Time;
    }
}