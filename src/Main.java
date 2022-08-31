import person.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Иван", " Иванов", 2));
        list.add(new Person("Петр", " Петров", 1));
        list.add(new Person("Сидор", " Сидоров", 3));
        list.add(new Person("Сергей", " Серегин", 1));
        list.add(new Person("Трофим", " Трофимов", 4));
        return list;
    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        for (Person per :
                generateClients()) {
            queue.offer(per);
        }
        while (!queue.isEmpty()) {
            Person per = queue.peek();
            if (per.numTic != 1) {
                per.numTic--;
                queue.offer(per);
            }
            per = queue.poll();
            System.out.println(per.getName() + per.getSurname()
                    + " прокатился на аттракционе");
        }
    }
}
