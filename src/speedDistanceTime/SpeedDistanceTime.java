package speedDistanceTime;

public class SpeedDistanceTime {
    int Speed = 10;
    int Time = 3;
    public static void main(String[] args) {
        SpeedDistanceTime objDist = new SpeedDistanceTime();
        int DistanceCalc= objDist.Distance(20);
        System.out.println("Distance in "+DistanceCalc+" km");

        DistanceSpeed objTime = new DistanceSpeed();
        int TimeCalc = objTime.Time(3);
        System.out.println("Time consumed to travel "+TimeCalc+" hours");

    }

    public int Distance(int S)
    {
        int Distance = Speed/Time;
        return Distance;
    }
}
