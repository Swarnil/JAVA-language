class A {
    void min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];
        System.out.println(min);
    }
}


class testarray{
    public static void main(String[] args) {
        int a[] = {33,3,4,5};
        A ob = new A();
        ob.min(a);
    }
}

