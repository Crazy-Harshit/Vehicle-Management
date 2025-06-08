import java.awt.*;
import javax.swing.*;

public class VehicleManagementSystemGUI extends JFrame {
    private JTextArea outputArea;

    public VehicleManagementSystemGUI() {
        setTitle("Vehicle Management System");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        JButton carButton = new JButton("Show Car Details");
        JButton bikeButton = new JButton("Show Bike Details");
        JButton truckButton = new JButton("Show Truck Details");
        buttonPanel.add(carButton);
        buttonPanel.add(bikeButton);
        buttonPanel.add(truckButton);

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        carButton.addActionListener(e -> showCarDetails());
        bikeButton.addActionListener(e -> showBikeDetails());
        truckButton.addActionListener(e -> showTruckDetails());
    }

    private void showCarDetails() {
        Vehicle car = new Car("Toyota", 4);
        StringBuilder sb = new StringBuilder();
        sb.append("Car Details\n");
        sb.append(carStartStopInfo(car));
        outputArea.setText(sb.toString());
    }

    private void showBikeDetails() {
        Vehicle bike = new Bike("Yamaha", true);
        StringBuilder sb = new StringBuilder();
        sb.append("Bike Details\n");
        sb.append(carStartStopInfo(bike));
        outputArea.setText(sb.toString());
    }

    private void showTruckDetails() {
        Vehicle truck = new Truck("Volvo", 18.5);
        StringBuilder sb = new StringBuilder();
        sb.append("Truck Details\n");
        sb.append(carStartStopInfo(truck));
        outputArea.setText(sb.toString());
    }

    // Helper method to capture start, displayInfo, and stop output
    private String carStartStopInfo(Vehicle v) {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream old = System.out;
        System.setOut(ps);
        v.start();
        v.displayInfo();
        v.stop();
        System.out.flush();
        System.setOut(old);
        return baos.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VehicleManagementSystemGUI().setVisible(true);
        });
    }
}
