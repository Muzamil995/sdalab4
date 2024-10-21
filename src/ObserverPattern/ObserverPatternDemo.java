package ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

       HexaObserver hexaObserver= new HexaObserver(subject);
        OctalObserver octalObserver= new OctalObserver(subject);
        BinaryObserver binaryObserver=new BinaryObserver(subject);
        hexaObserver.isActive=false;

        System.out.println("First state change: 15");
        subject.setState(15);

        octalObserver.isActive=false;
        hexaObserver.isActive=true;

        System.out.println("Second state change: 25");
        subject.setState(25);
    }
}