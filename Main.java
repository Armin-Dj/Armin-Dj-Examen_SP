public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        Panel p = new Panel();
        c.addPanel(p);
        p.addObject(new Lidar(EnumStatus.WORKING));
        p.addObject(new Camera(EnumStatus.NOT_WORKING));
        p.addObject(new Temperature(EnumStatus.PROTECTION_MODE));
        p.addObject(new Proximity(EnumStatus.WORKING));
        c.StatusCheck();

    }
}
