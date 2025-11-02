package jobsheet10;

public class OutputFrame extends javax.swing.JFrame {

    private Biodata biodata;
    
    
    public OutputFrame() {
        initComponents();
        
        // Mengatur default close operation 
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    // Method tambahan 
    public void setBiodata(Biodata biodata) {
        this.biodata = biodata;
        
       
        outputText.setText(biodata.toString());
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea(); // [cite: 331]

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Output Biodata");

        outputText.setColumns(20);
        outputText.setRows(5);
        outputText.setEditable(false); // Sebaiknya di-set false
        jScrollPane1.setViewportView(outputText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputText; // [cite: 331]
    // End of variables declaration                   
}