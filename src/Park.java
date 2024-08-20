public class Park {
    public static class Attractions {
        private String name;
        private String time;
        private double cost;

        public Attractions(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }
        public void printAttInfo(){
            System.out.println(name);
            System.out.println(time);
            System.out.println(cost);
        }
    }
}