public class Windows {
    private String model ;
    private Dimensions dims;

    public Windows(String model, Dimensions dims) {
        this.model = model;
        this.dims = dims;
    }
    public void open_window()
    {System.out.println("The window is now opened");
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDims() {
        return dims;
    }
}
