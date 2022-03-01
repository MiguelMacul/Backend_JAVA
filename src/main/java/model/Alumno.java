/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MikeMacuil
 */
public class Alumno extends Persona{
    private String periodoIngreso;
    private String licenciatura;
    private String matricula;

    /**
     * @return the periodoIngreso
     */
    public String getPeriodoIngreso() {
        return periodoIngreso;
    }

    /**
     * @param periodoIngreso the periodoIngreso to set
     */
    public void setPeriodoIngreso(String periodoIngreso) {
        this.periodoIngreso = periodoIngreso;
    }

    /**
     * @return the licenciatura
     */
    public String getLicenciatura() {
        return licenciatura;
    }

    /**
     * @param licenciatura the licenciatura to set
     */
    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
