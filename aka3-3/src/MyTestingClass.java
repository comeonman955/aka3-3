class MyTestingClass {
    private int data;

    public MyTestingClass(int data) {
        this.data = data;
    }


    @Override
    public int hashCode() {

        return data % 100;
    }
}
