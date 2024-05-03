public class Main {

    public static void main(String[] args) {
        // Criando uma instância da classe Katana
        Katana minhaKatana = new Katana("Aço", "Preto", 40); // Katana feita de aço, cor preta, comprimento de 40 polegadas

        // Exibindo informações da katana
        System.out.println("Material da katana: " + minhaKatana.getMaterial());
        System.out.println("Cor da katana: " + minhaKatana.getCor());
        System.out.println("Comprimento da katana: " + minhaKatana.getComprimento() + " polegadas");

        // Empunhando a katana
        minhaKatana.empunhar();

        // Exibindo informações atualizadas da katana
        minhaKatana.exibirInformacoes();

        // Guardando a katana
        minhaKatana.guardar();
    }
}

class Katana {
    private String material;
    private String cor;
    private int comprimento;
    private boolean empunhada;

    public Katana(String material, String cor, int comprimento) {
        this.material = material;
        this.cor = cor;
        this.comprimento = comprimento;
        this.empunhada = false; // Katana inicialmente não está empunhada
    }

    public String getMaterial() {
        return material;
    }

    public String getCor() {
        return cor;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void empunhar() {
        if (!empunhada) {
            System.out.println("Você empunhou a katana.");
            empunhada = true;
        } else {
            System.out.println("A katana já está empunhada.");
        }
    }

    public void guardar() {
        if (empunhada) {
            System.out.println("Você guardou a katana.");
            empunhada = false;
        } else {
            System.out.println("A katana já está guardada.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Material: " + material);
        System.out.println("Cor: " + cor);
        System.out.println("Comprimento: " + comprimento + " polegadas");
        if (empunhada) {
            System.out.println("Status: Empunhada");
        } else {
            System.out.println("Status: Guardada");
        }
    }
}
