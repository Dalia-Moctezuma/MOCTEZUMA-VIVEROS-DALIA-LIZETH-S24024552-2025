public class OperadorPostincremento{
    public static void main(String[] args){
        int variable = 100;
        System.out.println("valor original de la variable=" + variable);
        int postIncrement = variable++;
        System.out.println("postincremento=" + postIncrement);
        System.out.println("variable = " + variable + "\n");
        System.out.println("postIncrement++ = " + postIncrement++);
        System.out.println("postIncrement++ = " + postIncrement++);
        System.out.println("postIncrement++ = " + postIncrement++);
        System.out.println("\npostIncrement = " + postIncrement);
    }
}