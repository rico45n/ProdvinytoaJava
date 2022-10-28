package PoramitrizeALl.igra;

public class StartPlay {
    public static void main(String[] args) {
        Skuler skuler1 = new Skuler("Pip" , 8);
        Skuler skuler2 = new Skuler("Pip2" , 6);

        Skuler skuler3 = new Skuler("Pip3" , 10);
        Skuler skuler4 = new Skuler("Pip4" , 7);



        Student student1 = new Student("Pop" , 17);
        Student student2 = new Student("Pop2" , 20);


        Emploee emploee1 = new Emploee("Zalep" , 34);
        Emploee emploee2 = new Emploee("Zalep" , 24);


        Team<Skuler> teamScull = new Team("Pizduki");
        teamScull.addPartispant(skuler1);
        teamScull.addPartispant(skuler2);

        Team<Student> teamStudent = new Team("Stedentiki");
        teamStudent.addPartispant(student1);
        teamStudent.addPartispant(student2);


        Team<Emploee> teamEmploee = new Team("Vpered");
        teamEmploee.addPartispant(emploee1);
        teamEmploee.addPartispant(emploee2);



        Team<Skuler> teamScull2 = new Team("Pizduki2.0");
        teamScull.addPartispant(skuler3);
        teamScull.addPartispant(skuler4);

        teamScull.playWith(teamScull2);




    }
}
