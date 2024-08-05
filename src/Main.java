    public class Main {
       public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor
        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        // 4. Calcular el promedio
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el arreglo
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido:");
        imprimirArreglo(numeros);

        // 6. Ordenar el arreglo (implementa el método ordenarArreglo)
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] args) {
        for (int num : args) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para encontrar el número mayor
    public static int encontrarMayor(int[] arr) {
        int mayor = arr[0];

        for (int i=0; i<arr.length; i++){
            if( arr [i] > mayor ){ //
                mayor = arr[i];

            }
        }
        return mayor;
    }

    // Método para calcular el promedio
    public static double calcularPromedio(int[] arr) {
        // Implementa este método
        return 0.0;
    }

    // Método para invertir el arreglo
    public static void invertirArreglo(int[] arr) {
        // Implementa este método
    }

    // Método para ordenar el arreglo (puedes usar el algoritmo de burbuja)
    public static void ordenarArreglo(int[] arr) {
        // Implementa este método
    }
}