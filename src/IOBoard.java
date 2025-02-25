import java.io.Serializable;

interface IOInterface{
    int interfaceMember=4;
    void show();
    void describe();
    default void info(){
        System.out.println("something");
    }
}
abstract class IOBoard {
    String name;
    int numErrors = 0;
    IOBoard(String s) { System.out.println("IOBoard constructor"); name = s;
    }
    final public void anotherError() { numErrors++;
    }
    final public int getNumErrors() { return numErrors;
    }
    abstract public void initialize();
    abstract public void read();
    abstract public void write();
    abstract public void close();
}

class IOSerialBoard extends IOBoard{
    int port;
    public IOSerialBoard(String s, int p) {
        super(s);
        port = p;
        System.out.println("In a Serial Board constructor");

    }

    public void initialize() {
        System.out.println("Serial Board Initialize");
    }

    @Override
    public void read() {
        System.out.println("Serial Board Read");
    }


    @Override
    public void write() {
        System.out.println("Serial Board Write");
    }

    @Override
    public void close() {
        System.out.println("Serial Board Close");
    }
}

class IOEthernetBoard extends IOBoard implements IOInterface {
    long networkAddress;
    IOEthernetBoard(String s,long netAdd) { super(s); networkAddress = netAdd;
        System.out.println("IOEthernetBoard constructor");
    }
    public void initialize() {
        System.out.println("initialize method in IOEthernetBoard");
    }
    public void read() {
        System.out.println("read method in IOEthernetBoard");
    }
    public void write() {
        System.out.println("write method in IOEthernetBoard");
    }
    public void close() {
        System.out.println("close method in IOEthernetBoard");
    }

    @Override
    public void describe() {
        System.out.println(interfaceMember);
    }

    @Override
    public void show() {
    }

}

class BoardMain{
    public static void main(String[] args) {
        IOBoard[] boards = new IOBoard[2];
        boards[0] = new IOSerialBoard("serialBoard",2000);
        boards[1] = new IOEthernetBoard("ethernetBoard",12345);

        for (IOBoard b: boards){
            b.initialize();
            b.read();
            b.anotherError();
            System.out.println(b.getNumErrors());
        }
    }
}
