package controller;

import static java.awt.Color.red;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.CustomerDAO;
import model.DAO.MovieDAO;
import model.DAO.SaleDAO;
import view.CandyShopView;
import view.CustomerInformationView;
import view.FinalBillView;
import view.MainView;
import view.SelectedSeatsView;
import view.TicketShopView;

public class FinalBillController implements ActionListener {

    private MainView mainView;
    private CustomerInformationView customerInformationView;
    private TicketShopView ticketShopView;
    private FinalBillView finalBillView;
    private SelectedSeatsView selectedSeatsView;
    private CandyShopView candyShopView;
    private CustomerDAO customerDAO;
    private MovieDAO movieDAO;
    private SaleDAO saleDAO;

    public FinalBillController(MainView mainView, CustomerInformationView customerInformationView, FinalBillView finalBillView, TicketShopView ticketShopView, SelectedSeatsView selectedSeatsView, CustomerDAO customerDAO, MovieDAO movieDAO, SaleDAO saleDAO, CandyShopView candyShopView) {
        this.mainView = mainView;
        this.customerInformationView = customerInformationView;
        this.finalBillView = finalBillView;
        this.ticketShopView = ticketShopView;
        this.selectedSeatsView = selectedSeatsView;
        this.candyShopView = candyShopView;
        this.customerDAO = customerDAO;
        this.movieDAO = movieDAO;
        this.saleDAO = saleDAO;
        //listenners
        this.mainView.addPrincipalListener(this);
        this.finalBillView.addPrincipalListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == finalBillView.getBtnEndShop()) {
            finalBillView.getTxtCustomer().setText(customerDAO.searchCustomerNamePlusLastName(Float.parseFloat(customerInformationView.getTxtDNI())));
            finalBillView.getTxtDNI().setText(customerInformationView.getTxtDNI());
            finalBillView.getTxtMovie().setText(movieDAO.searchMovieName(ticketShopView.getSelectedMovie().getText()));
            asignarAsientos();
            finalBillView.getTxtDate().setText((saleDAO.searchDate(ticketShopView.getTxtId())).toString());
            finalBillView.getTxtTotal().setText(ticketShopView.getTxtTotal().getText());
            setCleaning();
            

        }
    }
    private void asignarAsientos() {
        if (selectedSeatsView.getColorPnlBtn1().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat1().getText() + ", ");
        }

        if (selectedSeatsView.getColorPnlBtn2().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat2().getText() + ", ");
        }
        if (selectedSeatsView.getColorPnlBtn3().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat3().getText() + ", ");
        }
        if (selectedSeatsView.getColorPnlBtn4().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat4().getText() + ", ");
        }
        if (selectedSeatsView.getColorPnlBtn5().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat5().getText() + ", ");
        }
        if (selectedSeatsView.getColorPnlBtn6().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat6().getText() + ", ");
        }
        if (selectedSeatsView.getColorPnlBtn7().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat7().getText() + ", ");
        }
        if (selectedSeatsView.getColorPnlBtn8().equals(red.darker())) {
            finalBillView.getTxtSeats().setText(finalBillView.getTxtSeats().getText() + selectedSeatsView.getBtnSeat8().getText() + ", ");
        }
    }
    private void setCleaning(){
        ticketShopView.setCleaning();
        customerInformationView.setCleaning();
        candyShopView.Cleaning();
    }

}
