package ManWardrobe3;

public class VehicleDoor extends Door {
   
    //создаем две двери авто, которые по умолчанию закрыты
    public VehicleDoor(String name) {
        setState(State.CLOSED);
        setName(name);
    }
}