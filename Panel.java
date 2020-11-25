import java.util.ArrayList;
import java.util.List;

public class Panel implements Sensor{
    List<Sensor> list=new ArrayList<Sensor>();



    public void addObject(Sensor s){
        this.list.add(s);
    }

    public void get(){
        System.out.println("Panel has ");
        for (Sensor s : list )
        {
            s.get();
        }
    }
}
