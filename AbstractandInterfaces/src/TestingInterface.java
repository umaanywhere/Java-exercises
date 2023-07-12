 interface Continent
{
    void showContinent();
}
interface Country extends Continent
{
    void showCountry();
}
interface State extends Country
{
    void showState();
}
 class City implements State {
     public void showContinent() {
         System.out.println("Asia");
     }

     public void showCountry() {
         System.out.println("India");
     }

     public void showState() {
         System.out.println("TamilNadu");
     }

     void showCity() {
         System.out.println("Chennai");
     }
 }
    public class TestingInterface {
        public static void main(String[] args) {
            City c = new City();
            c.showContinent();
            c.showCountry();
            c.showState();
            c.showCity();
        }
    }