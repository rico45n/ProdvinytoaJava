package PoramitrizeALl.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Praticipant> {
    private String name;
    private List<T> list = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPartispant(T praticipant){
        list.add(praticipant);
        System.out.println("V komandu pod imenem : " + name + " vstypaet uchasnik po imeny :" + praticipant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        }else {
            winnerName = team.name;
        }


        System.out.println("Viigrala comanda :" + winnerName);
    }

}
