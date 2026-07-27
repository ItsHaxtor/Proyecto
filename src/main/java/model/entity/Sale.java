package model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sale {

    private String idSale;
    private LocalDate date;
    private List<SaleDetail> details;
    private double totalSale;

    public Sale(String idSale, LocalDate date, double totalSale) {
        this.idSale = idSale;
        this.date = date;
        this.details = new ArrayList<>();
        this.totalSale = totalSale;
    }

    public String getIdSale() {
        return idSale;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<SaleDetail> getDetails() {
        return details;
    }

    public double getTotalSale() {
        return totalSale;
    }

    //método para agregar en el carrito de compras
    public void addDetail(SaleDetail detail) {
        this.details.add(detail);
        //actualizar el total de la Venta
        this.totalSale += detail.getSubtotal();
    }

    public String toCSV() {
        return idSale + "," + date + "," + totalSale;
    }

   

}
