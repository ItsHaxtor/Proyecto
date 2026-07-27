package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.DAO.CandysDAO;
import model.DAO.CustomerDAO;
import model.DAO.MovieDAO;
import model.DAO.SaleDAO;
import view.BillBoardView;
import view.CandyShopView;
import view.CreditsView;
import view.CustomerInformationView;
import view.FinalBillView;
import view.MainView;
import view.PrincipalView;
import view.SelectedSeatsView;
import view.SynopsisView;
import view.TicketShopView;

public class MainController implements ActionListener {
// views

    private MainView mainView;
    private BillBoardView billBoardView;
    private CandyShopView candyShop;
    private TicketShopView ticket;
    private CustomerInformationView customerInformationView;
    private SelectedSeatsView selectedSeatsView;
    private FinalBillView finalBillView;
    private SynopsisView sinoSynopsisView;
    private PrincipalView principalView;
    private CreditsView creditsView;
    //controlers
    private CustomerInformationController customerInformationController;
    private FinalBillController finalBillController;
    private SelectedSeatsController selectedSeatsController1;
    private TicketShopController ticketShopController;
    private SelectedSeatsController selectedSeatsController;
    private CandyShopController candyShopController;
    //DAOs
    private MovieDAO movieDAO;
    private SaleDAO saleDAO;
    private CustomerDAO customerDAO;
    private CandysDAO candysDAO;

    public MainController(MainView mainView, BillBoardView billBoardView, CandyShopView candyShop,
            TicketShopView ticket, CustomerInformationView customerInformationView, SelectedSeatsView selectedSeatsView, FinalBillView finalBillView, SynopsisView sinoSynopsisView, CreditsView creditsView, PrincipalView principalView) {
        //creacion de paneles constantes para todo el programa
        this.mainView = mainView;
        this.billBoardView = billBoardView;
        this.customerInformationView = customerInformationView;
        this.selectedSeatsView = selectedSeatsView;
        this.candyShop = candyShop;
        this.ticket = ticket;
        this.finalBillView = finalBillView;
        this.sinoSynopsisView = sinoSynopsisView;
        this.creditsView = creditsView;
        this.principalView = principalView;
        //creacion de controladores constantes para todo el programa
        movieDAO = new MovieDAO();
        customerDAO = new CustomerDAO();
        saleDAO = new SaleDAO();
        candysDAO = new CandysDAO();
        customerInformationController = new CustomerInformationController(customerInformationView, movieDAO, mainView, customerDAO);
        ticketShopController = new TicketShopController(ticket, mainView, movieDAO, saleDAO);
        selectedSeatsController = new SelectedSeatsController(selectedSeatsView, mainView);
        finalBillController = new FinalBillController(mainView, customerInformationView, finalBillView, ticket, selectedSeatsView, customerDAO, movieDAO, saleDAO, candyShop);
       candyShopController = new CandyShopController(candyShop, mainView, candysDAO);
        //fin de controladores constantes para todo el programa

        //creacion de listeners cambio entre paneles
        this.mainView.addPrincipalListener(this);
        this.billBoardView.addPrincipalListener(this);
        this.ticket.addPrincipalListener(this);
        this.customerInformationView.addPrincipalListener(this);
        this.selectedSeatsView.addPrincipalListener(this);
        this.finalBillView.addPrincipalListener(this);
        this.sinoSynopsisView.addPrincipalListener(this);
        start();
        //fin de listeners cambio entre paneles
    }

