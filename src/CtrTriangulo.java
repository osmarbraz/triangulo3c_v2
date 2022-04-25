
import java.awt.event.ActionEvent;

/**
 * Classe de Controle da Aplicação.
 *
 * @author Osmar de Oliveira Braz Junior
 * @version 1.0
 * @updated 20-ago-2009 19:50:17
 */
public class CtrTriangulo {

    private IFrmTriangulo frmTriangulo;

    /**
     * Construtor para o objeto CtrTriangulo.
     */
    public CtrTriangulo() {
        // Instancia a janela
        setFrmTriangulo(new FrmTriangulo());
        // Define os eventos da Interface	
        defineEventos();
    }

    /**
     * Associa o tratamento de eventos aos componentes.
     */
    public void defineEventos() {
        // Associa os eventos aos componentes
        getFrmTriangulo().setCalcularActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBCalcular_actionPerformed(e);
            }
        }
        );

        getFrmTriangulo().setLimparActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBLimpar_actionPerformed(e);
            }
        }
        );

        getFrmTriangulo().setFecharActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBFechar_actionPerformed(e);
            }
        }
        );
    }

    /**
     * Description of the Method
     */
    public void executar() {
        getFrmTriangulo().exibir();
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBCalcular_actionPerformed(ActionEvent e) {
        // Instancia o objeto triangulo
        EntTriangulo triangulo = new EntTriangulo();
        triangulo.setBase(getFrmTriangulo().getBase());
        triangulo.setAltura(getFrmTriangulo().getAltura());
        double area = triangulo.getArea();
        getFrmTriangulo().setArea(area);
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBLimpar_actionPerformed(ActionEvent e) {
        getFrmTriangulo().limparCampos();
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBFechar_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    /**
     * Gets the frmTriangulo attribute of the IFrmTriangulo object
     *
     * @return The IFrmTriangulo value
     */
    public IFrmTriangulo getFrmTriangulo() {
        return frmTriangulo;
    }

    /**
     * Sets the IFrmTriangulo attribute of the IFrmTriangulo object
     *
     * @param frmTriangulo The new IFrmTriangulo value
     */
    public void setFrmTriangulo(IFrmTriangulo frmTriangulo) {
        this.frmTriangulo = frmTriangulo;
    }
}
