package com.lab.lab6;

import com.lab.utils.InputUtils;

public class Flat implements InputOutput {
    private int flatNumber;
    private double totalArea;
    private int numberOfRooms;
    private Room[] rooms;

    public Flat() {
        this.flatNumber = 0;
        this.totalArea = 0;
        this.numberOfRooms = 0;
        this.rooms = new Room[numberOfRooms];
    }

    @Override
    public void input() {
        flatNumber = (int) InputUtils.getInputDouble(false, true, "Enter flat number");
        totalArea = InputUtils.getInputDouble(false, true, "Enter total area");
        numberOfRooms = (int) InputUtils.getInputDouble(false, true, "Enter number of rooms");
        System.out.println();
        rooms = new Room[numberOfRooms];

        for (int i = 0; i < this.numberOfRooms; i++) {
            System.out.println("Enter data for room " + (i + 1));
            this.rooms[i] = new Room();
            this.rooms[i].input();
        }
    }

    @Override
    public void output() {
        System.out.println("Flat number: " + flatNumber);
        System.out.println("Total flat area: " + totalArea);
        System.out.println("Number of rooms: " + numberOfRooms + "\n");
        for (int i = 0; i < numberOfRooms; i++) {
            System.out.println("Room data " + (i + 1) + ":");
            rooms[i].output();
            System.out.println();
        }
    }

    public double calculateNonResidentialAreaPercentage() {
        double residentialArea = 0.0;
        for (Room room : rooms) {
            if (room.getPurpose().equalsIgnoreCase("residential")) {
                residentialArea += room.getArea();
            }
        }
        double nonResidentialArea = totalArea - residentialArea;
        return (nonResidentialArea / totalArea) * 100;
    }

    public String findRoomsByArea(double area) {
        for (Room room : rooms) {
            if (room.getArea() == area) {
                return "Rooms with area " + area + ": " + room.getPurpose();
            }
        }
        return "No rooms with area " + area;
    }
}
