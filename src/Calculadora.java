public class Calculadora {
    private int num1;
    private int num2;

    //Métodos Set
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //Métodos Get
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }

    //Métodos para cada Operação Matemática
    public int adicao(){
        return num1+num2;
    }
    public int subtracao(){
        return num1-num2;
    }
    public int multiplicacao(){
        return num1*num2;
    }
    public float divisao() {
        if (num2 != 0) {
            return num1/num2;
        }
        else{
            System.out.println("Não existe divisão por Zero");
            return -1;
        }
    }
}
