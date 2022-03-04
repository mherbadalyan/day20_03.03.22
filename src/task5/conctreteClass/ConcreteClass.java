package task5.conctreteClass;

import task5.abstractPackedge.AbstractClass;

public class ConcreteClass extends AbstractClass {

    public ConcreteClass() {
    }

    public ConcreteClass(int intFieldFromAbstractClass) {
        super(intFieldFromAbstractClass);
    }

    @Override
    public int getIntFieldFromAbstractClass() {
        return super.getIntFieldFromAbstractClass();
    }

    @Override
    public void setIntFieldFromAbstractClass(int intFieldFromAbstractClass) {
        super.setIntFieldFromAbstractClass(intFieldFromAbstractClass);
    }

    @Override
    protected void methodFromAbstractClass() {
        System.out.println("Method from concrete class");
    }

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass(55);
        System.out.println(concreteClass.getIntFieldFromAbstractClass());
        concreteClass.methodFromAbstractClass();

    }
}
