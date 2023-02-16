public class Droid {
        int batteryLevel;
        String name;
        public Droid(String droidName){
            name = droidName;
            batteryLevel = 100;
        }
        public String toString(){
            return "Hello, I'm the droid: " + name;
        }
        public void performTask(String task){
            System.out.println(name + " is performing task: " + task + ".");
            batteryLevel = batteryLevel - 10;
        }
        public void energyReport(){
            System.out.println(name + " battery level is currently "+ batteryLevel);
        }

    }
