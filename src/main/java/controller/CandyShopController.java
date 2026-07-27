package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.CandysDAO;
import model.entity.Candys;
import view.CandyShopView;
import view.MainView;

public class CandyShopController implements ActionListener {

    MainView mainView;
    CandyShopView CandyShopView;
    CandysDAO candyDAO;

    public CandyShopController(CandyShopView CandyShopView, MainView mainView, CandysDAO candysDAO) {
        this.CandyShopView = CandyShopView;
        this.mainView = mainView;
        this.candyDAO = candysDAO;
        this.CandyShopView.addPrincipalListener(this);
        this.mainView.addPrincipalListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == CandyShopView.getSaveBuy()) {
            if (Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()) > 0) {
                Candys candys = new Candys("candy", 2, Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()), CandyShopView.getTxtId());
                candyDAO.saveCandy(candys);
                CandyShopView.getTxtTotal().setText(total());
            } else {
                JOptionPane.showMessageDialog(null, "no estas comprando nada!!");
            }

        } else if (e.getSource() == CandyShopView.getBtnMore1()) {

            CandyShopView.getTxtSelectedCandys().setText(sumador());

        } else if (e.getSource() == CandyShopView.getBtnMore2()) {
            CandyShopView.getTxtSelectedCandys().setText(sumador());

        } else if (e.getSource() == CandyShopView.getBtnMore3()) {
            CandyShopView.getTxtSelectedCandys().setText(sumador());
        } else if (e.getSource() == CandyShopView.getBtnLess1()) {
            if (Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()) > 0) {
                CandyShopView.getTxtSelectedCandys().setText(restador());
            }

        } else if (e.getSource() == CandyShopView.getBtnLess2()) {
            if (Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()) > 0) {
                CandyShopView.getTxtSelectedCandys().setText(restador());
            }

        } else if (e.getSource() == CandyShopView.getBtnLess3()) {
            if (Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()) > 0) {
                CandyShopView.getTxtSelectedCandys().setText(restador());
            }

        }

    }

    private String sumador() {
        int sum = (Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()) + 1);
        return Integer.toString(sum);
    }

    private String total() {
        int total = (Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()) * 2);
        return Integer.toString(total);
    }

    private String restador() {
        int sum = (Integer.parseInt(CandyShopView.getTxtSelectedCandys().getText()) - 1);
        return Integer.toString(sum);
    }

}
