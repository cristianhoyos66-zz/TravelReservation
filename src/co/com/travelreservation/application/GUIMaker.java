package co.com.travelreservation.application;

import co.com.travelreservation.person.Person;
import co.com.travelreservation.airplane.AirplaneGUI;

import javax.swing.*;

public class GUIMaker {

  public static void main(String[] args) {
    AirplaneGUI airplaneGUI = new AirplaneGUI("Travel Reservation");
    airplaneGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    airplaneGUI.setResizable(false);
    airplaneGUI.pack();
    airplaneGUI.setLocationRelativeTo(null);
    airplaneGUI.setVisible(true);
  }

}
