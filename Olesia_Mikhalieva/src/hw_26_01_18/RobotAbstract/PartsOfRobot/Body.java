package hw_02_02_18.RobotAbstract.PartsOfRobot;

import java.util.Objects;

public class Body {
    boolean exist;

    public Body(boolean exist) {
        this.exist = exist;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return exist == body.exist;
    }

    @Override
    public int hashCode() {

        return Objects.hash(exist);
    }

    @Override
    public String toString() {
        return "Body{" +
                "exist=" + exist +
                '}';
    }
}
