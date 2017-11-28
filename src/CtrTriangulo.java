
import java.awt.event.ActionEvent;

/**
 * Description of the Class
 *
 * @author Osmar de Oliveira Braz Junior
 * @version 1.0
 * @updated 20-ago-2009 19:50:17
 */
public class CtrTriangulo {

    private IFrmTriangulo visaoFrmTriangulo;

    /**
     * Constructor for the CtrTriangulo object
     */
    public CtrTriangulo() {
        // Instancia a janela
        setVisaoFrmTriangulo(new FrmTriangulo());
        // Define os eventos da Interface	
        defineEventos();
    }

    public void defineEventos() {
        // Associa os eventos aos componentes
        getVisaoFrmTriangulo().setCalcularActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBCalcular_actionPerformed(e);
            }
        }
        );

        getVisaoFrmTriangulo().setLimparActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBLimpar_actionPerformed(e);
            }
        }
        );

        getVisaoFrmTriangulo().setFecharActionListener(
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
        getVisaoFrmTriangulo().exibir();
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBCalcular_actionPerformed(ActionEvent e) {
        // Instancia o objeto triangulo
        EntTriangulo triangulo = new EntTriangulo();
        triangulo.setBase(getVisaoFrmTriangulo().getBase());
        triangulo.setAltura(getVisaoFrmTriangulo().getAltura());
        getVisaoFrmTriangulo().setArea(triangulo.getArea());
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBLimpar_actionPerformed(ActionEvent e) {
        getVisaoFrmTriangulo().limparCampos();
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
     * Gets the visaoFrmTriangulo attribute of the IFrmTriangulo object
     *
     * @return The IFrmTriangulo value
     */
    public IFrmTriangulo getVisaoFrmTriangulo() {
        return visaoFrmTriangulo;
    }

    /**
     * Sets the IFrmTriangulo attribute of the IFrmTriangulo object
     *
     * @param visaoFrmTriangulo The new IFrmTriangulo value
     */
    public void setVisaoFrmTriangulo(IFrmTriangulo visaoFrmTriangulo) {
        this.visaoFrmTriangulo = visaoFrmTriangulo;
    }
}
