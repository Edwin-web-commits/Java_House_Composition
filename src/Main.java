public class Main {
    static public void main(String[] args)
    {   Dimensions dims=new Dimensions(4,5,0);

        Windows winds=new Windows("2019m",dims);
        Roof roof= new Roof(12,dims);
        Door door = new Door("Brown",new Dimensions(1,3,2));
        Bed bed=new Bed("Grey","Double bed Queen",new Dimensions(4,5,6));
        Wadrobe wadrobe=new Wadrobe("wall wadrobe","brown",new Dimensions(2,4,2));

        House house=new House(winds,roof,door);
        house.program();
        house.assembled_house();
        house.welcome();
    }
}
