 class NonPrimitiveExample2 {
     int res = 50;

     NonPrimitiveExample2() {
         System.out.println(res);
     }

     int[] arr = new int[5];
      int arr1[] = {1, 2, 3, 4, 5};

     public void add(int a, int b) {
         int c = a + b;
         System.out.println("Addition of numbers: " + c);

     }
 }
    class TestingExample2 {
        public static void main(String[] args) {
            NonPrimitiveExample2 np2 = new NonPrimitiveExample2();
            np2.add(10, 50);
            String g = "learning non primitive data types";
            System.out.println(g);
            int arr1[] = {1, 2, 3, 4, 5};
            System.out.print("Array arr1 elements: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(arr1[i] + " ");
            }
        }
    }


