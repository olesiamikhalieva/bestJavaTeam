package hw__26_01_18.task14BuildingAndSchool;


public class Solution
{
    public static void main(String[] args)
    {
        Building school = getSchool();
        Building shop = getBuilding();
        System.out.println(school);
        System.out.println(shop);
    }
    public static Building getSchool()
    {
        Building school=new School("Titova",25) ;                                   //измените null на объект класса Building или School
        return school;
    }
    public static Building getBuilding()
    {
        Building shop=new Building("Tiotva");               //измените null на объект класса Building или School
        return shop;
    }
    static class School extends Building {
        private int number;

        public School(String adres, int number) {
            super(adres);
            this.number = number;
        }

        @Override
        public String toString()
        {
            return "School";
        }
    }
    static class Building/*Add your code here*/
    {
        private String adres;

        public Building(String adres) {
            this.adres = adres;
        }

        @Override
        public String toString()
        {
            return "Building";
        }
    }
}