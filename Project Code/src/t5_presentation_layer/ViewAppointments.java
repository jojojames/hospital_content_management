package t5_presentation_layer;

import t5_domain_logic.Hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 6/1/13
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewAppointments {
    private JPanel viewAppointmentsPanel;
    private JButton backButton;

    JPanel contentPane;
    Hospital hospital;

    public ViewAppointments(JPanel _contentPane, Hospital _hospital) {
        this.contentPane = _contentPane;
        this.hospital = _hospital;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "User Page");
            }
        });
    }

    public JPanel getViewAppointmentsPanel() {
        return viewAppointmentsPanel;
    }

    public void setViewAppointmentsPanel(JPanel viewAppointmentsPanel) {
        this.viewAppointmentsPanel = viewAppointmentsPanel;
    }
}
