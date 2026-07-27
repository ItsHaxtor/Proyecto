package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;
import model.DAO.MovieDAO;
import model.DAO.SaleDAO;
import model.entity.AvailableSeats;
import model.entity.CinemaSeats;
import model.entity.Movie;
import model.entity.Sale;
import model.entity.SaleDetail;
import view.MainView;
import view.TicketShopView;

public class TicketShopController implements ActionListener {

    private MainView mainView;
    private TicketShopView ticket;
    private SaleDAO saleDAO;
    private MovieDAO movieDAO;
    private ArrayList<SaleDetail> movieShop;
    AvailableSeats seatsAvailable;

    public TicketShopController(TicketShopView ticket, MainView mainView, MovieDAO movieDAO, SaleDAO saleDAO) {
        this.ticket = ticket;
        this.movieDAO = movieDAO;
        this.saleDAO = saleDAO;
        this.mainView = mainView;
        movieShop = new ArrayList<>();
        seatsAvailable = new AvailableSeats(8, "Beta");
        this.mainView.addPrincipalListener(this);
        this.ticket.addPrincipalListener(this);
    }

    private void addSale(int amount) {
        String name = ticket.getSelectedMovie().getText();
        int ticketNumber = Integer.parseInt(ticket.getTxtId());
        Movie m = movieDAO.searchMovie(name);
        CinemaSeats c = movieDAO.searchTicket(ticketNumber);
        if (m == null) {
            JOptionPane.showMessageDialog(null, "Movie doesn't exist");
        }
        seatsAvailable.setAvailableSeats(seatsAvailable.getAvailableSeats() - amount);
        SaleDetail detail = new SaleDetail(m, c, amount);
        // calcular el total
        movieShop.add(detail);
        double totalNow = totalShop();
        ticket.SetTotal(totalNow); // imprimir el total en el panel
        // guardar la venta en el archivo
        Sale sale = new Sale(ticket.getTxtId(), LocalDate.now(), totalNow);
        sale.getDetails().add(detail);
        saleDAO.registerSale(sale);

    }

    private double totalShop() {
        double total = 0.0;
        for (SaleDetail d : movieShop) {
            total += d.getSubtotal();
        }
        return total;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((e.getSource() == ticket.getBtnMore())) {
            ticket.getTxtNumberOfTickets().setText(sumador());
        } else if ((e.getSource() == ticket.getBtnLess())) {
            if (Integer.parseInt(ticket.getTxtNumberOfTickets().getText()) > 1) {
                ticket.getTxtNumberOfTickets().setText(restador());
            } else {
                JOptionPane.showMessageDialog(null, "can not select 0 tickets", "Error", JOptionPane.ERROR_MESSAGE);
                ticket.getTxtNumberOfTickets().setText("1");

            }
        } else if ((e.getSource() == ticket.getCmbExperience())) {
            ticket.getTxtI().setText(ticket.generateRoomCode());
            // boton para calcular y guardar informacion

        } else if ((e.getSource() == ticket.getBtnCalculate())) {

            int amount = ticket.getTxtNumberOfTicketsInt();
            if (ticket.getCmbExperience().getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "invalid experience " + seatsAvailable.getAvailableSeats());
            } else if (seatsAvailable.getAvailableSeats() < amount) {
                JOptionPane.showMessageDialog(null, "seats full " + seatsAvailable.getAvailableSeats());
            } else {
                // guardar pelicula en archivo
                Movie m = new Movie(ticket.getSelectedMovie().getText(), 2.50);
                CinemaSeats c = new CinemaSeats(Integer.parseInt(ticket.getTxtId()), (ticket.getCmbExperience().getSelectedItem()).toString(), priceOfSeats(), Integer.parseInt(ticket.getTxtNumberOfTickets().getText()));
                if (movieDAO.saveMovie(m)) {
                    JOptionPane.showMessageDialog(null, "¡saved movie!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error to safe movie ",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (movieDAO.saveTicket(c)) {
                    JOptionPane.showMessageDialog(null, "¡saved ticket!");
                    addSale(amount);
                } else {
                    JOptionPane.showMessageDialog(null, "Error to safe ticket ",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                ticket.getBtnCalculate().setVisible(false);
                ticket.getTxtPurchaseInProgress().setVisible(true);
                ticket.getBtnNextStage().setVisible(true);
                ticket.getBtnMore().setVisible(false);
                ticket.getBtnLess().setVisible(false);
            }

        }
    }

    private double priceOfSeats() {
        double price;
        if ((ticket.getCmbExperience().getSelectedItem()).toString().equals("Vip")) {
            price = 5;
        } else {
            price = 2.50;
        }
        return price;
    }

    private String sumador() {
        int sum = (Integer.parseInt(ticket.getTxtNumberOfTickets().getText()) + 1);
        return Integer.toString(sum);
    }

    private String restador() {
        int rst = (Integer.parseInt(ticket.getTxtNumberOfTickets().getText()) - 1);
        return Integer.toString(rst);
    }


    /*  private double totalCalculator() {
        double total = 0.0;
        for (DetalleVenta d : carritoCompras) {
            total += d.getSubtotal();
        }
        return total;
    }
     */
    
}
