import java.util.ArrayList;
import java.util.List;

public class Student{
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

     public static void ByGroup(List <Student>students){

        List<Student>grup=new ArrayList<>();
        List<Student>grup1=new ArrayList<>();
        for (Student student:students) {
            if (student.getGroup().equals("Java")) {
                grup.add(student);
            } else {
                grup1.add(student);
            }
        }
         System.out.println("\n~~~~~~~~~~~~~ BUL JAKTA JAVA ~~~~~~~~~~~~~~~~~~~\n");
                grup.forEach(System.out::println);
         System.out.println("\n~~~~~~~~~~JAVA SKRIPT~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        grup1.forEach(System.out::println);
         System.out.println("\n~~~~~~~~~~~~~ JASHTARY BUL JAKTA~~~~~~~~~~~\n");




    }public static void sortByAge( List<Student>age){
        List<Student>Stage=new ArrayList<>();
        List <Student>stage=new ArrayList<>();
        for (int i = 0; i <Stage.size() ; i++) {
            if (stage.get(i).getAge()<20);
            Stage.remove(Stage.get(i));
            i--;


            }
        System.out.println("~~~~~~~~~~~ASDFGHJHGF~~~~~~~~~~~~~~`");
        Stage.forEach(System.out::println);


        for (Student studAge:age) {
            if (studAge.getAge()>16&&studAge.getAge()<30) {
                Stage.add(studAge);
            }      }
        Stage.forEach(System.out::println);
            for (Student ages:age) {
                if (ages.getAge() < 16) {
                    stage.add(ages);

                }


                System.out.println("\n~~~~~~~~~~~~~~~~ 16 JASHTAN KICHINELER ~~~~~~~~~~~~~~~\n");
                stage.forEach(System.out::println);
                System.out.println("\n~~~~~~~~~~~~~~ALFAVIT MENEN CHYKKAN ATTAR~~~~~~~~~~~~~\n");


            }

    }public static void sortByName(List<Student>students){

        List<Student>byname=new ArrayList<>();
        for (Student name:students) {
            if (name.getName().contains("A")){
                byname.add(name);

            }

        }
        byname.forEach(System.out::println);



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }



   }
