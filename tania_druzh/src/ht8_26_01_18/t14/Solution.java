package ht8_26_01_18.t14;

import java.io.BufferedReader;

/* Building и School
1. Расставь правильно наследование между Building(здание) и School(здание школы).
2. Подумай, объект какого класса должны возвращать методы getSchool и getBuilding.
3. Измени null на объект класса Building или School.
*/
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
        Building s;
        s = new School("Kir",15);
        return s;
    }
    public static Building getBuilding()
    {
        Building b = new Building();
        return b;
    }
    static class School extends Building /*Add your code here*/
    {
        private int number;

        public School() {
        }

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
    static class Building /*Add your code here*/
    {
        private String adres;

        public Building() {
        }

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
