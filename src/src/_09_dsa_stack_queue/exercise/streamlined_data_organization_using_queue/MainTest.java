package _09_dsa_stack_queue.exercise.streamlined_data_organization_using_queue;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        List<HumanManagement> human = new ArrayList<>();
        human.add(new HumanManagement("Cường", 25, true));
        human.add(new HumanManagement("Phương", 27, true));
        human.add(new HumanManagement("Hùng", 25, true));
        human.add(new HumanManagement("Tuyết", 20, false));
        human.add(new HumanManagement("Hiền", 22, false));

        Collections.sort(human);

        Queue<HumanManagement> nam = new LinkedList<>();
        Queue<HumanManagement> nu = new LinkedList<>();
        for (int i = 0; i < human.size(); i++) {
            if (human.get(i).isGender()) {
                nam.add(human.get(i));
            } else {
                nu.add(human.get(i));
            }
        }

        for (int i = 0; i < human.size(); i++) {
            if (!nu.isEmpty()) {
                human.set(i, nu.poll());
            } else {
                human.set(i, nam.poll());
            }
        }
        System.out.println(human);
    }
}

