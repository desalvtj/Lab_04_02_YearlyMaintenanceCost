public class Main
{
    public static void main(String[] args)
    {
        double springMaintenanceCost = 512.89;
        double summerMaintenanceCost= 875.73;
        double fallMaintenanceCost = 323.20;
        double winterMaintenanceCost = 120.52;
        double yearlyMaintenanceCost = 0;

        yearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;

        System.out.println("The spring maintenance cost is " + springMaintenanceCost + ", the summer maintenance cost is " + summerMaintenanceCost + ", the fall maintenance cost is " + fallMaintenanceCost + ", and the winter maintenance cost is " + winterMaintenanceCost + ", so the yearly maintenance cost is " + yearlyMaintenanceCost);



    }
}