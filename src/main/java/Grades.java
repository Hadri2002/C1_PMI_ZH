import java.util.ArrayList;

public class Grades {

    /*(4 pont) Implementálja a Grades osztályt, ami egy hallgató tárgyait és a hozzájuk tartozó félév végi érdemjegyeit
    kezeli (subject, grade). Az osztálynak rendelkeznie kell egy addSubject (új tárgy hozzáadása), egy dropSubject (tárgy leadás)
    és egy getGrades (String formátumban visszaadja a tárgyak neveit és érdemjegyét) metódussal.
     */

    protected ArrayList<String> subjects = new ArrayList<>();
    protected ArrayList<Integer> grades = new ArrayList<>();

    public void addSubject(String subject){
        subjects.add(subject);
        grades.add(0);
    }

    public void dropSubject (String name){
        int index = subjects.indexOf(name);
        subjects.remove(index);
        grades.remove(index);
    }

    public String getGrades(){
        String result = "";

        if(subjects.size() != 0){
            for(int i = 0; i < subjects.size(); i++){

                result += subjects.get(i) + " ";
                if(grades.get(i) != 0) result += grades.get(i);
                else result += "-";
                if(i != subjects.size() - 1) result += "\r\n";

            }


        }

        return result;

        }



}
