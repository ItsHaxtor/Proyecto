package lab_1_group_2.boxes;
import lab_1_group_2.boxes.tool.Tool;

public class Box extends Tool {
    int code, weight;
    String brand;
    Tool kindOfTool;
    public Box(int code, int weight, String brand, Tool kindOfTool) {
        super(brand, brand); // Assuming Tool constructor takes name and brand  
        this.code = code;
        this.weight = weight;
        this.brand = brand;
        this.kindOfTool = kindOfTool;
    }
    

}
