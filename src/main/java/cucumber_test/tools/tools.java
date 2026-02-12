package cucumber_test.tools;

public class tools {
    public static String ubahSpasiKePlus(String teks) {
        return teks.replace(" ", "+");
    }

    public static void main(String[] args) {
        System.out.println(ubahSpasiKePlus("Ismail Bin Mail"));
        // Output: Ismail+Bin+Mail
    }

    

}
