package Enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.Sunday);
        today.daysInfo();
    }

}

enum WeekDays{
    Monday("bad") ,
    Tuesday("bad") ,
    Wednesday("so-so") ,
    Thursday("so-so") ,
    Friday("good") ,
    Saturday("great") ,
    Sunday("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    String getMood(){
        return mood;
    }
}



enum WeekDays2{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;


}




class Today{
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo(){
        switch (weekDays){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Idi na raboty!");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Segodny vixodnoi!");
                break;

            default:



        }
      System.out.println("Nastroenie v etot den: " + weekDays.getMood());
    }
}