/*
 *  Creates a user panel that allows the user to deposit 
 *  or withdraw money into their account
 */
package main;

import helpers.*;

/**
 *
 * @author neimaykh2021
 */
public class UserAccounts extends javax.swing.JFrame {
    
    
    private In in = new In("Accounts.txt");
    private String[] account, test;
    private String[] input = in.readAllLines();
    private Login login;
    public UserAccounts(Login log) {
        initComponents();
        InsufficientFundsLabel.setVisible(false);
        login = log;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AvailableFundsLabel = new javax.swing.JLabel();
        AmountOfFundsLabel = new javax.swing.JLabel();
        DollarAmountTextField = new javax.swing.JTextField();
        DepositButton = new javax.swing.JButton();
        WithdrawButton = new javax.swing.JButton();
        DollarLabel = new javax.swing.JLabel();
        CentsTextField = new javax.swing.JTextField();
        CentsLabel = new javax.swing.JLabel();
        DotLabel = new javax.swing.JLabel();
        InsufficientFundsLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AvailableFundsLabel.setText("Available Funds");

        AmountOfFundsLabel.setText("$");

        DollarAmountTextField.setText("0");

        DepositButton.setText("Deposit");
        DepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositButtonActionPerformed(evt);
            }
        });

        WithdrawButton.setText("Withdraw");
        WithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawButtonActionPerformed(evt);
            }
        });

        DollarLabel.setText("$");

        CentsTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CentsTextField.setText("0");

        CentsLabel.setText("¢");

        DotLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DotLabel.setText(".");

        InsufficientFundsLabel.setForeground(new java.awt.Color(204, 0, 0));
        InsufficientFundsLabel.setText("Insufficient Funds");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DepositButton)
                                .addGap(83, 83, 83)
                                .addComponent(WithdrawButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DollarLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DollarAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(InsufficientFundsLabel)
                                        .addGap(0, 91, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AvailableFundsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AmountOfFundsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AvailableFundsLabel)
                            .addComponent(AmountOfFundsLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DollarAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DollarLabel)
                                    .addComponent(CentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CentsLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InsufficientFundsLabel))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DotLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositButton)
                    .addComponent(WithdrawButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositButtonActionPerformed
        Integer dollar = Integer.parseInt(account[2])+Integer.parseInt(DollarAmountTextField.getText());
        Integer cents = Integer.parseInt(account[3])+Integer.parseInt(CentsTextField.getText());
        while (cents >= 100){
            dollar++;
            cents-=100;
        }
        account[2] = dollar+"";
        account[3] = cents+"";
        AmountOfFundsLabel.setText("$"+account[2]+" and "+account[3]+"¢");
        InsufficientFundsLabel.setVisible(false);
        DollarAmountTextField.setText("0");
        CentsTextField.setText("0");
        saveAccount();

        
    }//GEN-LAST:event_DepositButtonActionPerformed

    private void WithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawButtonActionPerformed
        Integer dollar = Integer.parseInt(account[2])-Integer.parseInt(DollarAmountTextField.getText());
        Integer cents = Integer.parseInt(account[3])-Integer.parseInt(CentsTextField.getText());
        while (cents < 0){
            dollar--;
            cents+=100;
        }
        if (dollar>=0){
            account[2] = dollar+"";
            account[3] = cents+"";
            AmountOfFundsLabel.setText("$"+account[2]+" and "+account[3]+"¢");
            InsufficientFundsLabel.setVisible(false);
            DollarAmountTextField.setText("0");
            CentsTextField.setText("0");
            saveAccount();
            
        }
        else {
            System.out.println("User has insufficient funds for withdrawal");
            InsufficientFundsLabel.setVisible(true);
            DollarAmountTextField.setText("0");
            CentsTextField.setText("0");
        }
    }//GEN-LAST:event_WithdrawButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        login.setLocation(this.getLocation());
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    public void setAccount(String[] acc){
        account = acc;
        AmountOfFundsLabel.setText("$"+account[2]+" and "+account[3]+"¢");
    }
    
    public void saveAccount(){
        Out out = new Out("Accounts.txt");
        for (int i = 0; i < input.length; i++){
            test = input[i].split(" ");
            if (test[0].equals(account[0])){
                out.println(account[0]+" "+account[1]+" "+account[2]+ " "+account[3]);
            }
            else {
                out.println(input[i]);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountOfFundsLabel;
    private javax.swing.JLabel AvailableFundsLabel;
    private javax.swing.JLabel CentsLabel;
    private javax.swing.JTextField CentsTextField;
    private javax.swing.JButton DepositButton;
    private javax.swing.JTextField DollarAmountTextField;
    private javax.swing.JLabel DollarLabel;
    private javax.swing.JLabel DotLabel;
    private javax.swing.JLabel InsufficientFundsLabel;
    private javax.swing.JButton WithdrawButton;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
