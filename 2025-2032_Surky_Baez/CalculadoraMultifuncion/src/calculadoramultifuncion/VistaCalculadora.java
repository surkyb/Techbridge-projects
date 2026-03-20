package calculadoramultifuncion;



import javax.swing.JOptionPane;


/**
 * Interfaz gráfica de la calculadora.
 * Permite al usuario interactuar con las operaciones.
 * @author Surky
 */
public class VistaCalculadora extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaCalculadora.class.getName());

    /**
     * Creates new form VistaCalculadora
     */
    
    Calculadora cal = new  Calculadora();
    ConversorGrados conversor = new ConversorGrados();
    RaizCuadrada_Exponente sqrtNExponentCalculator = new RaizCuadrada_Exponente();
    
    // variables para la calculadora
    private double numeroIngresado1;
    private double numeroIngresado2;
    private Double resultado;
    private String operacion;
    
    // variables para el cmversor 
    private double celsius;
    private double fahrenheit;
    
    public VistaCalculadora() {
        initComponents();
    }
    
    /**
     * Agrega el número presionado al campo de texto de la calculadora.
     */
    private void ingresarNumeros(String num) { 
        String Nums = txtResult.getText() + num;
        txtResult.setText(Nums);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlCalculadora = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnExponente = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        pnlConversor = new javax.swing.JPanel();
        btnCelciusAFahrenheit = new javax.swing.JButton();
        btnFahrenheit1ACelsius = new javax.swing.JButton();
        txtResultadoConversor = new javax.swing.JTextField();
        txtInputConversor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEstadoConversion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(24, 27, 32));

        jPanel2.setBackground(new java.awt.Color(29, 29, 36));

        pnlCalculadora.setBackground(new java.awt.Color(37, 43, 51));
        pnlCalculadora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black));
        pnlCalculadora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("←");
        btnBack.addActionListener(this::btnBackActionPerformed);
        pnlCalculadora.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 202, 60, 50));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("CE");
        btnClear.addActionListener(this::btnClearActionPerformed);
        pnlCalculadora.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 202, 60, 50));

        btnSumar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSumar.setText("+");
        btnSumar.addActionListener(this::btnSumarActionPerformed);
        pnlCalculadora.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 203, 51, 218));

        btnRaiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRaiz.setText("√");
        btnRaiz.addActionListener(this::btnRaizActionPerformed);
        pnlCalculadora.add(btnRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 139, -1));

        btnExponente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExponente.setText("^");
        btnExponente.addActionListener(this::btnExponenteActionPerformed);
        pnlCalculadora.add(btnExponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 139, -1));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(this::btn2ActionPerformed);
        pnlCalculadora.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 258, 60, 50));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.addActionListener(this::btn5ActionPerformed);
        pnlCalculadora.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 314, 60, 50));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(this::btn6ActionPerformed);
        pnlCalculadora.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 314, 60, 50));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(this::btn1ActionPerformed);
        pnlCalculadora.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 258, 60, 50));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(this::btn4ActionPerformed);
        pnlCalculadora.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 314, 60, 50));

        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(this::btnMultiplicarActionPerformed);
        pnlCalculadora.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 258, 60, 50));

        btnRestar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRestar.setText("-");
        btnRestar.addActionListener(this::btnRestarActionPerformed);
        pnlCalculadora.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 314, 60, 50));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("C");
        btnReset.setToolTipText("");
        btnReset.addActionListener(this::btnResetActionPerformed);
        pnlCalculadora.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 202, 60, 50));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(this::btn3ActionPerformed);
        pnlCalculadora.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 258, 60, 50));

        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMinus.setText("±");
        btnMinus.addActionListener(this::btnMinusActionPerformed);
        pnlCalculadora.add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 202, 60, 50));

        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(this::btn7ActionPerformed);
        pnlCalculadora.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 370, 60, 50));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(this::btn8ActionPerformed);
        pnlCalculadora.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 370, 60, 50));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(this::btn9ActionPerformed);
        pnlCalculadora.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 60, 50));

        btnDividir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(this::btnDividirActionPerformed);
        pnlCalculadora.add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 370, 60, 50));

        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(this::btn0ActionPerformed);
        pnlCalculadora.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 426, 60, 50));

        btnPunto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(this::btnPuntoActionPerformed);
        pnlCalculadora.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 426, 60, 50));

        btnResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnResultado.setText("=");
        btnResultado.addActionListener(this::btnResultadoActionPerformed);
        pnlCalculadora.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 190, 50));

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(34, 38, 44));
        txtResult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtResult.setForeground(new java.awt.Color(255, 255, 255));
        txtResult.addActionListener(this::txtResultActionPerformed);
        txtResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultKeyTyped(evt);
            }
        });
        pnlCalculadora.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 300, 80));

        pnlConversor.setBackground(new java.awt.Color(37, 43, 51));
        pnlConversor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black));

        btnCelciusAFahrenheit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCelciusAFahrenheit.setText("C -> F");
        btnCelciusAFahrenheit.addActionListener(this::btnCelciusAFahrenheitActionPerformed);

        btnFahrenheit1ACelsius.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFahrenheit1ACelsius.setText("F -> C");
        btnFahrenheit1ACelsius.addActionListener(this::btnFahrenheit1ACelsiusActionPerformed);

        txtResultadoConversor.setBackground(new java.awt.Color(34, 38, 44));
        txtResultadoConversor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResultadoConversor.setForeground(new java.awt.Color(255, 255, 255));
        txtResultadoConversor.addActionListener(this::txtResultadoConversorActionPerformed);

        txtInputConversor.setBackground(new java.awt.Color(34, 38, 44));
        txtInputConversor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtInputConversor.setForeground(new java.awt.Color(255, 255, 255));
        txtInputConversor.addActionListener(this::txtInputConversorActionPerformed);
        txtInputConversor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputConversorKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VALOR  A  CONVERTIR : ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RESULTADO : ");

        javax.swing.GroupLayout pnlConversorLayout = new javax.swing.GroupLayout(pnlConversor);
        pnlConversor.setLayout(pnlConversorLayout);
        pnlConversorLayout.setHorizontalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConversorLayout.createSequentialGroup()
                        .addComponent(btnCelciusAFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFahrenheit1ACelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(pnlConversorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtResultadoConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConversorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtInputConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtEstadoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConversorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConversorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConversorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131))))
        );
        pnlConversorLayout.setVerticalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInputConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCelciusAFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFahrenheit1ACelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultadoConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtEstadoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addComponent(pnlConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelciusAFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelciusAFahrenheitActionPerformed
        if(txtInputConversor.getText().trim().length() == 0){
            mostrarErrorSinValor();
        }else{
            celsius = Double.parseDouble(txtInputConversor.getText());
            txtResultadoConversor.setText("");
            txtResultadoConversor.setText(String.valueOf(conversor.celsiusAFarenheit(celsius)));
        }
    }//GEN-LAST:event_btnCelciusAFahrenheitActionPerformed

    private void btnFahrenheit1ACelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheit1ACelsiusActionPerformed
        if(txtInputConversor.getText().trim().length() == 0){
            mostrarErrorSinValor();
        }else{
            fahrenheit = Double.parseDouble(txtInputConversor.getText());
            txtResultadoConversor.setText("");
            txtResultadoConversor.setText(String.valueOf(conversor.fahrenheitACelsius(fahrenheit)));
        }
    }//GEN-LAST:event_btnFahrenheit1ACelsiusActionPerformed

    private void txtResultadoConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoConversorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoConversorActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtResult.setText("");
        numeroIngresado1 = 0;
        numeroIngresado2 = 0;
        operacion = "";
        txtResult.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        if (txtResult.getText().trim().length() == 0) {
            mostrarErrorSinValor();
            return;
        }

        double numero = Double.parseDouble(txtResult.getText());
        double resultado = sqrtNExponentCalculator.calcularRaiz(numero);
        txtResult.setText(String.valueOf(resultado));

    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponenteActionPerformed
        if(txtResult.getText().trim().length() == 0){
            mostrarErrorSinValor();
        }else{
            guardarNumYLimpiar();
            operacion = "^";
            txtResult.requestFocus();
        }
    }//GEN-LAST:event_btnExponenteActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        ingresarNumeros("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        ingresarNumeros("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        ingresarNumeros("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        ingresarNumeros("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        ingresarNumeros("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if(txtResult.getText().trim().length() == 0){
            mostrarErrorSinValor();
        }else{
            guardarNumYLimpiar();
            operacion = "*";
            txtResult.requestFocus();
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        if(txtResult.getText().trim().length() == 0){
            mostrarErrorSinValor();
        }else{
            guardarNumYLimpiar();
            operacion = "-";
            txtResult.requestFocus();
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        if (txtResult.getText().length() > 0) {
            StringBuilder sb = new StringBuilder(txtResult.getText());
            sb.deleteCharAt(txtResult.getText().length() - 1);
            txtResult.setText(sb.toString());
        } 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtResult.setText("");
        txtResult.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        ingresarNumeros("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (txtResult.getText().length() > 0) {
            double nums = Double.parseDouble(String.valueOf(txtResult.getText()));
            nums = nums * (-1);
            txtResult.setText(String.valueOf(nums));
        } else {
            JOptionPane.showMessageDialog(rootPane, "El valor esta vacio o nulo");
            txtResult.requestFocus();
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        ingresarNumeros("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        ingresarNumeros("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        ingresarNumeros("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        if(txtResult.getText().trim().length() == 0){
            mostrarErrorSinValor();
        }else{
            guardarNumYLimpiar();
            operacion = "/";
            txtResult.requestFocus();
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        ingresarNumeros("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (!txtResult.getText().contains(".")) {
            txtResult.setText(txtResult.getText() + btnPunto.getText());
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        if (txtResult.getText().trim().length() == 0) {
            mostrarErrorSinValor();
        } else {
            numeroIngresado2 = Double.parseDouble(txtResult.getText());
            switch (operacion) {
                case "+":
                    resultado = cal.sumar(numeroIngresado1, numeroIngresado2);
                    txtResult.setText(String.valueOf(resultado));
                    break;
                case "-":
                    resultado = cal.restar(numeroIngresado1, numeroIngresado2);
                    txtResult.setText(String.valueOf(resultado));
                    break;
                case "*":
                    resultado = cal.multiplicar(numeroIngresado1, numeroIngresado2);
                    txtResult.setText(String.valueOf(resultado));
                    break;
                case "/":
                    try {
                        resultado = cal.dividir(numeroIngresado1, numeroIngresado2);
                        txtResult.setText(String.valueOf(resultado));
                    } catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                        txtResult.setText("");
                    }
                    break;
                case "^":
                    resultado = sqrtNExponentCalculator.calcularExponente(numeroIngresado1, numeroIngresado2);
                    txtResult.setText(String.valueOf(resultado));
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "No hay valores para realizar la operación");
                    txtResult.setText("");
                    txtResult.requestFocus();
                    break;
            }
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        if(txtResult.getText().trim().length() == 0){
            mostrarErrorSinValor();
        }else{
            guardarNumYLimpiar();
            operacion = "+";
            txtResult.requestFocus();
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        
    }//GEN-LAST:event_txtResultActionPerformed

    private void txtResultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultKeyTyped
        char c = evt.getKeyChar();
        // permitir solo números y punto
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            getToolkit().beep();
            return;
        }

        // evitar más de un punto decimal
        if (c == '.' && txtResult.getText().contains(".")) {
            evt.consume();
            getToolkit().beep();
            return;
        }

        // limitar a 10 caracteres
        if (txtResult.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtResultKeyTyped

    private void txtInputConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputConversorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputConversorActionPerformed

    private void txtInputConversorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputConversorKeyTyped
        char c = evt.getKeyChar();
        // permitir números, punto y signo negativo
        if (!Character.isDigit(c) && c != '.' && c != '-') {
            evt.consume();
            getToolkit().beep();
            return;
        }

        // evitar más de un punto decimal
        if (c == '.' && txtInputConversor.getText().contains(".")) {
            evt.consume();
            getToolkit().beep();
            return;
        }

        // limitar a 10 caracteres
        if (txtInputConversor.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtInputConversorKeyTyped


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaCalculadora().setVisible(true));
    }

    /**
     * Muestra un mensaje si el usuario intenta realizar una operación sin
     * ingresar un número.
     */
    private void mostrarErrorSinValor(){
        JOptionPane.showMessageDialog(rootPane, "No hay valores para realizar la operación");
            txtResult.setText("");
            txtResult.requestFocus();
    }

    /**
     * Guarda el número actual y limpia el campo para ingresar el siguiente
     * valor.
     */
    private void guardarNumYLimpiar(){
        numeroIngresado1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCelciusAFahrenheit;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnExponente;
    private javax.swing.JButton btnFahrenheit1ACelsius;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlCalculadora;
    private javax.swing.JPanel pnlConversor;
    private javax.swing.JLabel txtEstadoConversion;
    private javax.swing.JTextField txtInputConversor;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtResultadoConversor;
    // End of variables declaration//GEN-END:variables
}
