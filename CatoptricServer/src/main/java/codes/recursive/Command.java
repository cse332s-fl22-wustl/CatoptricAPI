package codes.recursive;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Command {
    private String motor;
    private String direction;
    private String steps;
    private String row;

    public String getRow() {
        return row;
    }
    public void setRow(String row) {
        this.row = row;
    }

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getSteps() {
        return steps;
    }
    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }

}
