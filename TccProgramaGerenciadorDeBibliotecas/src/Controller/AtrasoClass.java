/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.VisualizarAtrasos;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author T-Gamer
 */
public class AtrasoClass {

    private ResultSet resultset_visualizaratrasos = null;
    private VisualizarAtrasos visualizaratrasos_objeto = new VisualizarAtrasos();

    public ResultSet visualizarAtrasos() {
        resultset_visualizaratrasos = visualizaratrasos_objeto.visualizarAtrasos();
        return resultset_visualizaratrasos;
    }
}
