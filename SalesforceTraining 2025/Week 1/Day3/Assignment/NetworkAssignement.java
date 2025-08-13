// Interface
interface Network {
    void connect();
}

class TwoG implements Network {
    public void connect() {
        System.out.println("Connecting to 2G network... Slow speed, basic calling and texting.");
    }
}

class ThreeG implements Network {
    public void connect() {
        System.out.println("Connecting to 3G network... Moderate speed, basic browsing.");
    }
}

class FourG implements Network {
    public void connect() {
        System.out.println("Connecting to 4G network... Fast internet, HD video streaming.");
    }
}

class FiveG implements Network {
    public void connect() {
        System.out.println("Connecting to 5G network... Ultra-fast internet, VR and IoT support.");
    }
}

public class NetworkDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(system.in);

        String networkType = "5G";

//        creating object
        Network network;

        switch (networkType.toUpperCase()) {
            case "2G":
                network = new TwoG();
                break;
            case "3G":
                network = new ThreeG();
                break;
            case "4G":
                network = new FourG();
                break;
            case "5G":
                network = new FiveG();
                break;
            default:
                System.out.println("Invalid network type!");
                return;
        }

        network.connect();
    }
}
