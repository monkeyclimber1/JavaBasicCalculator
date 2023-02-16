public class Main {

    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Dancing");
        codey.energyReport();
        codey.performTask("Lubricating");
        codey.energyReport();

        Droid Jameson = new Droid("Jameson");
        System.out.println(Jameson);
        Jameson.performTask("Processing");
        Jameson.energyReport();
        
    }
}