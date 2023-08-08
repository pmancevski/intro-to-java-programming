package Exercise20_03;

public class State {
    private int row;
    private String state;

    private int column;
    private String capitol;

    public State(int row, String state, int column, String capitol) {
        this.row = row;
        this.state = state;
        this.column = column;
        this.capitol = capitol;
    }

    public int getRow() {
        return row;
    }

    public String getState() {
        return state;
    }

    public int getColumn() {
        return column;
    }

    public String getCapitol() {
        return capitol;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setCapitol(String capitol) {
        this.capitol = capitol;
    }

    @Override
    public String toString() {
        return "State{" +
                "state='" + state + '\'' +
                ", capitol='" + capitol + '\'' +
                '}';
    }
}
