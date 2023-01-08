package ManWardrobe3;

public abstract class Door {
    
    private String name;
    private State state;
        
    public State getState() {
        return this.state;
    }

    public void setState(State newState) {
        this.state = newState;
    }
    
    public Boolean isOpened() {
        return this.state.equals(State.OPENED);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String doorName) {
        name = doorName;
    }
}
