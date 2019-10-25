public class Roof {
    private int No_ofZincks;
    private Dimensions dims;

    public Roof(int no_ofZincks, Dimensions dims) {
        No_ofZincks = no_ofZincks;
        this.dims = dims;
    }
    public void finished_house()
    {
        System.out.print("Your house is finished");

    }

    public int getNo_ofZincks() {
        return No_ofZincks;
    }

    public Dimensions getDims() {
        return dims;
    }
}
