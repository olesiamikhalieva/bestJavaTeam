package hw_16_02_18;

public enum Days {
    SUNDAY("Воскресенье"), MONDAY("понедельник"), TUESDAY("вторник"), WEDNESDAY("среда"), THURSDAY("четверг"), FRIDAY("пятница"), SATURDAY("суббота");

    private String abbriviation;

    Days(String str){
        this.abbriviation = str;
    }

    public String getAbbriviation() {
        return abbriviation;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
