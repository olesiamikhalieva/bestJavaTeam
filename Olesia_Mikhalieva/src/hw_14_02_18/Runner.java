package hw_14_02_18;

public class Runner {
    public static void main(String[] args){
        System.out.println("Translation autumn: "+Season.AUTUMN.getTranslation());
        System.out.println("Spring compare to summer: "+Season.SPRING.compareTo(Season.SUMMER));
        System.out.println("Summer equals to summer: "+Season.SUMMER.equals(Season.SUMMER));
        System.out.println("Get declaring class: "+Season.SUMMER.getDeclaringClass());
        System.out.println("Hashcode spring: "+Season.SPRING.hashCode());
        System.out.println("Spring ordinal: "+Season.SPRING.ordinal());
        System.out.println("Spring name: "+Season.SPRING.name());
        System.out.println("Spring toString: "+Season.SPRING.toString());
        System.out.println("Spring getClass: "+Season.SPRING.getClass());
    }
}
