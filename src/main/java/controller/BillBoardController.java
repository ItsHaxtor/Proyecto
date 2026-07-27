/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BillBoardView;
import view.MainView;
import view.TicketShopView;

/**
 *
 * @author maxtor
 */
public class BillBoardController implements ActionListener {

    private BillBoardView billBoardView;
    private TicketShopView ticket;
    private MainView mainView;

    public BillBoardController(BillBoardView billBoardView, TicketShopView ticket, MainView mainView) {
        this.billBoardView = billBoardView;
        this.ticket = ticket;
        this.mainView = mainView;
        this.billBoardView.addPrincipalListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        

    }

}
