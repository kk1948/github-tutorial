package Propertie_inheritance;

public class BoxPrice extends Boxweight{

    double cost;

    public BoxPrice() {
        super();
        this.cost = -2;
    }

    public  BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
}
