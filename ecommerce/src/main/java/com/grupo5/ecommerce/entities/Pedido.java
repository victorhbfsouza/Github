package com.grupo5.ecommerce.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pedido;
	
	@Column (name = "data_pedido")
	private Date data_pedido;
	
	@Column (name = "data_entrega")
	private Date data_entrega;
	
	@Column (name = "data_envio")
	private Date data_envio;
	
	@Column (name = "status")
	private Boolean status;
	
	@Column (name = "valor_total")
	private BigDecimal valor_total;
	
	@ManyToOne
	@JoinColumn (name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente cliente;
	
	@OneToMany (mappedBy = "pedido")
	private List<Item_Pedido> item_pedidos;

	public Integer getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

	public Date getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}

	public Date getData_envio() {
		return data_envio;
	}

	public void setData_envio(Date data_envio) {
		this.data_envio = data_envio;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public BigDecimal getValor_total() {
		return valor_total;
	}

	public void setValor_total(BigDecimal valor_total) {
		this.valor_total = valor_total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item_Pedido> getItem_pedidos() {
		return item_pedidos;
	}

	public void setItem_pedidos(List<Item_Pedido> item_pedidos) {
		this.item_pedidos = item_pedidos;
	}
	
}