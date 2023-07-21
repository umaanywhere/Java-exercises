class TestReturnArray{
    static int[] get()//creating method which returns an array
    {
        return new int[]{10,30,50,90,60};
    }

    public static void main(String args[]){

        int arr[]=get();//calling method which returns an array
        for(int i=0;i<arr.length;i++)//printing the values of an array
            System.out.println(arr[i]);
    }
}