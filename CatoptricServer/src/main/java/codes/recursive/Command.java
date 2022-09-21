package codes.recursive;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Command {
    private String motor;
    private String direction;
    private String steps;
    private String row;
    private String column;
    private String surface;

    public String getRow() {
        return row;
    }
    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }
    public void setColumn(String column) {
        this.column = column;
    }

    public String getSurface() {
        return surface;
    }
    public void setsurface(String surface) {
        this.surface = surface;
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
