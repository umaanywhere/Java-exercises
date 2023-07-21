class NonPrimitiveDataType {
    public static void main(String[] args) {
        // String is  non primitive data type define in Java
        String nonPrimStr = "String is a non primitive data type";
        System.out.println("nonPrimStr = "+ nonPrimStr);
        // Integer is  non primitive data type define in Java
        Integer intVal = new Integer(10);
        System.out.println("intVal = "+ intVal);
        // This class itself is  non primitive data type
        NonPrimitiveDataType np = new NonPrimitiveDataType();
        System.out.println("np = "+ np.toString());
    }
}