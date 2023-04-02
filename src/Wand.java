import java.util.Scanner;

public class Wand {
    private static String Core_Wand;
    private static int NbWand;

    public Wand(String Core_Wand, int NbWand){
        this.Core_Wand = Core_Wand;
        this.NbWand = NbWand;
    }

    public String getCore_Wang(){
        return Core_Wand;
    }

    public int getNbWand() {
        return NbWand;
    }
}
