public class Wadrobe {
    private String model;
    private String color;
    private Dimensions dims;

    public Wadrobe(String model, String color, Dimensions dims) {
        this.model = model;
        this.color = color;
        this.dims = dims;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDims() {
        return dims;
    }
}
