package Problem_5;

public class Meter_to_Mile_Feet_Inch {
    public double meter;

    public Meter_to_Mile_Feet_Inch(double m) {
        meter = m;
    }
    public double convertTo_Mile() {
        return meter * Constants.meter_to_mile;
    }
    public double convertTo_Feet() {
        return meter * Constants.meter_to_feet;
    }
    public double convertTo_Inch() {
        return meter * Constants.meter_to_inch;
    }
}