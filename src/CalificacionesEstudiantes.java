public class CalificacionesEstudiantes {
        public static void main(String[] args) {
            // Definimos los datos de los estudiantes
            String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
            String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
            double[][] notas = {
                    {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                    {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                    {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                    {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                    {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
            };

            // Mostramos la información de los estudiantes
            mostrarInformacionEstudiantes(estudiantes, materias, notas);

            // Calculamos y mostramos los promedios de cada estudiante
            calcularPromedios(estudiantes, notas);

            // Encontramos y mostramos al estudiante con el promedio más alto
            encontrarMejorEstudiante(estudiantes, notas);

            // Encontramos y mostramos la materia con el promedio más alto
            encontrarMejorMateria(materias, notas);
        }

        public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
            System.out.println("Información de los estudiantes:");
            for (int i = 0; i < estudiantes.length; i++) {
                System.out.print(estudiantes[i] + ": ");
                for (int j = 0; j < materias.length; j++) {
                    System.out.print(materias[j] + "=" + notas[i][j] + "\n    ");
                }
                System.out.println();
            }
        }

        public static void calcularPromedios(String[] estudiantes, double[][] notas) {
            System.out.println("\nPromedios de los estudiantes:");
            for (int i = 0; i < estudiantes.length; i++) {
                double suma = 0;
                for (double nota : notas[i]) suma += nota;
                System.out.println(estudiantes[i] + ": " + suma / notas[i].length);
            }
        }

        public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
            int mejorIndice = 0;
            double mejorPromedio = 0;

            for (int i = 0; i < estudiantes.length; i++) {
                double suma = 0;
                for (double nota : notas[i]) suma += nota;
                double promedio = suma / notas[i].length;

                if (promedio > mejorPromedio) {
                    mejorPromedio = promedio;
                    mejorIndice = i;
                }
            }

            System.out.println("Mejor estudiante: " + estudiantes[mejorIndice] + " con promedio " + mejorPromedio);
        }
        public static void encontrarMejorMateria(String[] materias, double[][] notas) {
            int mejorIndice = 0;
            double mejorPromedio = 0;

            for (int j = 0; j < materias.length; j++) {
                double suma = 0;
                for (double[] nota : notas) suma += nota[j];
                double promedio = suma / notas.length;

                if (promedio > mejorPromedio) {
                    mejorPromedio = promedio;
                    mejorIndice = j;
                }
            }
            System.out.println("Mejor materia: " + materias[mejorIndice] + " con promedio " + mejorPromedio);
        }
    }

