public class UDPserver {

    public static void main(String[] args) {
        System.out.println("Here is UDP server!");
        UDPserver udpServer = new UDPserver(args[0]);
        UDPserver udpServer2 = new UDPserver();
        System.out.println(udpServer.listeningPort);
        System.out.println(udpServer2.listeningPort);
    }

    // attributs
    protected String listeningPort;

    // constructor
    UDPserver(String listeningPort){
        this.listeningPort = listeningPort;
    }

    // constructor (default)
    UDPserver(){
        this.listeningPort = "32768";
    }

    @Override
    public String toString() {
        return("UDP Server: le port est" + listeningPort);
    }
}
