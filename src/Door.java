public class Door {
    private String color;
    private Dimensions dims;

    public Door(String color, Dimensions dims) {
        this.color = color;
        this.dims = dims;
    }
    public void open_door()
    {
        System.out.println("The door is opened ,you are welcome to my house haha...");
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDims() {
        return dims;
    }
}
