/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scribble_version_51_smoothing_version_01;

import javax.swing.SwingUtilities;

//============================================================== 
public class Scribble_Version_51_Smoothing_Version_01 {

    //==========================================================
    // main
    //==========================================================
    public static void main(String[] args) {
        Utils.showAvailableLookAndFeels();
        // on my windws 10 laptop these are available:
        // Metal
        // Nimbus
        // CDE/Motif
        // Windows
        // Windows Classic
        Utils.setPreferenceLookAndFeel(true, "nimbus", "windows classic", "metal");
        SwingUtilities.invokeLater(() -> new Controller());
    }
}




