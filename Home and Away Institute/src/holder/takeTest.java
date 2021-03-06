package holder;

 


private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); 

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(homeandawayinstituteprototype.HomeAndAwayInstituteApp.class).getContext().getResourceMap(TakeTest.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Take a Test");
        jLabel1.setToolTipText(resourceMap.getString("jLabel1.toolTipText")); 
        jLabel1.setName("jLabel1"); 

        jLabel2.setText("Course"); 
        jLabel2.setName("jLabel2"); 

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setName("jComboBox1"); 
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); 

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setName("jList1"); // NOI18N
        jScrollPane1.setViewportView(jList1);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(homeandawayinstituteprototype.HomeAndAwayInstituteApp.class).getContext().getActionMap(TakeTest.class, this);
        jButton1.setAction(actionMap.get("DoTest")); // NOI18N
        jButton1.setText("Start Test"); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }

private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    DefaultListModel m = new DefaultListModel();

    try {
        if (jComboBox1.getSelectedIndex() == -1) {
            return;
        }

        ArrayList< TestRecord> test = dbtest.getNewTest(currentStudent.getIdNumber(), ((customcombo) jComboBox1.getSelectedItem()).getValue());


        for (final TestRecord item : test) {
        m.addElement(item);

        }



    } catch (Exception ex) {

        JOptionPane.showMessageDialog(this, "An error occurred while attempting to load test records!");

    }
    jList1.setModel(m);


}//GEN-LAST:event_jComboBox1ActionPerformed

    @Action
    public void DoTest() {

        if (jList1.getSelectedIndex() != -1) {

            try {
                TestRecord test = ((TestRecord) jList1.getSelectedValue());
                ArrayList<Question> questions = Coursedb.getTestQuestions(
                        test.getTestid());

                
                if(questions.size()==0)
                {
                
                    JOptionPane.showMessageDialog(this,"This test has no question therefore invalid");
                return;
                }
                
                DoTest t = new DoTest(currentStudent, test, questions);
                t.show();

                t.addWindowListener(new WindowListener() {

                    public void windowOpened(WindowEvent we) {
                    }

                    public void windowClosing(WindowEvent we) {
                    }

                    public void windowClosed(WindowEvent we) {

                        TakeTest.this.show();
                        jComboBox1ActionPerformed(null);

                    }

                    public void windowIconified(WindowEvent we) {
                    }

                    public void windowDeiconified(WindowEvent we) {
                    }

                    public void windowActivated(WindowEvent we) {
                    }

                    public void windowDeactivated(WindowEvent we) {
                    }
                });



            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
                JOptionPane.showMessageDialog(this, "An error occurred while preparing the test!");

            }


        } else {
            JOptionPane.showMessageDialog(this, "Please select a test first!");
        }


    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void reloadCourseTest() {



        try {
            ArrayList<CourseRecord> records = DatabaseLayer.getCoursesByProgram(currentStudent.getProgramCode());
            UtilityClass.Populate(jComboBox1, records);



            if (records.size() > 0) {
                jComboBox1ActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(this, "No course is in your program");
            }



        } catch (Exception ex) {



            JOptionPane.showMessageDialog(this, "An error occurred while attempting to load course records!");

        }


    }
}
