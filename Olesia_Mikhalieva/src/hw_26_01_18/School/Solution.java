package hw_26_01_18.School;

    //14 /* Building и School
//1. Расставь правильно наследование между Building(здание) и School(здание школы).
//2. Подумай, объект какого класса должны возвращать методы getSchool и getBuilding.
//3. Измени null на объект класса Building или School.
//*/
    public class Solution
    {
        public static void main(String[] args)
        {
            Building school = getSchool();
            Building shop = getBuilding();
            Building shop1 = getShop();
            System.out.println(school);
            System.out.println(shop);
            System.out.println(shop1);
        }
        public static Building getSchool()
        {
            Building school = new School();
//измените null на объект класса Building или School
            return school;
        }
        public static Building getBuilding()
        {
            Building building = new Building();
//измените null на объект класса Building или School
            return building;
        }

        public static Building getShop()
        {
            Building shop = new Shop();
            return shop;
        }


        static class School extends Building /*Add your code here*/
        {
            @Override
            public String toString()
            {
                return "School";
            }
        }
        static class Shop extends Building{
            @Override
            public String toString() {
                return "shop";
            }
        }
        static class Building /*Add your code here*/
        {
            @Override
            public String toString()
            {
                return "Building";
            }
        }
    }

