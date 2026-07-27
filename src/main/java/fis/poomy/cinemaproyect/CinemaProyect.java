package fis.poomy.cinemaproyect;

import controller.MainController;
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

public class CinemaProyect {

    public static void main(String[] args) {
        // creando paneles constantes de view
        BillBoardView bill = new BillBoardView();
        CustomerInformationView customerInformationView = new CustomerInformationView();
        CandyShopView candy = new CandyShopView();
        MainView main = new MainView();
        TicketShopView ticket = new TicketShopView();
        FinalBillView finalBillView = new FinalBillView();
        SelectedSeatsView selectedSeatsView = new SelectedSeatsView();
        SynopsisView sinSynopsisView = new SynopsisView();
        CreditsView creditsView = new CreditsView();
        PrincipalView principalView = new PrincipalView();

        // llamando al programa principal
        MainController controller = new MainController(main, bill, candy, ticket,
                customerInformationView, selectedSeatsView, finalBillView,
                sinSynopsisView, creditsView, principalView);
        controller.run();
    }

}
