package test;

import controllers.EstudianteController;
import models.Estudiante;
import validaciones.ValidTest;

import org.junit.jupiter.api.Test;

import java.util.*;

public class EstudianteControllerTest {

    EstudianteController controller = new EstudianteController();

    static List<Estudiante> crearEstudiantes() {
        return Arrays.asList(
                new Estudiante("Ana Torres", "0101010101", Arrays.asList(8.5, 9.0, 7.5, 10.0, 9.5, 8.0), 0, 0),
                new Estudiante("Luis Luis", "0202020202", Arrays.asList(6.0, 7.5, 8.0, 6.5, 7.0, 6.0), 0, 0),
                new Estudiante("Camila Vera", "0303030303", Arrays.asList(10.0, 10.0, 10.0, 9.5, 9.0, 9.5), 0, 0),
                new Estudiante("Marco Luis Luis", "0202020202", Arrays.asList(8.0, 7.5, 9.0, 8.5, 7.0, 8.0), 0, 0), // Cedula
                // repetida
                new Estudiante("Elena Ruiz", "0404040404", Arrays.asList(5.0, 1.0, 4.5, 6.0, 5.5, 6.5), 0, 0),
                new Estudiante("Carlos Díaz", "0505050505", Arrays.asList(9.5, 1.0, 3.5, 10.0, 10.0, 10.0), 0, 0),
                new Estudiante("Luis  Luis Luis Luis", "0606060606",
                        Arrays.asList(1.0, 2.0, 7.0, 1.0, 7.0, 7.0), 0, 0),
                new Estudiante("Luis  Luis Luis Luis", "0606060602",
                        Arrays.asList(1.0, 2.0, 7.0, 1.0, 7.0, 7.0), 0, 0),
                new Estudiante("Luis  Luis Luis Luis", "0606060603",
                        Arrays.asList(1.0, 2.0, 7.0, 1.0, 7.0, 7.0), 0, 0),
                new Estudiante("Luis  Luis Luis Luis", "0606060604",
                        Arrays.asList(1.0, 2.0, 7.0, 3.0, 7.0, 7.0), 0, 0),
                new Estudiante("Luis  Luis Luis Luis", "0606060605",
                        Arrays.asList(5.0, 2.0, 7.0, 5.0, 7.0, 7.0), 0, 0),

                new Estudiante("Pedro Gómez", "0707070707", Arrays.asList(7.0, 8.0, 9.0, 6.5, 8.5, 7.5), 0, 0),
                new Estudiante("Sofía Martínez", "0808080808", Arrays.asList(9.0, 8.5, 9.5, 10.0, 9.0, 8.0), 0, 0),
                new Estudiante("Javier Pérez", "0909090909", Arrays.asList(6.0, 7.0, 8.0, 7.5, 6.5, 7.0), 0, 0),
                new Estudiante("Valeria Castro", "1010101010", Arrays.asList(8.5, 9.0, 8.0, 9.5, 8.5, 9.0), 0, 0),
                new Estudiante("Mateo Herrera", "1111111111", Arrays.asList(7.5, 8.0, 7.0, 8.5, 7.5, 8.0), 0, 0),
                new Estudiante("Lucía Ríos", "1212121212", Arrays.asList(9.5, 9.0, 8.5, 9.0, 9.5, 10.0), 0, 0),
                new Estudiante("Andrés Molina", "1313131313", Arrays.asList(6.5, 7.0, 6.0, 7.5, 6.5, 7.0), 0, 0),
                new Estudiante("Paula Jiménez", "1414141414", Arrays.asList(8.0, 8.5, 9.0, 8.5, 8.0, 9.0), 0, 0),
                new Estudiante("Diego Vargas", "1515151515", Arrays.asList(7.0, 7.5, 8.0, 7.5, 7.0, 8.0), 0, 0),
                new Estudiante("María López", "1616161616", Arrays.asList(9.0, 9.5, 10.0, 9.5, 9.0, 10.0), 0, 0),
                new Estudiante("Fernando Cruz", "1717171717", Arrays.asList(6.0, 6.5, 7.0, 6.5, 6.0, 7.0), 0, 0),
                new Estudiante("Gabriela Salazar", "1818181818", Arrays.asList(8.5, 9.0, 8.5, 9.0, 8.5, 9.0), 0, 0),
                new Estudiante("Ricardo Paredes", "1919191919", Arrays.asList(7.5, 8.0, 7.5, 8.0, 7.5, 8.0), 0, 0),
                new Estudiante("Carla Mendoza", "2020202020", Arrays.asList(9.0, 9.5, 9.0, 9.5, 9.0, 9.5), 0, 0),
                new Estudiante("Esteban Ortiz", "2121212121", Arrays.asList(6.5, 7.0, 6.5, 7.0, 6.5, 7.0), 0, 0),
                new Estudiante("Natalia Flores", "2222222222", Arrays.asList(8.0, 8.5, 8.0, 8.5, 8.0, 8.5), 0, 0),
                new Estudiante("Tomás Silva", "2323232323", Arrays.asList(7.0, 7.5, 7.0, 7.5, 7.0, 7.5), 0, 0),
                new Estudiante("Isabel Ramírez", "2424242424", Arrays.asList(9.5, 10.0, 9.5, 10.0, 9.5, 10.0), 0, 0),
                new Estudiante("Sebastián León", "2525252525", Arrays.asList(6.0, 6.5, 6.0, 6.5, 6.0, 6.5), 0, 0),
                new Estudiante("Camila Ortega", "2626262626", Arrays.asList(8.5, 9.0, 8.5, 9.0, 8.5, 9.0), 0, 0),
                new Estudiante("Martín Aguirre", "2727272727", Arrays.asList(7.5, 8.0, 7.5, 8.0, 7.5, 8.0), 0, 0),
                new Estudiante("Daniela Peña", "2828282828", Arrays.asList(9.0, 9.5, 9.0, 9.5, 9.0, 9.5), 0, 0),
                new Estudiante("Alejandro Bravo", "2929292929", Arrays.asList(6.5, 7.0, 6.5, 7.0, 6.5, 7.0), 0, 0),
                new Estudiante("Patricia Cedeño", "3030303030", Arrays.asList(8.0, 8.5, 8.0, 8.5, 8.0, 8.5), 0, 0),
                new Estudiante("Felipe Zambrano", "3131313131", Arrays.asList(7.0, 7.5, 7.0, 7.5, 7.0, 7.5), 0, 0),
                new Estudiante("Lorena Castillo", "3232323232", Arrays.asList(9.5, 10.0, 9.5, 10.0, 9.5, 10.0), 0, 0),
                new Estudiante("Hugo Benítez", "3333333333", Arrays.asList(6.0, 6.5, 6.0, 6.5, 6.0, 6.5), 0, 0),
                new Estudiante("Verónica Espinoza", "3434343434", Arrays.asList(8.5, 9.0, 8.5, 9.0, 8.5, 9.0), 0, 0),
                new Estudiante("Samuel Torres", "3535353535", Arrays.asList(7.5, 8.0, 7.5, 8.0, 7.5, 8.0), 0, 0),
                new Estudiante("Mónica Andrade", "3636363636", Arrays.asList(9.0, 9.5, 9.0, 9.5, 9.0, 9.5), 0, 0));
    }

