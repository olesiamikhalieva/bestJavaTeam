package ht9_02_02_2018.t3;

import ht9_02_02_2018.t3.Poems.Poem;

public class Reader {
    private static Poem p1 = new Poem("Pushkin", "The wondrous moment of our meeting...\n" +
            "I well remember you appear\n" +
            "Before me like a vision fleeting,\n" +
            "A beauty's angel pure and clear.");
    private static Poem p2 = new Poem("Pushkin","Dear doting sweetheart of my childhood,\n" +
            "Companion of my austere fate!\n" +
            "In the lone house deep in the wild wood\n" +
            "How patiently for me you wait.\n" +
            "Alone beside your window sitting\n" +
            "You wait for me and blame the clock,\n" +
            "While, in your wrinkled hands, your knitting\n" +
            "Fitfully falters to a stop.\n" +
            "Beyond the crumbling gates the pinetrees\n" +
            "Shadow the road you watch so well.\n" +
            "Nameless forebodings, dark anxieties,\n" +
            "Oppress your heart. You cannot tell\n" +
            "What visions haunt you: Now you seem to see...");

    public static void main(String[] args) {
        System.out.println(p1);
        System.out.println(p2);
    }
}
