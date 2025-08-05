package models;

import java.util.List;

public class Estudiante { 

  private String nombre;
  private String cedula;
  private List<Double> calificaciones;
  private int porcentajeUnicos;
  private int promedio;
  

  public Estudiante(String nombre, String cedula, List<Double> calificaciones, int porcentajeUnicos, int promedio) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.calificaciones = calificaciones;
    this.porcentajeUnicos = porcentajeUnicos;
    this.promedio = promedio;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getCedula() {
    return cedula;
  }
  public void setCedula(String cedula) {
    this.cedula = cedula;
  }
  public List<Double> getCalificaciones() {
    return calificaciones;
  }
  public void setCalificaciones(List<Double> calificaciones) {
    this.calificaciones = calificaciones;
  }
  public int getPorcentajeUnicos() {
    return porcentajeUnicos;
  }
  public void setPorcentajeUnicos(int porcentajeUnicos) {
    this.porcentajeUnicos = porcentajeUnicos;
  }
  public int getPromedio() {
    return promedio;
  }
  public void setPromedio(int promedio) {
    this.promedio = promedio;
  }
  @Override
  public String toString() {
    return "Estudiante [nombre=" + nombre + ", cedula=" + cedula + ", calificaciones=" + calificaciones
        + ", porcentajeUnicos=" + porcentajeUnicos + ", promedio=" + promedio + "]";
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
    result = prime * result + ((calificaciones == null) ? 0 : calificaciones.hashCode());
    result = prime * result + porcentajeUnicos;
    result = prime * result + promedio;
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Estudiante other = (Estudiante) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (cedula == null) {
      if (other.cedula != null)
        return false;
    } else if (!cedula.equals(other.cedula))
      return false;
    if (calificaciones == null) {
      if (other.calificaciones != null)
        return false;
    } else if (!calificaciones.equals(other.calificaciones))
      return false;
    if (porcentajeUnicos != other.porcentajeUnicos)
      return false;
    if (promedio != other.promedio)
      return false;
    return true;
  }

  
  
}
