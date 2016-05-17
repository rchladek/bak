
import java.io.File;
import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
abstract class DrawFactory {

    public DrawFactory() {
    }

    public abstract void setLineColor(Color paint);

    public abstract void drawGeneLine(double x1, double y1, double x2, double y2, int gene);

    public abstract void setLineWidth(double width);

    public abstract void clear();

    void export() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void export(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
