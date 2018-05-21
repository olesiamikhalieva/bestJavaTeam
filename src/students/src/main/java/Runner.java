public class Runner {

   private static WriteSqlInsertServiseImpl writeSqlInsertServise;

    public static void main(String[] args) {
        writeSqlInsertServise = new WriteSqlInsertServiseImpl();
        writeSqlInsertServise.writeInsertScript();
    }
}
