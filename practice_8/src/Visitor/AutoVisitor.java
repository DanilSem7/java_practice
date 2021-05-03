package Visitor;

public class AutoVisitor implements Visitor{
    @Override
    public void visit(Car car) {
        System.out.println("A car 'model:  "+car.getModelTitle());
    }
    @Override
    public void visit(Track track) {
        System.out.println("A truck 'model: "+track.getModelTitle());
    }
}