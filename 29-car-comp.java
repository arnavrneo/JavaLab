class Tyre {
    private String company;

    Tyre (String companyS) {
        this.company = companyS;
    }

    public String getCompany() {
        return this.company;
    }
}

class Engine {
    private int cc;

    Engine (int ccR) {
        this.cc = ccR;
    }

    public int getCc() {
        return this.cc;
    }
}

class Cars {
    private Tyre tyre;
    private Engine engine;

    Cars() {
        this.tyre = new Tyre("Apollo");
        this.engine = new Engine(1200);
    }

    public String getTyre() {
        return tyre.getCompany();
    }

    public int getCC() {
        return engine.getCc();
    }
}

public class CarComp {
    public static void main(String[] args) {
        Cars car = new Cars();
        System.out.println("Tyre company: " + car.getTyre());
        System.out.println("Engine cc: " + car.getCC());
    }
}
