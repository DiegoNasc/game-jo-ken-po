public record JokenPo( // Os atributos do record sao implicitamente final
        Player user,
        Player IA,
        int rounds
) {
    public void toPlay() {
        System.out.println("\n******* SEJA BEM VINDO(A), " + user.getName() + " *******\n");


    }
}
