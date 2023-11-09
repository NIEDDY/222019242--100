// Interface F
interface F {
    void METHDF();
}

class A {
    void AB() {
        System.out.println("Method (AB)");
    }
}

class B extends A {
    public void BA() {
        System.out.println("Method (BA)");
    }
}

class C extends B implements F {
    public void CB() {
        System.out.println("Method (CB)");
    }

    @Override
    public void METHDF() {
        System.out.println("Method (F) from class C (implementing Interface F)");
    }
}

class D extends C {
    public void DC() {
        System.out.println("Method (DC)");
    }
}

public class ExtendMethodImplementInheritance {
    public static void main(String[] args) {
        D dD = new D();
        dD.AB();
        dD.BA();
        dD.CB();
        dD.METHDF();
        dD.DC();
    }
}

    