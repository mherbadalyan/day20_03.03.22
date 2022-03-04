package task5.abstractPackedge;

public abstract class AbstractClass {
    protected int intFieldFromAbstractClass;

    public AbstractClass() {
    }

    public AbstractClass(int intFieldFromAbstractClass) {
        this.intFieldFromAbstractClass = intFieldFromAbstractClass;
    }

    public int getIntFieldFromAbstractClass() {
        return intFieldFromAbstractClass;
    }

    public void setIntFieldFromAbstractClass(int intFieldFromAbstractClass) {
        this.intFieldFromAbstractClass = intFieldFromAbstractClass;
    }

    protected void methodFromAbstractClass(){
        System.out.println("Method from abstract class");
    }
}
