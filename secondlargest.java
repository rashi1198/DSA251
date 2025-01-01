public class secondlargest {
    public static void main(String[] args) {

        int arr[] = {-10, -20, -30, -2, -89, -100};
        int largest = arr[0];
        int secondlargest = 100000000;

        findsecondlargestelement(arr,largest, secondlargest);

        System.out.println(findsecondlargestelement(arr,largest, secondlargest));
    }
    public static int findsecondlargestelement(int arr[],int largest, int secondlargest) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            }
            if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest == 100000000 ? -1 : secondlargest;
    }
}

