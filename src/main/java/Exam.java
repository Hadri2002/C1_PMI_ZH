public class Exam extends Grades {

    /*(2 pont) Származtasson egy Exam osztályt a Grades osztályból, melynek registGradeToSubject metódusával lehessen
    megadni egy tárgy félév végi érdemjegyét. Ha a hallgató pótvizsgát tett (már volt a tárgyhoz érdemjegy rendelve),
    akkor felül kell írni a régi érdemjegyet az újjal.
     */

    public void registGradeToSubject(String name, int grade){
        for(int i = 0; i < subjects.size(); i++){

            if(subjects.get(i).equals(name)){
                grades.set(i, grade);
            }

        }
    }

}
