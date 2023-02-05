package collections;

import java.util.Objects;
import java.util.Random;

public class Ball implements Comparable<Ball> {

    private final int size;

    public Ball(int size) {
        this.size = size;
    }

    public Ball() {
        Random random = new Random();
        this.size = random.nextInt(6) + 5;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return getSize() == ball.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public int compareTo(Ball ball) {
        return Integer.compare(size, ball.size);
    }
}

