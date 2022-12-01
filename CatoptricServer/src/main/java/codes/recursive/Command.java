package codes.recursive;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Command {
    private int motor;
    private int steps;
    private int row;
    private int column;
    private int surface;

    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }

    public int getSurface() {
        return surface;
    }
    public void setsurface(int surface) {
        this.surface = surface;
    }

    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getSteps() {
        return steps;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }

}
