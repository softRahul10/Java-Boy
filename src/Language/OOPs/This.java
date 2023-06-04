package Language.OOPs;

public class This {
    int var;
    This(int var) {
        this.var = var;
        System.out.println(" This is:- "+this);
    }

    public static void main(String[] args) {
        This t = new This(10);
        System.out.println("object is:- "+t);
    }

}
