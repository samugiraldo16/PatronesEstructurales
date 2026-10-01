package Ejer5;

public class Main {

    public static void main(String[] args) {

        // =========================
        // FACTURA
        // =========================

        FactoryDocumento factoryFactura =
                new FactoryFactura();

        Documento factura =
                factoryFactura.crearDocumento();

        factura.mostrarDocumento();

        System.out.println("-------------------------");


        // =========================
        // CONTRATO
        // =========================

        FactoryDocumento factoryContrato =
                new FactoryContrato();

        Documento contrato =
                factoryContrato.crearDocumento();

        contrato.mostrarDocumento();

        System.out.println("-------------------------");


        // =========================
        // INFORME
        // =========================

        FactoryDocumento factoryInforme =
                new FactoryInforme();

        Documento informe =
                factoryInforme.crearDocumento();

        informe.mostrarDocumento();

        System.out.println("-------------------------");


        // =========================
        // ADAPTER PDF
        // =========================

        BibliotecaPDF bibliotecaPDF =
                new BibliotecaPDF();

        AdapterPDF adapter =
                new AdapterPDF(bibliotecaPDF);

        adapter.convertirAPDF(factura);
    }
}