public class EquacaoSegundoGrau {
    int ax2, bx, c;
    EquacaoSegundoGrau(int ax2, int bx, int c){
        this.ax2 = ax2;
        this.bx = bx;
        this.c = c;
    }
    private int delta(){
        return ((bx*bx) - (4*ax2*c));
    }
    private double x1(){
        return (-bx + Math.sqrt(delta()))/(2*ax2);
    }
    private double x2(){
        return (-bx - Math.sqrt(delta()))/(2*ax2);
    }
    
    
    public String resultado(){
        if(this.delta()<0){
            return "Não existem raízes reais";
        }else if(this.delta()==0){
            return "Existe apenas uma raiz real: " + x1();
        }else{
            //return "Existem duas raízes reais: " + x1() + " e " + x2(); forma concatenando o resultado, mas a forma abaixo é mais elegante, pois formata o resultado para duas casas decimais
            return String.format("Existem duas raízes reais: %.2f e %.2f", x1(), x2());
        }
    }



    public int getAx2(){
        return ax2;
    }
    public int getBx(){
        return bx;
    }
    public int getC(){
        return c;
    }
    public int setAx2(int ax2){
        this.ax2 = ax2;
        return ax2;
    }
    public int setBx(int bx){
        this.bx = bx;
        return bx;
    }
    public int setC(int c){
        this.c = c;
        return c;
    }
}
