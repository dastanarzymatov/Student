import java.util.ArrayList;
import java.util.Collections;
import java.util.*;



    public class Main {
    public static void main(String[] args) {
//Student деген класс ачабыз
//Полелерин беребиз (name,age,group)
//ArrayList тузуп 10 студент тузобуз
//Ошол ArrayList ти группасы боюнча фильтрация кылып жаны группанын
//аты менен болуп жаны листке салыныз(Java,JavaScript)
//жашы 16 дан 23 ко чейинки студенттерди жаны листке салыныз.
//Аты "A"тамгасынан башталган студенттерди жаны листке салыныз
//жашы 20 дан кичине студенттерди листтен очурунуз
//Ар бир лист учун озунчо метод тузунуз
//бардык методдорду чакырып консольго маанилерди чыгарыныз

        ArrayList<Student>students=new ArrayList<>();
        students.add(new Student("Dastan",20,"Java"));
        students.add(new Student("Aalambek",20,"Java"));
        students.add(new Student("Nursultan",24,"JavaSkript"));
        students.add(new Student("Jaulanbek",22,"Java"));
        students.add(new Student("Kamchybek",18,"JavaSkript"));
        students.add(new Student("Nurdin",19,"Java"));
        students.add(new Student("Datka",15,"Java"));
        students.add(new Student("Zuli",13,"javaSkript"));
        students.add(new Student("Jetigen",12,"javaSkript"));
        students.add(new Student("Nurtilek",9,"Java"));
        students.add(new Student("Nurmuhammed",21,"Java"));


        Student.ByGroup(students);
        Student.sortByAge(students);
        Student.sortByName(students);


        }

        }







