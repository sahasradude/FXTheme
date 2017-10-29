/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csseditors;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;

/**
 *
 * @author dhruva
 */
public class CSSUtils {
//    public String toCSS(RadialGradient rg) {
//        /*double fa;
//        double fd;
//        double cx;
//        fa = rg.getFocusAngle();
//        fd = rg.getFocusDistance();
//        cx = rg.getCenterX();
//        cy = rg.getCenterY();
//        */        
//    }    
    public static void main(String[] args) {
        String s;
        RadialGradient rg;
        rg = new RadialGradient(4, 0.4, 0.5, 0.8, 0.5, true, CycleMethod.REFLECT, new Stop(0, Color.CORAL), new Stop(1, Color.DARKGREEN));
        rg.getCycleMethod();
        s = rg.toString();
        System.out.println(s);      
    }
}
