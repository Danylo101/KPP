package com.lab.lab10;

class ElectroDevice {
    private final String name;
    private final double current;
    private final double voltage;

    public ElectroDevice(String name, double current, double voltage) {
        this.name = name;
        this.current = current;
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "ElectroDevice{" +
                "name='" + name + '\'' +
                ", current=" + current +
                ", voltage=" + voltage +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + Double.hashCode(current);
        result = 31 * result + Double.hashCode(voltage);
        return result;
    }
}
