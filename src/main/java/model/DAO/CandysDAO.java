package model.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.entity.Candys;
import model.entity.Customer;

public class CandysDAO {

    private File archive;

    public CandysDAO() {
        archive = new File("CandyInformation.txt");
    }

    public boolean saveCandy(Candys m) {
        try (FileWriter fw = new FileWriter(archive, true); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(m.toStringDao());
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to save Customer (line 28)", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ArrayList<Candys> CandysList() {
        ArrayList<Candys> list = new ArrayList<>();
        if (!archive.exists()) {
            return list;
        }
        try (FileReader fr = new FileReader(archive); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                //reconstruir el producto desde el texto del archivo
                if (parts.length == 3) {
                    Candys candy = new Candys(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]
                    );
                    list.add(candy);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to list movies (line 50)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    public int searchAmount(String id) {
        ArrayList<Candys> list = CandysList();
        for (Candys c : list) {
            if (c.getId() == id) {
                return c.getAmount();
            }
        }
        return 0;
    }

    public int searchPrice(String id) {
        ArrayList<Candys> list = CandysList();
        for (Candys c : list) {
            if (c.getId() == id) {
                return c.getPrice();
            }
        }
        return 0;
    }

}
