package org.excel.interfaces;

import java.util.List;

public interface Excel<Model> {

	public final String PATH = "DATA/";

	public List<Model> read();

	public void write(List<Model> models);

}
