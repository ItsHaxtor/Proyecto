package lab_1_group_2;
import lab_1_group_2.boxes.Box;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }
    public static void runProgram() {
        Box box1 = new Box(1, 10, "Hammer", "Bosch");
        Box box2 = new Box(2, 15, "Screwdriver", "Stanley");
        System.out.println("Box 1: " + box1.getCode() + ", " + box1.getWeight() + ", " + box1.getKindOfTool() + ", " + box1.getBrand());
        System.out.println("Box 2: " + box2.getCode() + ", " + box2.getWeight() + ", " + box2.getKindOfTool() + ", " + box2.getBrand());
    }
}