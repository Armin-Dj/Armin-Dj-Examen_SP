import java.util.ArrayList;
import java.util.List;

public class Car {
    List<Panel> list=new ArrayList<Panel>();

    public void addPanel(Panel p){
        this.list.add(p);
    }

    public void StatusCheck(){
        System.out.println("Car has ");
        for (Panel p : list )
        {
            p.get();
        }
    }
}
