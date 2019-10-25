public class Bed {
    private String color;
    private String model;
    private Dimensions dims;

    public Bed(String color, String model, Dimensions dims) {
        this.color = color;
        this.model = model;
        this.dims = dims;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDims() {
        return dims;
    }
}
