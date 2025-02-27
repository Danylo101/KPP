package com.lab.lab10;

class PostalDispatch {
    private final String name;
    private final double weight;
    private final double distance;
    private final double cost;

    public PostalDispatch(String name, double weight, double distance, double cost) {
        this.name = name;
        this.weight = weight;
        this.distance = distance;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "PostalDispatch{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", distance=" + distance +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + Double.hashCode(weight);
        result = 31 * result + Double.hashCode(distance);
        result = 31 * result + Double.hashCode(cost);
        return result;
    }
}
