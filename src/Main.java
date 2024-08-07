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
        System.out.println("Arreglo invertido: " );
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
            if( arr [i] > mayor ){
                mayor = arr[i];

            }
        }
        return mayor;
    }

    // Método para calcular el promedio
    public static double calcularPromedio(int[] arrgs) {
        int[] num = arrgs ;
        double suma = 0;
        for (int i=0; i<num.length; i++){
            suma += num [i];

        }
        double prom = suma / num.length; 
        return prom;
    }

    // Método para invertir el arreglo
    public static void invertirArreglo(int[] arr) {
        int [] array = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        for (int i = 0; i < array.length/2; i++) {
            int j = array.length-i-1;
            int a = array[i];
            int b = array[j];
            array[i] = b;
            array[j] = a;
        }
        imprimirArreglo(array);
    }

    // Método para ordenar el arreglo (puedes usar el algoritmo de burbuja)
    public static void ordenarArreglo(int[] arr) {
        int a [] = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        for (int x = 0; x < a.length; x++) {
            for (int i = 0; i < a.length-x-1; i++) {
                if(a[i] < a[i+1]){
                    int tmp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tmp;
                }
            }
        }
        imprimirArreglo(a);
    }
}