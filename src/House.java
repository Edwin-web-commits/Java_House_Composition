public class House {
    private Windows windows;
    private Roof roof;
    private Door door;

    public House(Windows windows, Roof roof, Door door) {
        this.windows = windows;
        this.roof = roof;
        this.door = door;
    }

    public void program()
    {
        System.out.println("Assembling the Room");
    }
    public void assembled_house()
    {  roof.finished_house(); // accessing the method of the Class: Roof ,indirectly from House Class but using Roof object.
        windows.open_window(); // accessing the method of the Class: Windows ,indirectly from House Class but using Windows object.

    }
    public void welcome()
    {   lock();
        door.open_door(); // accessing the method of the Class: Door ,indirectly from House Class but using Door object.
    }
    private void lock()
    {
        System.out.println("Your house key is number BB21");
    }
    //Since getter are just there to check if the rigth data is put ,we can just ignore them..we dont really need them
    /*
    public Windows getWindows() {
        return windows;
    }

    public Roof getRoof() {
        return roof;
    }

    public Door getDoor() {
        return door;
    }

     */
}
