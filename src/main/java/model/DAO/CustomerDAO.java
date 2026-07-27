package model.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.entity.Customer;

public class CustomerDAO {

    private File archive;

    public CustomerDAO() {
        archive = new File("Customers.txt");
    }

    public boolean saveCustomer(Customer m) {
        try (FileWriter fw = new FileWriter(archive, true); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(m.toCSV());
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to save Customer (line 28)", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
// list of customers

    public ArrayList<Customer> customersList() {
        ArrayList<Customer> list = new ArrayList<>();
        if (!archive.exists()) {
            return list;
        }
        try (FileReader fr = new FileReader(archive); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                //reconstruir el producto desde el texto del archivo
                if (parts.length == 5) {
                    Customer m = new Customer(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), parts[2], parts[3], Integer.parseInt(parts[4]));
                    list.add(m);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to list movies (line 50)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    public Customer searchCustomer(float dNi) {
        ArrayList<Customer> list = customersList();
        for (Customer c : list) {
            if (c.getDni() == dNi) {
                return c;
            }
        }
        return null;
    }

    public String searchCustomerNamePlusLastName(float dNi) {
        ArrayList<Customer> list = customersList();
        for (Customer c : list) {
            if (c.getDni() == dNi) {
                return c.getName() + " " + c.getLastName();
            }
        }
        return null;
    }

}
