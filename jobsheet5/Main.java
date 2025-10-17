public class Main {
    public static void main(String[] args) {
        //  objek Mac
        Mac macBook = new Mac("MacBook Pro", "Lithium-ion", "Apple", 3200, 16, "M1");
        macBook.tampilMac();

        System.out.println();

        //  objek Windows
        Windows windowsLaptop = new Windows("Windows 10", "Lithium-polymer", "Dell", 2800, 8, "Intel i5");
        windowsLaptop.tampilWindows();  

    }
}
