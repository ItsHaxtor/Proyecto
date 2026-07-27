package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainView;
import view.SelectedSeatsView;
import static java.awt.Color.red;
import javax.swing.JOptionPane;

public class SelectedSeatsController implements ActionListener {

    private SelectedSeatsView selectedSeatsView;
    private MainView mainView;
    private int numberOfSeats;
    private boolean[] available = {true,true,true,true,true,true,true,true};

    public SelectedSeatsController(SelectedSeatsView selectedSeatsView, MainView mainView) {
        this.selectedSeatsView = selectedSeatsView;
        this.mainView = mainView;
        //listeners
        selectedSeatsView.addPrincipalListener(this);
        mainView.addPrincipalListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//btn 1
        if (e.getSource() == selectedSeatsView.getBtnSeat1()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());
          
            if (selectedSeatsView.getBtnSeat1().isSelected()) {
                if (numberOfSeats > 0 ) {
                    selectedSeatsView.setColorPnlBtn1(red.darker());
                    numberOfSeats -= 1;
                    available[0] = false;
                } else {
                    selectedSeatsView.getBtnSeat1().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat1().isSelected())) {
                selectedSeatsView.setColorPnlBtn1(Color.green.darker());
                numberOfSeats += 1;
                available[0] = true;
                setValue(sumador());
            }
            //btn 2
        } else if (e.getSource() == selectedSeatsView.getBtnSeat2()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());

            if (selectedSeatsView.getBtnSeat2().isSelected()) {
                if (numberOfSeats > 0) {
                    selectedSeatsView.setColorPnlBtn2(red.darker());
                    numberOfSeats -= 1;
                    available[1] = false;
                } else {
                    selectedSeatsView.getBtnSeat2().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat2().isSelected())) {
                selectedSeatsView.setColorPnlBtn2(Color.green.darker());
                numberOfSeats += 1;
                available[1] = true;
                setValue(sumador());
            }
            //btn 3
        } else if (e.getSource() == selectedSeatsView.getBtnSeat3()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());

            if (selectedSeatsView.getBtnSeat3().isSelected()) {
                if (numberOfSeats > 0) {
                    selectedSeatsView.setColorPnlBtn3(red.darker());
                    numberOfSeats -= 1;
                    available[2] = false;
                } else {
                    selectedSeatsView.getBtnSeat3().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat3().isSelected())) {
                selectedSeatsView.setColorPnlBtn3(Color.green.darker());
                numberOfSeats += 1;
                available[2] = true;
                setValue(sumador());
            }
            //btn 4
        } else if (e.getSource() == selectedSeatsView.getBtnSeat4()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());

            if (selectedSeatsView.getBtnSeat4().isSelected()) {
                if (numberOfSeats > 0) {
                    selectedSeatsView.setColorPnlBtn4(red.darker());
                    numberOfSeats -= 1;
                    available[3] = false;
                } else {
                    selectedSeatsView.getBtnSeat4().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat4().isSelected())) {
                selectedSeatsView.setColorPnlBtn4(Color.green.darker());
                numberOfSeats += 1;
                available[3] = true;
                setValue(sumador());
            }
        } //btn 5
        else if (e.getSource() == selectedSeatsView.getBtnSeat5()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());

            if (selectedSeatsView.getBtnSeat5().isSelected()) {
                if (numberOfSeats > 0) {
                    selectedSeatsView.setColorPnlBtn5(red.darker());
                    numberOfSeats -= 1;
                    available[4] = false;
                } else {
                    selectedSeatsView.getBtnSeat5().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat5().isSelected())) {
                selectedSeatsView.setColorPnlBtn5(Color.green.darker());
                numberOfSeats += 1;
                available[4] = true;
                setValue(sumador());
            }
        } //btn 6
        else if (e.getSource() == selectedSeatsView.getBtnSeat6()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());

            if (selectedSeatsView.getBtnSeat6().isSelected()) {
                if (numberOfSeats > 0) {
                    selectedSeatsView.setColorPnlBtn6(red.darker());
                    numberOfSeats -= 1;
                    available[5] = false;
                } else {
                    selectedSeatsView.getBtnSeat6().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat6().isSelected())) {
                selectedSeatsView.setColorPnlBtn6(Color.green.darker());
                numberOfSeats += 1;
                available[5] = true;
                setValue(sumador());
            }
        } //btn 7
        else if (e.getSource() == selectedSeatsView.getBtnSeat7()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());

            if (selectedSeatsView.getBtnSeat7().isSelected()) {
                if (numberOfSeats > 0) {
                    selectedSeatsView.setColorPnlBtn7(red.darker());
                    numberOfSeats -= 1;
                    available[6] = false;
                } else {
                    selectedSeatsView.getBtnSeat7().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat7().isSelected())) {
                selectedSeatsView.setColorPnlBtn7(Color.green.darker());
                numberOfSeats += 1;
                available[6] = true;
                setValue(sumador());
            }
        } //btn 8
        else if (e.getSource() == selectedSeatsView.getBtnSeat8()) {
            numberOfSeats = Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText());

            if (selectedSeatsView.getBtnSeat8().isSelected()) {
                if (numberOfSeats > 0) {
                    selectedSeatsView.setColorPnlBtn8(red.darker());
                    numberOfSeats -= 1;
                    available[7] = false;
                } else {
                    selectedSeatsView.getBtnSeat8().setSelected(false);
                    JOptionPane.showMessageDialog(null, "seating limit reached ");
                    return;
                }

                setValue(restador());
            } else if ((!selectedSeatsView.getBtnSeat8().isSelected())) {
                selectedSeatsView.setColorPnlBtn8(Color.green.darker());
                numberOfSeats += 1;
                available[7] = true;
                setValue(sumador());
            }
        }
    }

    private String restador() {
        int res = (Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText()) - 1);
        return Integer.toString(res);
    }

    private String sumador() {
        int sum = (Integer.parseInt(selectedSeatsView.getTxtNumberOfSeats().getText()) + 1);
        return Integer.toString(sum);
    }

    private void setValue(String numberOfSeats) {
        selectedSeatsView.getTxtNumberOfSeats().setText(numberOfSeats);
    }

}
