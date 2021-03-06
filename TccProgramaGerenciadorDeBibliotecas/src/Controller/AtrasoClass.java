/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.VisualizarAtrasos;
import java.sql.ResultSet;

/**
 *
 * @author T-Gamer
 */
public class AtrasoClass {

    private ResultSet resultadosDaVisualizacaoDeAtrasos = null;
    private VisualizarAtrasos objetoDaClasseVisualizarAtrasos = new VisualizarAtrasos();

    public ResultSet visualizarTodosOsAtrasos() {
        resultadosDaVisualizacaoDeAtrasos = objetoDaClasseVisualizarAtrasos.visualizarAtrasos();
        return resultadosDaVisualizacaoDeAtrasos;
    }
}
