 class Private_Access_Modifiers {
    public static void main(String[] args) {
        A aa = new A();
        aa.setName("Meutyunjay");  // set the private variable
        aa.getName();              // call your method to print it
    }
}

class A {
    private String name;  // private variable

    void setName(String n) {
        name = n;
    }

    void getName() {
        System.out.println(name);
    }
}
