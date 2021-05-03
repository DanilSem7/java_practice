package Visitor;

public class Car extends Auto {
    public Car(String modelTitle) {
        super(modelTitle);
    }
    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}