package model.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.entity.Movie;
import model.entity.Sale;
import model.entity.SaleDetail;

public class SaleDAO {

    private File archiveSales;
    private File archiveDetails;

    public SaleDAO() {
        archiveSales = new File("sales.txt");
        archiveDetails = new File("details.txt");
    }

    public boolean registerSale(Sale v) {
        //guardamos la venta
        try (FileWriter fw = new FileWriter(archiveSales, true); BufferedWriter bw = new BufferedWriter(fw)) {
            String lineaVenta = v.getIdSale() + "," + v.getDate() + "," + v.getTotalSale();
            bw.write(lineaVenta);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error");
            return false;
        }
        //guardar el detalle
        try (FileWriter fw = new FileWriter(archiveDetails, true); BufferedWriter bw = new BufferedWriter(fw)) {
            for (SaleDetail d : v.getDetails()) {
                String detailLine = v.getIdSale() + ","
                        + d.getMovie().getName() + ","
                        + d.getAmountOfTickets() + ","
                        + d.getSubtotal();
                bw.write(detailLine);
                bw.newLine();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    //listar ventas
    public ArrayList<Sale> SalesList() {
        ArrayList<Sale> list = new ArrayList<>();
        if (!archiveSales.exists()) {
            return list;
        }

        try (FileReader fr = new FileReader(archiveSales); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                //reconstruir el producto desde el texto del archivo
                if (parts.length == 3) {
                    Sale m = new Sale(parts[0], LocalDate.parse(parts[1]), Double.parseDouble(parts[2]));
                    list.add(m);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to list movies (line 53)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
 

    public LocalDate searchDate(String idSale) {
        ArrayList<Sale> list = SalesList();
        for (Sale p : list) {
            if (p.getIdSale().equals(idSale)) {
                return p.getDate();
            }
        }
        return null;

    }

}