    public void run() {
        mainView.setTitle("FisNema");
        mainView.setLocationRelativeTo(null);
        mainView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // boton para cambiar de billboard a TicketShopView
        if ((e.getSource() == mainView.getBtnBillBoard())) {
            finalBillView.setCleaning();
            billBoardView.getBillBoardPanel().setSize(800, 413);
            billBoardView.getBillBoardPanel().setLocation(0, 0);
            mainView.getMainPanel().removeAll();
            mainView.getMainPanel().add(billBoardView.getBillBoardPanel());
            mainView.getMainPanel().revalidate();
            mainView.getMainPanel().repaint();
        } else if ((e.getSource() == mainView.getBtnCandyShop())) {
            candyShop.getCandyPanel().setSize(800, 413);
            candyShop.getCandyPanel().setLocation(0, 0);
            mainView.getMainPanel().removeAll();
            mainView.getMainPanel().add(candyShop.getCandyPanel());
            mainView.getMainPanel().revalidate();
            mainView.getMainPanel().repaint();
        } else if ((e.getSource() == billBoardView.getBtnMovie1())) {

            if (billBoardView.getCmbMovie().getSelectedItem() == null) {
                JOptionPane.showMessageDialog(billBoardView, "No film has been selected", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ticket.getSelectedMovie().setText((billBoardView.getCmbMovie().getSelectedItem()).toString());
                ticket.getTicketShopPanel().setSize(800, 413);
                ticket.getTicketShopPanel().setLocation(0, 0);
                mainView.getMainPanel().removeAll();
                mainView.getMainPanel().add(ticket.getTicketShopPanel());
                mainView.getMainPanel().revalidate();
                mainView.getMainPanel().repaint();
                //debido a que realmente no cambia de JFrame es necesario inicializar el controlador para que pueda ser escuchado

            }
        } else if ((e.getSource() == ticket.getBtnNextStage())) {
            customerInformationView.getTxtTotal().setText(ticket.getTxtTotal().getText());
            customerInformationView.getTxtSeats().setText(ticket.getTxtNumberOfTickets().getText());
            customerInformationView.getCustomerInformationViewPanel().setSize(800, 413);
            customerInformationView.getCustomerInformationViewPanel().setLocation(0, 0);
            mainView.getMainPanel().removeAll();
            mainView.getMainPanel().add(customerInformationView.getCustomerInformationViewPanel());
            mainView.getMainPanel().revalidate();
            mainView.getMainPanel().repaint();

        } else if (e.getSource() == customerInformationView.getBtnNextStage()) {
            int numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());
            selectedSeatsView.getTxtNumberOfSeats().setText(customerInformationView.getTxtSeats().getText());
            selectedSeatsView.getPnlSelectedSeatsView().setSize(800, 413);
            selectedSeatsView.getPnlSelectedSeatsView().setLocation(0, 0);
            mainView.getMainPanel().removeAll();
            mainView.getMainPanel().add(selectedSeatsView.getPnlSelectedSeatsView());
            mainView.getMainPanel().revalidate();
            mainView.getMainPanel().repaint();

        } else if (e.getSource() == selectedSeatsView.getBtnNextStage()) {
            if ("0".equals(selectedSeatsView.getTxtNumberOfSeats().getText())) {
                finalBillView.getPnlFinalBill().setSize(800, 413);
                finalBillView.getPnlFinalBill().setLocation(0, 0);
                mainView.getMainPanel().removeAll();
                mainView.getMainPanel().add(finalBillView.getPnlFinalBill());
                mainView.getMainPanel().revalidate();
                mainView.getMainPanel().repaint();
            } else {
                JOptionPane.showMessageDialog(null, "There are still seats available to choose from. ");
            }

        } else if (e.getSource() == mainView.getBtnSynopsis()) {
            sinoSynopsisView.getPnlSynopsis().setSize(800, 413);
            sinoSynopsisView.getPnlSynopsis().setLocation(0, 0);
            mainView.getMainPanel().removeAll();
            mainView.getMainPanel().add(sinoSynopsisView.getPnlSynopsis());
            mainView.getMainPanel().revalidate();
            mainView.getMainPanel().repaint();
        } else if (e.getSource() == mainView.getBtnCreditos()) {
            creditsView.getPnlCredits().setSize(800, 413);
            creditsView.getPnlCredits().setLocation(0, 0);
            mainView.getMainPanel().removeAll();
            mainView.getMainPanel().add(creditsView.getPnlCredits());
            mainView.getMainPanel().revalidate();
            mainView.getMainPanel().repaint();

        } else if (e.getSource() == mainView.getBtnLogo()) {
            principalView.getPnlPrincipalView().setSize(800, 413);
            principalView.getPnlPrincipalView().setLocation(0, 0);
            mainView.getMainPanel().removeAll();
            mainView.getMainPanel().add(principalView.getPnlPrincipalView());
            mainView.getMainPanel().revalidate();
            mainView.getMainPanel().repaint();
        }
    }

    private void start() {
        principalView.getPnlPrincipalView().setSize(800, 413);
        principalView.getPnlPrincipalView().setLocation(0, 0);
        mainView.getMainPanel().removeAll();
        mainView.getMainPanel().add(principalView.getPnlPrincipalView());
        mainView.getMainPanel().revalidate();
        mainView.getMainPanel().repaint();
    }
}
