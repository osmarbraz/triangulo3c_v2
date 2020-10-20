
import java.awt.event.ActionListener;

/**
 * Classe da Interface da Janela da Aplicação.
 *
 * @author Osmar de Oliveira Braz Junior
 * @version 1.0
 * @updated 20-ago-2009 19:50:17
 */
public interface IFrmTriangulo {

    public void exibir();

    public void limparCampos();

    public double getBase();

    public double getAltura();

    public void setBase(double base);

    public void setAltura(double altura);

    public void setArea(double area);

    public void setCalcularActionListener(ActionListener listener);

    public void setLimparActionListener(ActionListener listener);

    public void setFecharActionListener(ActionListener listener);

}