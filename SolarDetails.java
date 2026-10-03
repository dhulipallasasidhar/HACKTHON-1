public class SolarDetails {
    public static void main(String[] args) {
        int panelId = 101;
        double energyGenerated = 15.5; // in kWh
        int numberOfPanels = 8;
        char systemStatus = 'A'; // 'A' for Active

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}