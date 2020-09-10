package com.bolsadeideas.springboot.app.util.pagination;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.result.NoMoreReturnsException;
import org.springframework.data.domain.Page;

public class PageRender<T> {
	private String url;
	private Page<T> page;

	private List<PageItem> paginas;

	private int totalPaginas;
	private int numElementosPorPagina;

	private int paginaActual;

	public PageRender(String url, Page<T> page) {
		this.url = url;
		this.page = page;

		this.numElementosPorPagina = page.getSize();
		this.totalPaginas = page.getTotalPages();

		this.paginas = new ArrayList<PageItem>();

		this.paginaActual = page.getNumber() + 1;

		int desde, hasta;

		if (this.totalPaginas <= this.numElementosPorPagina) {
			desde = 1;
			hasta = totalPaginas;
		} else {
			if (this.paginaActual >= this.totalPaginas - this.numElementosPorPagina / 2) {
				desde = 1;
				hasta = this.numElementosPorPagina;
			} else if (this.paginaActual >= this.totalPaginas - this.numElementosPorPagina / 2) {
				desde = this.totalPaginas - this.numElementosPorPagina + 1;
				hasta = this.numElementosPorPagina;
			} else {
				desde = this.paginaActual - this.numElementosPorPagina / 2;
				hasta = this.numElementosPorPagina;
			}
		}

		for (int i = 0; i < hasta; i++) {
			paginas.add(new PageItem(desde + i, this.paginaActual == desde + 1));
		}
	}

	public String getUrl() {
		return url;
	}

	public List<PageItem> getPaginas() {
		return paginas;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public boolean isLast() {
		return page.isLast();
	}
	
	public boolean isFirst() {
		return page.isFirst();
	}
	
	public boolean isHasPrevius() {
		return page.hasPrevious();
	}
	
	public boolean isHasNext() {
		return page.hasNext();
	}
}
