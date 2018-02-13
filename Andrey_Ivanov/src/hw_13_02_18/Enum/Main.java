package hw_13_02_18.Enum;

class Main {

    enum Animals {
        LEOPARD("Very fast"),
        BEAR("sleep in winter"),
        WOLF("hunts"),
        DOG("runs after the stick");

        private String description;

        private Animals(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    };
    public static void main(String[] args) {
        for (Animals animals : Animals.values()) {
            System.out.println(animals + " номер индекса " + animals.ordinal() + ":" + animals.getDescription());
        }
        System.out.println("-------------------------");

        Animals s = Animals.valueOf("WOLF");
        System.out.println(s.name());

    }
}
