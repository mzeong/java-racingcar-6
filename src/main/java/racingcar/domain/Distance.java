package racingcar.domain;

public class Distance implements Comparable<Distance> {
    private static final String DASH = "-";
    private static final int START_DISTANCE = 0;
    private static final int FORWARD_DISTANCE = 1;
    private int distance = START_DISTANCE;

    public void increase() {
        distance += FORWARD_DISTANCE;
    }

    @Override
    public String toString() {
        return DASH.repeat(distance);
    }

    @Override
    public int compareTo(Distance o) {
        return Integer.compare(this.distance, o.distance);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Distance o) {
            return this.distance == o.distance;
        }
        return false;
    }
}
