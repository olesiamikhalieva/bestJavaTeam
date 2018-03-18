package ht18_16_03_18;

public class Runner {
    public static Dictionary [] myDict = new Dictionary[51];
    public static void main(String[] args) {
        setDictionary();
        print_9();
//        print_12();
//        print_9_short();
//        print_12_short();

    }

    public static void setDictionary(){
        myDict[0] = new Dictionary("cat","кот","кэт");
        myDict[1] = new Dictionary("map","карта","мэп");
        myDict[2] = new Dictionary("bed","кровать","бэд");
        myDict[3] = new Dictionary("book","книга","бук");
        myDict[4] = new Dictionary("come","приходить","кам");
        myDict[5] = new Dictionary("do","делать","ду");
        myDict[6] = new Dictionary("drink","пить","дринк");
        myDict[7] = new Dictionary("drive","водить","драйв");
        myDict[8] = new Dictionary("eat","есть","ит");
        myDict[9] = new Dictionary("family","семья","фэмили");
        myDict[10] = new Dictionary("father","отец","фазэ");
        myDict[11] = new Dictionary("food","еда","фуд");
        myDict[12] = new Dictionary("friend","друг","фрэнд");
        myDict[13] = new Dictionary("go","идти","го");
        myDict[14] = new Dictionary("happy","счастье","хаппи");
        myDict[15] = new Dictionary("have","иметь","хэв");
        myDict[16] = new Dictionary("he","он","хи");
        myDict[17] = new Dictionary("help","помощ","хэлп");
        myDict[18] = new Dictionary("his","его","хис");
        myDict[19] = new Dictionary("it","оно","ит");
        myDict[20] = new Dictionary("like","нравиться","лайк");
        myDict[21] = new Dictionary("meet","встречаться","мит");
        myDict[22] = new Dictionary("mother","мама","мазэ");
        myDict[23] = new Dictionary("name","имя","нэйм");
        myDict[24] = new Dictionary("read","читать","рид");
        myDict[25] = new Dictionary("see","видеть","си");
        myDict[26] = new Dictionary("she","она","щи");
        myDict[27] = new Dictionary("sit","сидель","сит");
        myDict[28] = new Dictionary("sleep","спать","слип");
        myDict[29] = new Dictionary("think","думать","синк");
        myDict[30] = new Dictionary("want","хотеть","вант");
        myDict[31] = new Dictionary("draw","рисовать","дро");
        myDict[32] = new Dictionary("paint","краска","пэйнт");
        myDict[33] = new Dictionary("I","я","ай");
        myDict[34] = new Dictionary("child","ребенок","чилд");
        myDict[35] = new Dictionary("flower","цветок","фловэ");
        myDict[36] = new Dictionary("pillow","подушка","пилоу");
        myDict[37] = new Dictionary("willow","ива","вилоу");
        myDict[38] = new Dictionary("red","красный","рэд");
        myDict[39] = new Dictionary("black","черный","блэк");
        myDict[40] = new Dictionary("white","белый","вайт");
        myDict[41] = new Dictionary("green","зеленый","грин");
        myDict[42] = new Dictionary("brown","коричневый","браун");
        myDict[43] = new Dictionary("blue","синий","иду");
        myDict[44] = new Dictionary("rain","дождь","рэин");
        myDict[45] = new Dictionary("rainbow","радуга","рэинбоу");
        myDict[46] = new Dictionary("lion","лев","лайон");
        myDict[47] = new Dictionary("lemon","лимон","лэмон");
        myDict[48] = new Dictionary("dog","собака","дог");
        myDict[49] = new Dictionary("pen","ручка","пэн");
        myDict[50] = new Dictionary("pencil","карандаш","пэнсил");





    }

    public static void print_9(){
        for(int i = 0; i < 3; i++){
            int st1 = (int) (Math.random() * 50);
            int st2 = (int) (Math.random() * 50);
            int st3 = (int) (Math.random() * 50);
            System.out.println(myDict[st1].getWord() + '\t' + '\t' + myDict[st2].getWord() + '\t' + '\t' + myDict[st3].getWord());
            System.out.println(myDict[st1].getTranscript() + '\t' + '\t' + myDict[st2].getTranscript() + '\t' + '\t' + myDict[st3].getTranscript());
            System.out.println(myDict[st1].getTranslate() + '\t' + '\t' + myDict[st2].getTranslate() + '\t' + '\t' + myDict[st3].getTranslate());
            System.out.println();

        }
    }
}