    @Test
    public void testCampoCalculado() {
        for (Estudiante e : crearEstudiantes()) {
            ValidTest.validarCampoCalculado(e, e.getPorcentajeUnicos());
        }
    }

    @Test
    public void testCampoPromedio() {
        for (Estudiante e : crearEstudiantes()) {
            ValidTest.validarCampoCalculadoProm(e.getCalificaciones(), e.getPromedio());
        }
    }

    @Test
    public void testMetodoA() {
        List<Estudiante> estudiantes = crearEstudiantes();
        Set<Estudiante> resultado = controller.ordenarPorPromedio(estudiantes);
        ValidTest.validarMetodoA(resultado, estudiantes);
    }

    @Test
    public void testMetodoB() {
        List<Estudiante> estudiantes = crearEstudiantes();
        Set<Estudiante> ordenados = controller.ordenarPorPromedio(estudiantes);
        Map<String, List<Estudiante>> resultado = controller.clasificarPorPorcentaje(ordenados);
        ValidTest.validarMetodoB(resultado, ordenados);
    }

    @Test
    public void testMetodoC() {
        List<Estudiante> estudiantes = crearEstudiantes();
        List<Estudiante> resultado = controller.obtenerEstudiantesDestacados(estudiantes);
        ValidTest.validarMetodoC(resultado, estudiantes);
    }

    @Test
    public void testMetodoD() {
        List<Estudiante> estudiantes = crearEstudiantes();
        List<Estudiante> listaOrdenada = controller.obtenerEstudiantesDestacados(estudiantes);
        Estudiante resultado = controller.buscarPorNombre(listaOrdenada, "Camila Vera");
        ValidTest.validarMetodoD(resultado, listaOrdenada);
    }
}
