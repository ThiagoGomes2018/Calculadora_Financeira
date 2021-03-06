package Models;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class CustoProducaoVO {
	private final SimpleIntegerProperty codigo;
	private final SimpleIntegerProperty codigoProduto;
	private final SimpleIntegerProperty tipoCusto;
	private final SimpleStringProperty descricao;
	private final SimpleFloatProperty valorCusto;
	
	public int getCodigo() {
		return codigo.get();
	}
	
	public void setCodigo(int codigo) {
		this.codigo.set(codigo);
	}

	public int getCodigoProduto() {
		return codigoProduto.get();
	}
	
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto.set(codigoProduto);
	}
	
	public int getTipoCusto() {
		return tipoCusto.get();
	}
	
	public void setTipoCusto(int tipoCusto) {
		this.tipoCusto.set(tipoCusto);
	}
	
	public float getValorCusto() {
		return valorCusto.get();
	}
	
	public void setValorCusto(float valorCusto) {
		this.valorCusto.set(valorCusto);
	}
	
	public String getDescricao() {
		return descricao.get();
	}
	
	public void setDescricao(String descricao) {
		this.descricao.set(descricao);
	}
	
	
	public CustoProducaoVO() {
		codigo = new SimpleIntegerProperty(0);
		codigoProduto = new SimpleIntegerProperty(0);
		tipoCusto = new SimpleIntegerProperty(0);
		descricao = new SimpleStringProperty("");
		valorCusto = new SimpleFloatProperty(0);
	}
	
	public CustoProducaoVO(int codigo,int codigoProduto, int tipoCusto,String descricao, float valorCusto) {
		this.codigo = new SimpleIntegerProperty(codigo);
		this.codigoProduto = new SimpleIntegerProperty(codigoProduto);
		this.tipoCusto = new SimpleIntegerProperty(tipoCusto);
		this.descricao = new SimpleStringProperty(descricao);
		this.valorCusto = new SimpleFloatProperty(valorCusto);
	}
	
	@Override
	public String toString() {
	    return this.getDescricao();
	}
}
