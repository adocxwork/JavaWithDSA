import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return this.priority - other.priority; // Min-Heap based on priority
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class p16_CustomObjectsPQ {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.add(new Task("Task1", 3));
        taskQueue.add(new Task("Task2", 1));
        taskQueue.add(new Task("Task3", 2));

        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}



/*
---Output---
Task2 (Priority: 1)
Task3 (Priority: 2)
Task1 (Priority: 3)

*/