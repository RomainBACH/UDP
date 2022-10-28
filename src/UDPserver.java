public class UDPserver {
    public static void main(String[] args) {
        System.out.println("Here is UDP server!");
        UDPserver udpServer = new UDPserver(8080);
        UDPserver udpServer2 = new UDPserver();

    }
    // attribut
    protected int listeningPort;

    // constructor
    UDPserver(int listeningPort){
        this.listeningPort = listeningPort;
    }

    // constructor (default)
    UDPserver(){
        this.listeningPort = 32768;
    }
}
