package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.CustomerDAO;
import model.DAO.MovieDAO;
import model.entity.Customer;
import view.CustomerInformationView;
import view.MainView;

public class CustomerInformationController implements ActionListener {

    private CustomerInformationView customerInformationView;
    private MovieDAO movieDAO;
    private MainView mainView;
    private CustomerDAO customerDAO;

    public CustomerInformationController(CustomerInformationView customer, MovieDAO movieDAO, MainView mainView, CustomerDAO customerDAO) {
        this.customerInformationView = customer;
        this.customerDAO = customerDAO;
        this.movieDAO = movieDAO;
        this.mainView = mainView;
        this.customerInformationView.addPrincipalListener(this);
        this.mainView.addPrincipalListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == customerInformationView.getBtnSave()) {

            try {
                Customer customer = new Customer(Integer.parseInt(customerInformationView.getTxtAge()),
                        Integer.parseInt((customerInformationView.getTxtDNI())),
                        customerInformationView.getTxtName(),
                        customerInformationView.getTxtLastName(),
                        Integer.parseInt(customerInformationView.getTxtNumberPhone()));
                if (customerDAO.saveCustomer(customer)) {
                    JOptionPane.showMessageDialog(null, "User saved!");
                    visibilidad();
                    customerInformationView.setTxtEditableFalse();

                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error form filled out incorrectly", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void visibilidad() {
        customerInformationView.getBtnNextStage().setVisible(true);
        customerInformationView.getBtnSave().setVisible(false);
    }

}
