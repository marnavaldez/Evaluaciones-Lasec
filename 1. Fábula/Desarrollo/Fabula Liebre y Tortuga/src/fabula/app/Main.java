/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabula.app;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;



/**
 *
 * @author MAR
 */
public class Main extends javax.swing.JFrame {

    private boolean siguienteCarrera = false; //Permite verificar si se trata de  
    //una carrera nueva o la siguiente.
    protected boolean hayGanador = false;
    
    protected int carrerasGanadasLiebre;
    protected int carrerasGanadasTortuga;

    protected int ganador = 0;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/fabula/img/app_logo.png")).getImage());
        this.setLocationRelativeTo(null); //Centra la ventana.
        reestablecerCarrera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        lblPartidasGanadas = new javax.swing.JLabel();
        lblGanesLiebre = new javax.swing.JLabel();
        lblGanador = new javax.swing.JLabel();
        lblTortuga = new javax.swing.JLabel();
        lblLiebre = new javax.swing.JLabel();
        lblSeparador = new javax.swing.JLabel();
        lblPista = new javax.swing.JLabel();
        lblGanesTortuga = new javax.swing.JLabel();
        lblEstadoLiebre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fábula La Liebre y la Tortuga");
        setMinimumSize(new java.awt.Dimension(828, 510));
        setPreferredSize(new java.awt.Dimension(828, 510));
        setSize(new java.awt.Dimension(828, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        btnIniciar.setText("Iniciar Carrera!");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 136, 40));

        lblPartidasGanadas.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblPartidasGanadas.setText("Partidas Ganadas:");
        getContentPane().add(lblPartidasGanadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblGanesLiebre.setFont(new java.awt.Font("Futura", 1, 15)); // NOI18N
        lblGanesLiebre.setText("Liebre: 0");
        getContentPane().add(lblGanesLiebre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblGanador.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanador.setText("Gana la Tortuga!");
        lblGanador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 300, 180, 110));

        lblTortuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fabula/img/tortuga.png"))); // NOI18N
        lblTortuga.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblTortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 60, 70));

        lblLiebre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fabula/img/liebre.png"))); // NOI18N
        getContentPane().add(lblLiebre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, 70));

        lblSeparador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeparador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fabula/img/separador2.png"))); // NOI18N
        lblSeparador.setFocusable(false);
        lblSeparador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSeparador.setIgnoreRepaint(true);
        getContentPane().add(lblSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 0, 40, -1));

        lblPista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fabula/img/fondo.png"))); // NOI18N
        getContentPane().add(lblPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -10, 640, 510));

        lblGanesTortuga.setFont(new java.awt.Font("Futura", 1, 15)); // NOI18N
        lblGanesTortuga.setText("Tortuga: 0");
        getContentPane().add(lblGanesTortuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblEstadoLiebre.setFont(new java.awt.Font("Futura", 1, 15)); // NOI18N
        lblEstadoLiebre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoLiebre.setText("Competidores listos");
        lblEstadoLiebre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 0)));
        lblEstadoLiebre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblEstadoLiebre, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.btnIniciar.setEnabled(false);
        if (siguienteCarrera) {
        reestablecerCarrera(); //Si se trata de la siguiente carrera.
        }
        Competidor liebre = new Competidor(1, "Liebre", 500, 280, 190);
        Competidor tortuga = new Competidor(2, "Tortuga", 1000, 280, 260);

        Carrera carreraLiebre = new Carrera(liebre);
        Carrera carreraTortuga = new Carrera(tortuga);

        carreraLiebre.start();
        carreraTortuga.start();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void reestablecerCarrera() {
        this.lblLiebre.setLocation(280, 190);
        this.lblTortuga.setLocation(280, 260);
        this.lblGanador.setText("");
        this.hayGanador = false;
    }
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel lblEstadoLiebre;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JLabel lblGanesLiebre;
    private javax.swing.JLabel lblGanesTortuga;
    private javax.swing.JLabel lblLiebre;
    private javax.swing.JLabel lblPartidasGanadas;
    private javax.swing.JLabel lblPista;
    private javax.swing.JLabel lblSeparador;
    private javax.swing.JLabel lblTortuga;
    // End of variables declaration//GEN-END:variables

    class Carrera extends Thread {

        private Competidor competidor;
        private int contadorDistracciones = 0;
        private final int distancia = 10;

        ArrayList<Integer> distracciones; //AÑADIR A LOS DIAGRAMAS 

        // Constructor, getter y setter
        public Carrera(Competidor competidor) {
            this.competidor = competidor;

            //Agregando las distracciones a la lista en milisegundos.
            distracciones = new ArrayList();
            distracciones.add(7500); // Jugando
            //Aleatoriamente puede caer en éste indice, en donde simplemente avanza
            distracciones.add(0); 
            distracciones.add(6500); // Durmiendo
            distracciones.add(4000); // Comiendo
            
        }                         
        
        @Override
        public void run() {
            if (this.competidor.getId() == 1) { //Bloque de LA LIEBRE
                //Hace el ciclo a la mitad de de la distancia puesto que dobla la velocidad de la tortuga.
                for (int i = 0; i < (this.distancia / 2); i++) {
                    //Si ya hay ganador, rompe en ciclo y se detiene el avance.
                    if (hayGanador) break;
                    else this.avanzar(competidor.getVelocidad());

                    if (contadorDistracciones < 2) ejecutarDistraccion();
                }
                
                if (!hayGanador) competidorGanador(1,"Liebre"); // La liebre es la ganadora.
                
            } else { //Bloque de LA TORTUGA
                for (int i = 0; i < distancia; i++) {
                    //Si ya hay ganador, rompe en ciclo y se detiene el avance.                    
                    if (hayGanador) break; 
                    else this.avanzar(competidor.getVelocidad());
                }
               
                if (!hayGanador) competidorGanador(2,"Tortuga"); // La tortuga es la ganadora.
            }
        }

        public void ejecutarDistraccion() {
            if (!distracciones.isEmpty()) {
                int i = (int) Math.round(Math.random() * (distracciones.size() - 1));
//                mostrarEstadoDeLiebre(i); // No se implementa en ésta versión de la aplicación.
                esperarMilisegundos(distracciones.get(i));
                distracciones.remove(i);
                contadorDistracciones++;
            }
        }

        private void esperarMilisegundos(int milisegundos) {
            try {
                Thread.sleep(milisegundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // - - - - - - Métodos que intervienen con la interfaz gráfica - - - - - - 
        public void avanzar(int velocidad) {
            esperarMilisegundos(velocidad);
            if (this.competidor.getId() == 1) {
                lblLiebre.setLocation(this.competidor.getPosicionX() + 92,190);
                this.competidor.setPosicionX(this.competidor.getPosicionX() + 92);
            } else {
                lblTortuga.setLocation(this.competidor.getPosicionX() + 46,260);
                this.competidor.setPosicionX(this.competidor.getPosicionX() + 46);
            }
        }
        
        public void competidorGanador(int i, String nombre) {
            hayGanador = true; siguienteCarrera = true;
            //Variables para el mensaje que se muestra al terminar la carrera
            Object[] options = {"Aceptar"};
            Icon icon;
            int aceptar;
            String mensaje = "La " + nombre + " gana la carrera";
            
            if(i == 2)
                mensaje += "\n\nLa liebre decepcionada tras haber perdido, "
                        + "\nhizo un examen de conciencia y reconoció sus errores, " +
                          "\ndescubrió que había perdido por ser presumida y confiada";
            
            icon = (new javax.swing.ImageIcon(getClass().getResource("/fabula/img/"+ nombre.toLowerCase() + ".png")));
            JOptionPane.showOptionDialog(null, mensaje, "Carrera Terminada", JOptionPane.DEFAULT_OPTION, 
            JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
            
            lblGanador.setText("Gana la " + nombre + "!");
            
            if (i == 1){  //Ganó la Liebre
                carrerasGanadasLiebre++;
                lblGanesLiebre.setText("Liebre: " + carrerasGanadasLiebre);
            } else {                      //Ganó la Tortuga
                carrerasGanadasTortuga++;
                lblGanesTortuga.setText("Tortuga: " + carrerasGanadasTortuga);
            }
            btnIniciar.setEnabled(true);
        }
        
//         Se lagguea cuando se ejecuta éste metodo por lo tanto no se implementa en ésta versión.
//        private void mostrarEstadoDeLiebre(int i) {
//            switch(i){
//                case 0: lblEstadoLiebre.setText("La liebre esta comiendo"); break;
//                case 1: lblEstadoLiebre.setText("La liebre esta jugando"); break;
//                case 2: lblEstadoLiebre.setText("La liebre esta noviando"); break;
//                case 3: lblEstadoLiebre.setText("La liebre esta corriendo"); break;
//                case 4: lblEstadoLiebre.setText("La liebre esta durmiendo"); break;
//            }
//        }
    }

}
