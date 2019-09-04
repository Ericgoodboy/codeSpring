package IOC;

public class Main{
    public static void main(String args[]){
        In2 a = () -> System.out.println("hello word");
        a.s();
    }
}
