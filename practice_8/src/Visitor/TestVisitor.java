package Visitor;
import java.util.ArrayList;
public class TestVisitor {
    public static void main(String[] args) {
        ArrayList<Auto> arr = new ArrayList();
        arr.add(new Car("Tesla"));
        arr.add(new Track("Ford"));
        arr.add(new Car("Mercedes"));
        arr.add(new Track("Opel"));
        Visitor visitor = (Visitor) new AutoVisitor();
        for(Auto a:arr){
            a.Accept(visitor);
        }
    }
}
