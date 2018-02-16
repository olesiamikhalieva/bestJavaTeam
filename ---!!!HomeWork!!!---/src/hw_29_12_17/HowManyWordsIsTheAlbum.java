package hw_29_12_17;
public class HowManyWordsIsTheAlbum {
    public static void main(String[] args) {
        String Str = new String("Был и я среди донцов...\n" +
                "Была пора: наш праздник молодой...\n" +
                "В альбом (Гонимый рока самовластьем...)\n" +
                "В альбом (Долго сих листов заветных...)\n" +
                "В альбом А. О. Смирновой\n" +
                "В альбом княжны А. Д. Абамалек\n" +
                "В альбом Павлу Вяземскому\n" +
                "В еврейской хижине лампада...\n" +
                "В крови горит огонь желанья...\n" +
                "В мои осенние досуги...\n" +
                "В начале жизни школу помню я...\n" +
                "В поле чистом серебрится Снег...");

        String [] strings = Str.split("альбом");
        System.out.print("первый способ: ");
        System.out.println(strings.length - 1);

        String [] str = Str.split(" ");
        String str2 = "альбом";
        int i = 0;
        for(int j = 0; j<str.length; j++)
        {
            if(str[j].equals(str2) == true){
                i++;
        }
        }
        System.out.println("второй способ: " + i);
    }
}
